package file;

import java.io.File;
import java.io.IOException;

public class AddFileAndMkDir {
	public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´�����
		 * a/b/c/d/e/fĿ¼
		 */
		File file = new File("."+File.separator+"a"+File.separator+"LYQ.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		}else {
			System.out.println("�ļ��Ѵ���");
		}
	}
}
