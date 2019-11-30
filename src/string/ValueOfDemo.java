package string;
/**
 * String提供了一组重载的静态方法：valueOf
 * 可以将给定的内容转换为字符串
 * @author Java
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int d = 1;
		String str = String.valueOf(d);
		System.out.println(str);	
		
		double dou = 1.1;
		str = String.valueOf(dou);
		System.out.println(str);
		
		str = d+"";
	}

}
