package file;

import java.io.File;

/**
 * java.io.File
 * File��ÿһ��ʵ�����ڱ�ʾӲ���ϵ��ļ���
 * Ŀ¼��
 * ʹ��File���ԣ�
 * 1�����ʹ���ʾ���ļ���Ŀ¼��������Ϣ�����֣���
 *    С������Ȩ�޵���Ϣ��
 * 2�������ļ���Ŀ¼��������ɾ����
 * 3������Ŀ¼����
 *    ���ǲ��ܷ����ļ����ݡ�
 * @author Java
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/**
		 * ���ʵ�ǰ��ĿĿ¼�µ�test.txt
		 * ����Fileʱ��ָ����·��ͨ��ʹ�����
		 * ·�����ô����ڣ����Կ�ƽ̨��
		 * ���·��������������Ҫ�������
		 * ���л���ָ����λ�á�
		 * ��eclipes������java����ʱ��ָ����
		 * ���·����"��ǰĿ¼"�ǵ�ǰ��������
		 * ����ĿĿ¼���������JSD1807_SE���
		 * Ŀ¼
		 */
		File file = new File("./test.txt");//.��ʾ��ǰĿ¼
		
		String name = file.getName();
		System.out.println("name:"+name);
		
		//��ȡ�ļ���С(�ֽ���)
		long length = file.length();
		System.out.println("len:"+length);
		
		//�ж��Ƿ�ɶ���д
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("�ɶ���"+cr);
		System.out.println("��д��"+cw);
		
		//�ж��Ƿ�����
		boolean yc = file.isHidden();
		System.out.println("���أ�"+yc);
	}
}
