package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author Java
 *
 */
public class MkDirsDemo {

	public static void main(String[] args) {
		/**
		 * �ڵ�ǰĿ¼�´�����
		 * a/b/c/d/e/fĿ¼
		 */
		File dir = new File("./a/b/c/d/e/f");
		if (!dir.exists()) {
			/**
			 * mkdir����Ŀ¼Ҫ��Ŀ¼�������
			 * mkdirs�Ὣ�����ڵĸ�Ŀ¼һͬ��
			 * ��������
			 */
			dir.mkdirs();
			System.out.println("��Ŀ¼�Ѵ���");
		}else {
			System.out.println("��Ŀ¼�Ѵ���");
		}
	}

}
