package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author Java
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/**
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/**
		 * boolean isFile()
		 * boolean isDirectory()
		 * �жϵ�ǰFile�����ʾ����һ���ļ�
		 * ����һ��Ŀ¼
		 */
		if (dir.isDirectory()) {
			File[] subs = dir.listFiles();
			for (int i = 0; i < subs.length; i++) {
				System.out.println(subs[i].getName());
			}
			System.out.println(subs.length);
		}
	}

}
