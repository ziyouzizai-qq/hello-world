package string;
/**
 * ��г���
 * @author Java
 *
 */
public class Test3 {

	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|mmp|nc|mdzz|cnm|djb)";
		String message = "wqnmlgdsb!����ô��ônc,���djb,cnm";
		message = message.replaceAll(regex, "*");
		System.out.println(message);
	}

}
