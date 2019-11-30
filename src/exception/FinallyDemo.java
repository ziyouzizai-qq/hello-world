package exception;
/**
 * finally块
 * finally是异常处理机制的最后一块，可以直接
 * 跟着try之后或者最后一个catch之后。
 * finally可以确保只要程序运行到try语句块中
 * 那么无论是否抛出异常，finally中的代码必定
 * 执行。
 * 
 * @author Java
 *
 */
public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "";
			System.out.println(str.length());
			throw new Exception();
//			return;
		} catch (Exception e) {
			System.out.println("出错了");
		} finally {
			System.out.println("finally块");
		}
		System.out.println("程序结束了");
	}

}
