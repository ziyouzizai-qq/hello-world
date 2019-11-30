package string;
/**
 * char charAt(int index)
 * 获取当前字符串中指定位置处对应的字符
 * @author Java
 *
 */
public class CharAtDemo {

	public static void main(String[] args) {
		//            0123456789....
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		/**
		 * 判断回文
		 * 上海自来水来自海上
		 * 
		 */
		str = "上海自来水来自海上";
		/*boolean check  = true;
		for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.println("不是回文");
				check  = false;
				break;
			}
		}
		if (check) {
			System.out.println("是回文");
		}*/
		/*for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.print("不");
				break;
			}
		}
		System.out.println("是回文");*/
		
		for (int i = 0; i < str.length()/2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length()-1-i);
			if (c1!=c2) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
	}

}
