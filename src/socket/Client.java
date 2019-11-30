package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 * @author Java
 *
 */
public class Client {
	/**
	 * java.net.Socket
	 * Socket��װ��TCPЭ���ͨѶϸ�ڣ�ʹ��
	 * 
	 * 
	 * ���̳���Ϊͨ���������Ķ�д�����Զ��
	 * ����������ݽ�����
	 * Socket�ı��ط���Ϊ���׽���
	 */
	private Socket socket;
	
	public Client(){
		 try {
			 /**
			  * ʵ����Socket��ͬʱ��Ҫ��������
			  * ����;
			  * 1����������IP��ַ
			  * 2����������ʹ�õĶ˿ں�
			  * 
			  * ͨ��IP��ַ�����ҵ�����˵ļ����
			  * ͨ���˿ڿ������ӵ������ڷ�������
			  * ����ϵķ����Ӧ�ó��򡣶��ҿ�
			  * ���������IP�Ͷ˿�����ָ����ϵͳ
			  * �����һ���˿ڣ��������Ӻ�ᷢ��
			  * ������ˡ�
			  * 
			  * ʵ����Socket�Ĺ��̾��Ƿ�������
			  * �Ĺ��̣��������û����Ӧ������
			  * ��ֱ���׳��쳣
			  * 
			  * 127.0.0.1��localhost�������ڱ�ʾ
			  * ������IP��ַ
			  * 192.168.0.211
			  */
			 System.out.println("�������ӷ�����������");
			 socket = new Socket("192.168.0.79",8088);
			 System.out.println("�����ӷ�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void start(){
			try {
				//����һ���߳�������ȡ��������Ϣ
				ServerHandler handler = new ServerHandler();
				Thread t = new Thread(handler);
				t.start();
				Scanner sc = new Scanner(System.in);
				/**
				 * Socket�ṩ�ķ�����
				 * OutputStream getOutputStream()
				 * ����һ���ֽ��������ͨ���������
				 * д�����������ջᷢ�͸������
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				PrintWriter pw = new PrintWriter(bw, true);//pw��true����Ϊ�����Զ���ˢ�¹���
				
				
				
				/*Thread w = new Thread(){
					public void run(){
						while (true) {
							line = sc.nextLine();
							pw.println(line);
						}
					}
				};
				Thread r = new Thread(){
					public void run(){
						while (true) {
							try {
								line = br.readLine();
							} catch (Exception e) {
								e.printStackTrace();
							}
							System.out.println(line);
						}
					}
				};*/
				//w.start();
				//r.start();
				String line = null;
				while (true) {
					line = sc.nextLine();
					//println()�����Զ�flush()
					pw.println(line);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	/**
	 * ���̸߳���ѭ�����շ���˷��͹�����
	 * ��Ϣ��������ͻ��˵Ŀ���̨
	 * @author Java
	 *
	 */
	private class ServerHandler implements Runnable{
		public void run(){
			try {
				/**
				 * ͨ��Socket��ȡ����������ȡ�����
				 * ����������Ϣ
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String line = null;
				while ((line=br.readLine())!=null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
