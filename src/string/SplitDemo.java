package string;

import java.util.Arrays;

/**
 * String[] split(String regex)
 * ʹ�ø�����������ʽ����ֵ�ǰ�ַ�����
 * ������ֺ���������ַ���������ʽ����
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
