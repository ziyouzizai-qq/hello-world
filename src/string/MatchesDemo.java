package string;
/**
 * String ֧��������ʽ����֮һ��
 * boolean matches(String regex)
 * �ø�����������ʽ��֤��ǰ�ַ����Ƿ����
 * ���ʽҪ��
 * @author Java
 *
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * ��֤email��ʽ��������ʽ
		 * \w+@\w+(\.[a-zA-Z]+)+
		 */
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		/**
		 * ע�⣺matches����ָ����������ʽ���㲻��
		 * ָ���߽�ƥ�����Ҳ������ȫƥ����֤�ġ�
		 */
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
		/**
		 * (\+86||0086)?\s?\d{11}
		 */
		String iphonenub = "13815560463";
		String s = "(\\+86||0086)?\\s?[0-9]{11}";
		boolean matches = iphonenub.matches(s);
		if (matches) {
			System.out.println("���ֻ���");
		}else {
			System.out.println("�����ֻ���");
		}
	}

}
