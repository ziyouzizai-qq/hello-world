package exception;
/**
 * finally��
 * finally���쳣������Ƶ����һ�飬����ֱ��
 * ����try֮��������һ��catch֮��
 * finally����ȷ��ֻҪ�������е�try������
 * ��ô�����Ƿ��׳��쳣��finally�еĴ���ض�
 * ִ�С�
 * 
 * @author Java
 *
 */
public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "";
			System.out.println(str.length());
			throw new Exception();
//			return;
		} catch (Exception e) {
			System.out.println("������");
		} finally {
			System.out.println("finally��");
		}
		System.out.println("���������");
	}

}
