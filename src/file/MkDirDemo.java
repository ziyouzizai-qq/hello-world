package file;

import java.io.File;

/**
 * ����һ��Ŀ¼
 * @author Java
 *
 */
public class MkDirDemo {

	public static void main(String[] args) {
		/**
		 * �ڵ�ǰĿ¼�д���һ����Ϊdemo��Ŀ¼
		 */
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("��Ŀ¼�Ѵ���");
		}else {
			System.out.println("��Ŀ¼�Ѵ���");
		}
	}

}
