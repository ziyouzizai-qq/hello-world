package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ����Ƿ������ַ�����ʼ���β��
 * @author Java
 *
 */
public class StartWithDemo {

	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts = str.startsWith("thi");
		System.out.println("starts:"+starts);
		boolean ends = str.endsWith("thi");
		System.out.println("ends:"+ends);

	}

}
