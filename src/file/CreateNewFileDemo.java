package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���ļ�
 * @author Java
 *
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´���һ����Ϊ��demo.txt
		 * ���ļ�
		 */
		File file = new File("./demo.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}else {
			System.out.println("�ļ��Ѵ���");
		}
	}

}
