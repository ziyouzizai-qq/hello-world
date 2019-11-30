package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 聊天室服务端
 * @author Java
 *
 */
public class Server {
	/**
	 * 运行在服务器的ServerSocket
	 * 有两个作用：
	 * 1：向系统申请服务端口，客户端就是通过
	 * 	  这个端口与服务器程序建立连接的。
	 * 
	 * 2：监听该端口，当客户端通过该端口与服务器
	 *    建立连接时会自动穿件一个Socket。通过
	 *    这个Socket与客户端进行数据交互。
	 */
	private ServerSocket server;
	
	//记录当前客户端的地址信息
	private String host;
	/**
	 * 该数组用于保存所有ClientHandler内部
	 * 对应客户端的输出流，以便广播消息。
	 * 
	 * 由于内部类可以访问其对应外部类的属性，
	 * 对此我们在Server中定义该数组，所有的
	 * 内部类ClientHandler都可以看到它。这样
	 * 将这些ClientHandler需要共享的数据存入
	 * 这个数组即可。
	 */
	//private PrintWriter[] allout = {};
	private Collection<PrintWriter> allout = new ArrayList<PrintWriter>();
	public Server(){
		try {
			/**
			 * 实例化ServerSocket的同时向系统
			 * 申请服务端口，该端口不能与系统
			 * 运行的其他应用程序相同，否则会
			 * 抛出地址被占用的异常
			 */
			System.out.println("正在启动服务器。。。");
			server = new ServerSocket(8088);
			System.out.println("服务器启动完毕！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void start(){
		try {
				/**
				 * ServerSocket有一个重要的方法：
				 * Socket accept()
				 * 该方法是一个阻塞方法，调用后程序就在
				 * 这里"卡住了"，这时开始监听服务端口等
				 * 待客户端的连接。那么当客户端通过端口
				 * 尝试连接时，accept会返回一个Socket，
				 * 通过该Socket就可以与刚建立连接的客户
				 * 端进行交互了
				 */
			while (true) {
				System.out.println("等到客户端连接。。。");
				Socket socket = server.accept();
				System.out.println("一个客户端已连接!");
				//启动一个线程来处理该客户端
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	/**
	 * 该线程任务是与指定的Socket对应的客户端
	 * 进行数据交互
	 * @author Java
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public void run() {
			PrintWriter pw = null;
			try {
				/**
				 * 通过Socket获取输入流，读取客户端发送
				 * 过来的数据
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				/**
				 * 通过Socket获取输出流，给该客户端
				 * 发送消息
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw = new PrintWriter(bw,true);
				
				synchronized (allout) {
					/**
					 * 将当前ClientHandler对应客户端的
					 * 输出流存入到allout数组中。以便其
					 * 他ClientHandler在接收消息后可以
					 * 将消息发送给当前客户端。
					 */
					//1先对allout数组扩容
					//allout = Arrays.copyOf(allout, allout.length + 1);
					//2将当前的pw存入到数组最后一个位置上
					//allout[allout.length - 1] = pw;
					allout.add(pw);
				}
				String message = null;
				while ((message = br.readLine())!=null) {
					System.out.println(host+"说：" + message);
					synchronized (allout) {
					//	pw.println("客户端说：" + message);
					//遍历allout将消息发送给所有客户端
					/*for (int i = 0; i < allout.length; i++) {
						allout[i].println("客户端说：" + message);
					}*/
						for (PrintWriter o : allout) {
							o.println(host+"说：" + message);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//处理客户端断开连接后的操作
				
				synchronized (allout) {
					//将当前客户端的输出流pw从allout数组中删除
					/*for (int i = 0; i < allout.length; i++) {
						if (pw == allout[i]) {
							//将最后一个元素放在这里
							allout[i] = allout[allout.length - 1];
							//缩容
							allout = Arrays.copyOf(allout, allout.length - 1);
							break;
						}
					}*/
					allout.remove(pw);
				}
				//将socket关闭
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		public ClientHandler(Socket socket){
			this.socket = socket;
			/**
			 * 通过Socket获取远端计算机地址
			 * 消息（对于服务端而言，远端就是客户端  ）
			 */
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
	}
}
