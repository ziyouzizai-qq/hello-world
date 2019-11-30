package exception;
/**
 * 异常常用方法
 * @author Java
 *
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "A";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//输出错误信息
			//e.printStackTrace();
			//获取错误消息
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束了");

	}

}
