package file;

import java.io.File;
import java.io.FileFilter;

/**
 * ListFiles提供了一个重载的方法，可以指定
 * 一个文件过滤器(FilesFilter)，然后将满足该
 * 过滤器要求的子项返回
 * @author Java
 *
 */
public class ListFileDemo2 {

	public static void main(String[] args) {
		/**
		 *获取当前目录中名字以"."开头的子项 
		 */
		File dir = new File(".");
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("正在过滤："+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}

}
