package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author Java
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/**
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		/**
		 * boolean isFile()
		 * boolean isDirectory()
		 * 判断当前File对象表示的是一个文件
		 * 还是一个目录
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
