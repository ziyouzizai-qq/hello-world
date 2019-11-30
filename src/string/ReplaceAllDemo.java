package string;
/**
 * String replaceAll(String regex,String str)
 * 将当前字符串符合正则表达式要求的部分替换
 * 为给定内容
 * @author Java
 *
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		/**
		 * 将数字部分替换为"#NUMBER#"
		 */
		String regex = "[0-9]+";
		str = str.replaceAll(regex, "#NUMBER#");
		System.out.println(str);
	}

}
