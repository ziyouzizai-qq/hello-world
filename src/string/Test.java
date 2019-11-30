package string;
/**
 * 完成方法，获取给定地址中的域名
 * @author Java
 *
 */
public class Test {

	public static void main(String[] args) {
		String url = "www.sohu.com";
		String name = getHostName(url);
		System.out.println(name);//sohu
		
		url = "http://www.tedu.cn";
		name = getHostName(url);
		System.out.println(name);//tedu

	}
	public static String getHostName(String url){
		int s1 = url.indexOf(".")+1;
		int s2 = url.indexOf(".",s1);
		String sub = url.substring(s1, s2);
		return sub;
	}
}
