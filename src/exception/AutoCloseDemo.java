package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后推出了一个新特性：autoclose
 * 允许编译器在编译过程中自动处理诸如流的关闭
 * 工作。
 * @author Java
 *
 */
public class AutoCloseDemo {

	public static void main(String[] args) {
		try (
			/**
			 * 实现了AutoClaseable借口的类可以在
			 * 这里定义。编译器最终会将代码改变，
			 * 在finally中将其关闭
			 */
			FileOutputStream fos = new FileOutputStream("fos.dat");
		){
			fos.write(1);
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
