package doc;
/**
 * 文档注释只在三个地方使用
 * 类，方法，常量
 * 文档注释是功能级注释，用来说明类，方法或常量的
 * 设计意图及功能描述
 * 文档注释最终可以被javadoc命令生成为手册
 * @author yjq
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.0
 *
 */
public class ApiDocDemo {
	/**
	 * sayHell中使用的问候语
	 */
	public static final String INFO = "你好";
	/**
	 * 为给定的用户添加问候语
	 * @param name 要添加问候语的用户名的名字 
	 * @return 含有问候语的字符串
	 */
	public String sayHello(String name){
		return INFO+name;
	}
}
