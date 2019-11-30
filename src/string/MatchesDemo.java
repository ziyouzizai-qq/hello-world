package string;
/**
 * String 支持正则表达式方法之一：
 * boolean matches(String regex)
 * 用给定的正则表达式验证当前字符串是否符合
 * 其格式要求
 * @author Java
 *
 */
public class MatchesDemo {

	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * 验证email格式的正则表达式
		 * \w+@\w+(\.[a-zA-Z]+)+
		 */
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		/**
		 * 注意：matches方法指定的正则表达式就算不】
		 * 指定边界匹配符，也就是做全匹配验证的。
		 */
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
		/**
		 * (\+86||0086)?\s?\d{11}
		 */
		String iphonenub = "13815560463";
		String s = "(\\+86||0086)?\\s?[0-9]{11}";
		boolean matches = iphonenub.matches(s);
		if (matches) {
			System.out.println("是手机号");
		}else {
			System.out.println("不是手机号");
		}
	}

}
