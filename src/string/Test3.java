package string;
/**
 * 和谐语句
 * @author Java
 *
 */
public class Test3 {

	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|mmp|nc|mdzz|cnm|djb)";
		String message = "wqnmlgdsb!你怎么这么nc,你个djb,cnm";
		message = message.replaceAll(regex, "*");
		System.out.println(message);
	}

}
