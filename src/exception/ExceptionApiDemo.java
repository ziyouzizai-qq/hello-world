package exception;
/**
 * �쳣���÷���
 * @author Java
 *
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "A";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//���������Ϣ
			//e.printStackTrace();
			//��ȡ������Ϣ
			System.out.println(e.getMessage());
		}
		System.out.println("���������");

	}

}
