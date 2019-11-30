package file;

import java.io.File;

/**
 * 完成方法，实现删除给定File所表示的文件或目录
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/**
	 * 文件直接删除，目录的话要先进入，
	 * 然后再删除
	 * @param f
	 */
	public static void delete(File f) {
		
		if (f.isDirectory()) {
			//先清空该目录
			File[] subs = f.listFiles();
			for (int i = 0; i < subs.length; i++) {
				File sub = subs[i];
				//递归调用
				delete(sub);
			}
		}
		
		f.delete();
		
	}
}
