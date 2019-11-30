package exception;
/**
 * java异常处理机制中的try-catch
 * try语句块用来包含可能出错的代码片段，catch
 * 用来捕获这些错误并针对该错误进行处理。
 * @author Java
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "";
			/**
			 * 当JVM执行代码时发现一个错误时，会
			 * 根据错误实例化对应的异常实例，并
			 * 将程序执行过程设置进去，然后将该异
			 * 常在出错的语句位置抛出。
			 * 之后JVM会检查抛出异常的语句是否有
			 * 被try-catch处理，若没有则认为出错
			 * 的语句所在方法没有解决异常的能力，
			 * 随之将异常抛出到该方法外。
			 */
			System.out.println("111");
			System.out.println("222");
			/**
			 * try语句块中出错代码以下内容不执行
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println("333");
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界异常");
			/**
			 * 应当在最后一个catch处捕获Exception
			 * 尽量避免一个未捕获异常导致程序中断
			 */
		} catch (Exception e) {
			System.out.println("异常");
		}
		System.out.println("程序结束了");

	}

}
