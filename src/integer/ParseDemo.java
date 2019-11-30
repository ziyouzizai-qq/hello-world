package integer;
/**
 * 包装类都提供了一个静态方法
 * parseXXX(String str)
 * 可以将字符串解析为对应的基本类型，但是需要
 * 注意，该字符串必须能够正确描述基本类型可
 * 以保存的值，否则会抛出异常。
 * @author Java
 *
 */
public class ParseDemo {

	public static void main(String[] args) {
		String str = "123.123";
		/*int d = Integer.parseInt(str);
		System.out.println(d);*/
		
		double d2 = Double.parseDouble(str);
		System.out.println(d2);
	}

}
