package string;
/**
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ�������������ʽҪ��Ĳ����滻
 * Ϊ��������
 * @author Java
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/**
		 * �����ֲ����滻Ϊ"#NUMBER#"
		 */
		String regex = "[0-9]+";
		str = str.replaceAll(regex, "#NUMBER#");
		System.out.println(str);
	}

}
