package file;

import java.io.File;

/**
 * 删除目录
 * @author Java
 *
 */
public class DeleteDirDemo {

	public static void main(String[] args) {
		/**
		 * 删除当前目录下的目录
		 */
		File dir = new File("./demo");
		if (dir.exists()) {
			dir.delete();
			System.out.println("删除完毕！");
		}else {
			System.out.println("目录不存在");
		}
	}

}
