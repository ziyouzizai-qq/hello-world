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
 * �����ҷ����
 * @author Java
 *
 */
public class Server {
	/**
	 * �����ڷ�������ServerSocket
	 * ���������ã�
	 * 1����ϵͳ�������˿ڣ��ͻ��˾���ͨ��
	 * 	  ����˿�����������������ӵġ�
	 * 
	 * 2�������ö˿ڣ����ͻ���ͨ���ö˿��������
	 *    ��������ʱ���Զ�����һ��Socket��ͨ��
	 *    ���Socket��ͻ��˽������ݽ�����
	 */
	private ServerSocket server;
	
	//��¼��ǰ�ͻ��˵ĵ�ַ��Ϣ
	private String host;
	/**
	 * ���������ڱ�������ClientHandler�ڲ�
	 * ��Ӧ�ͻ��˵���������Ա�㲥��Ϣ��
	 * 
	 * �����ڲ�����Է������Ӧ�ⲿ������ԣ�
	 * �Դ�������Server�ж�������飬���е�
	 * �ڲ���ClientHandler�����Կ�����������
	 * ����ЩClientHandler��Ҫ��������ݴ���
	 * ������鼴�ɡ�
	 */
	//private PrintWriter[] allout = {};
	private Collection<PrintWriter> allout = new ArrayList<PrintWriter>();
	public Server(){
		try {
			/**
			 * ʵ����ServerSocket��ͬʱ��ϵͳ
			 * �������˿ڣ��ö˿ڲ�����ϵͳ
			 * ���е�����Ӧ�ó�����ͬ�������
			 * �׳���ַ��ռ�õ��쳣
			 */
			System.out.println("��������������������");
			server = new ServerSocket(8088);
			System.out.println("������������ϣ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void start(){
		try {
				/**
				 * ServerSocket��һ����Ҫ�ķ�����
				 * Socket accept()
				 * �÷�����һ���������������ú�������
				 * ����"��ס��"����ʱ��ʼ��������˿ڵ�
				 * ���ͻ��˵����ӡ���ô���ͻ���ͨ���˿�
				 * ��������ʱ��accept�᷵��һ��Socket��
				 * ͨ����Socket�Ϳ�����ս������ӵĿͻ�
				 * �˽��н�����
				 */
			while (true) {
				System.out.println("�ȵ��ͻ������ӡ�����");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
				//����һ���߳�������ÿͻ���
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
	 * ���߳���������ָ����Socket��Ӧ�Ŀͻ���
	 * �������ݽ���
	 * @author Java
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		public void run() {
			PrintWriter pw = null;
			try {
				/**
				 * ͨ��Socket��ȡ����������ȡ�ͻ��˷���
				 * ����������
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				/**
				 * ͨ��Socket��ȡ����������ÿͻ���
				 * ������Ϣ
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw = new PrintWriter(bw,true);
				
				synchronized (allout) {
					/**
					 * ����ǰClientHandler��Ӧ�ͻ��˵�
					 * ��������뵽allout�����С��Ա���
					 * ��ClientHandler�ڽ�����Ϣ�����
					 * ����Ϣ���͸���ǰ�ͻ��ˡ�
					 */
					//1�ȶ�allout��������
					//allout = Arrays.copyOf(allout, allout.length + 1);
					//2����ǰ��pw���뵽�������һ��λ����
					//allout[allout.length - 1] = pw;
					allout.add(pw);
				}
				String message = null;
				while ((message = br.readLine())!=null) {
					System.out.println(host+"˵��" + message);
					synchronized (allout) {
					//	pw.println("�ͻ���˵��" + message);
					//����allout����Ϣ���͸����пͻ���
					/*for (int i = 0; i < allout.length; i++) {
						allout[i].println("�ͻ���˵��" + message);
					}*/
						for (PrintWriter o : allout) {
							o.println(host+"˵��" + message);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				
				synchronized (allout) {
					//����ǰ�ͻ��˵������pw��allout������ɾ��
					/*for (int i = 0; i < allout.length; i++) {
						if (pw == allout[i]) {
							//�����һ��Ԫ�ط�������
							allout[i] = allout[allout.length - 1];
							//����
							allout = Arrays.copyOf(allout, allout.length - 1);
							break;
						}
					}*/
					allout.remove(pw);
				}
				//��socket�ر�
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
			 * ͨ��Socket��ȡԶ�˼������ַ
			 * ��Ϣ�����ڷ���˶��ԣ�Զ�˾��ǿͻ���  ��
			 */
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
	}
}
