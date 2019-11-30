package string;
/**
 * StringBuilder专门用来修改字符串内容的API
 * String由于其优化设计导致的问题就是不能频繁
 * 修改（每次都创建新对象）
 * @author Java
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "努力学习java";
		//默认表示空字符串
		//StringBuilder builder = new StringBuilder();
		StringBuilder builder = new StringBuilder(str);
		
		/**
		 * append()
		 * 拼接字符串
		 */
		builder.append(",为找一个好工作！");
		str = builder.toString();
		System.out.println(str);
		
		
		/**
		 * 努力学习java,为找一个好工作！
		 * 努力学习java,为了改变全世界
		 * replace()
		 */
		builder.replace(9, 16, "为了改变全世界");
		str = builder.toString();
		System.out.println(str);
		
		/**
		 * 努力学习java,为找一个好工作！
		 * ,为了改变全世界
		 * delete()
		 */
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		/**
		 * ,为了改变全世界
		 * 活着,为了改变全世界
		 * insert()
		 */
		builder.insert(0, "活着");
		str = builder.toString();
		System.out.println(str);
	}

}
