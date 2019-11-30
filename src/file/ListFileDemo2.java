package file;

import java.io.File;
import java.io.FileFilter;

/**
 * ListFiles�ṩ��һ�����صķ���������ָ��
 * һ���ļ�������(FilesFilter)��Ȼ�������
 * ������Ҫ��������
 * @author Java
 *
 */
public class ListFileDemo2 {

	public static void main(String[] args) {
		/**
		 *��ȡ��ǰĿ¼��������"."��ͷ������ 
		 */
		File dir = new File(".");
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("���ڹ��ˣ�"+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}

}
