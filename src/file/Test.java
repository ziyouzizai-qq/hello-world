package file;

import java.io.File;

/**
 * ��ɷ�����ʵ��ɾ������File����ʾ���ļ���Ŀ¼
 * @author Java
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/**
	 * �ļ�ֱ��ɾ����Ŀ¼�Ļ�Ҫ�Ƚ��룬
	 * Ȼ����ɾ��
	 * @param f
	 */
	public static void delete(File f) {
		
		if (f.isDirectory()) {
			//����ո�Ŀ¼
			File[] subs = f.listFiles();
			for (int i = 0; i < subs.length; i++) {
				File sub = subs[i];
				//�ݹ����
				delete(sub);
			}
		}
		
		f.delete();
		
	}
}
