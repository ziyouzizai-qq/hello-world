package string;
/**
 * String sybstring(int start,int end)
 * 截取指定范围内的字符串。两个参数为开始到
 * 结束的下标。
 * 注：java api有一个特点，通常用两个数字表示
 * 范围时都是”含头不含尾“
 * @author Java
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		String host = "www.baidu.com";
		//从下标为4开始，取到下标为8(9是取不到的)
		String sub = host.substring(4, 9);
		System.out.println(sub);
		//一个参数为截取到末尾
		sub = host.substring(4);
		System.out.println(sub);
	}

}
