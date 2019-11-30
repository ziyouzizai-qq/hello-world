package file;

import java.io.File;
import java.io.IOException;

public class AddFileAndMkDir {
	public static void main(String[] args) throws IOException {
		/**
		 * 在当前目录下创建：
		 * a/b/c/d/e/f目录
		 */
		File file = new File("."+File.separator+"a"+File.separator+"LYQ.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("文件已创建");
		}else {
			System.out.println("文件已存在");
		}
	}
}
