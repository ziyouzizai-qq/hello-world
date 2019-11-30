package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author Java
 *
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建一个名为：demo.txt
		 * 的文件
		 */
		File file = new File("./demo.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("文件已创建");
		}else {
			System.out.println("文件已存在");
		}
	}

}
