package string;
/**
 * char charAt(int index)
 * ��ȡ��ǰ�ַ�����ָ��λ�ô���Ӧ���ַ�
 * @author Java
 *
 */
public class CharAtDemo {

	public static void main(String[] args) {
		//            0123456789....
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		/**
		 * �жϻ���
		 * �Ϻ�����ˮ���Ժ���
		 * 
		 */
		str = "�Ϻ�����ˮ���Ժ���";
		/*boolean check  = true;
		for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.println("���ǻ���");
				check  = false;
				break;
			}
		}
		if (check) {
			System.out.println("�ǻ���");
		}*/
		/*for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.print("��");
				break;
			}
		}
		System.out.println("�ǻ���");*/
		
		for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
	}

}
