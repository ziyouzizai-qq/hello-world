package string;
/**
 * int indexof(String str)
 * 返回给定字符串在当前字符串的位置，若当前
 * 字符串不包含该内容则返回值-1.
 * @author Java
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789.....
		String str = "thinking in java";
		//可以从指定位置5开始查找
		System.out.println("in的第一个index:"+str.indexOf("in",5));
		//查找最后一次出现的位置
		System.out.println("in的最后一个index:"+str.lastIndexOf("in"));
	}

}
