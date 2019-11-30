package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以字符串开始或结尾的
 * @author Java
 *
 */
public class StartWithDemo {

	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts = str.startsWith("thi");
		System.out.println("starts:"+starts);
		boolean ends = str.endsWith("thi");
		System.out.println("ends:"+ends);

	}

}
