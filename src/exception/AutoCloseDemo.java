package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7֮���Ƴ���һ�������ԣ�autoclose
 * ����������ڱ���������Զ������������Ĺر�
 * ������
 * @author Java
 *
 */
public class AutoCloseDemo {

	public static void main(String[] args) {
		try (
			/**
			 * ʵ����AutoClaseable��ڵ��������
			 * ���ﶨ�塣���������ջὫ����ı䣬
			 * ��finally�н���ر�
			 */
			FileOutputStream fos = new FileOutputStream("fos.dat");
		){
			fos.write(1);
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
