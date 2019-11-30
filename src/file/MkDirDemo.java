package file;

import java.io.File;

/**
 * 创建一个目录
 * @author Java
 *
 */
public class MkDirDemo {

	public static void main(String[] args) {
		/**
		 * 在当前目录中创建一个名为demo的目录
		 */
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("该目录已创建");
		}else {
			System.out.println("该目录已存在");
		}
	}

}
