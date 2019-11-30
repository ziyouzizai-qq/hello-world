package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author Java
 *
 */
public class MkDirsDemo {

	public static void main(String[] args) {
		/**
		 * 在当前目录下创建：
		 * a/b/c/d/e/f目录
		 */
		File dir = new File("./a/b/c/d/e/f");
		if (!dir.exists()) {
			/**
			 * mkdir创建目录要求父目录必须存在
			 * mkdirs会将不存在的父目录一同的
			 * 创建出来
			 */
			dir.mkdirs();
			System.out.println("该目录已创建");
		}else {
			System.out.println("该目录已存在");
		}
	}

}
