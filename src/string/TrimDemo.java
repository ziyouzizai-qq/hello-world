package string;
/**
 * String trim()
 * 去除一个字符串两边的空白字符
 * @author Java
 *
 */
public class TrimDemo {

	public static void main(String[] args) {
		String str = "  hello     ";
		System.out.println(str);
		System.out.println(str.trim());//只能去两边，不能去中间的
	}

}
