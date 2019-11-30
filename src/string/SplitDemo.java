package string;

import java.util.Arrays;

/**
 * String[] split(String regex)
 * 使用给定的正则表达式来拆分当前字符串。
 * 并将拆分后的内容以字符串数组形式返回
 * @author Java
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		String str = "abc123def456jhi789ooo11111111111111111111aaaaaaaa2";
		String regex = "[a-zA-Z]";
		String[] arrs = str.split(regex);
		System.out.println(arrs.length);
		System.out.println(Arrays.toString(arrs));
	}

}
