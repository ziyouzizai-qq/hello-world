package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author Java
 *
 */
public class DeleteDirDemo {

	public static void main(String[] args) {
		/**
		 * ɾ����ǰĿ¼�µ�Ŀ¼
		 */
		File dir = new File("./demo");
		if (dir.exists()) {
			dir.delete();
			System.out.println("ɾ����ϣ�");
		}else {
			System.out.println("Ŀ¼������");
		}
	}

}
