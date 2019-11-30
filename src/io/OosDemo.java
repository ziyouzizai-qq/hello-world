package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流也是一对高级流，提供的功能是读写java
 * 中的任何对象。
 * 
 * 对象输出流：
 * java.io.ObjectOutputStream
 * 它可以将给定的java对象转换为一组字节然后
 * 通过其连接的流将这些字节写出。
 * @author Java
 *
 */
public class OosDemo {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("cbb");
		p.setAge(22);
		p.setGender("男");
		String[] otherInfo = {"阿彬","呆瓜","傻子"};
		p.setOtherInfo(otherInfo);
		System.out.println(p);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/**
		 * 通过对象流写对象的这个方法经历了
		 * 两个步骤：
		 * 1：对象流先将给定的对象转换为了一组
		 *    字节，这组字节包含对象本身保存的
		 *    数据信息，还包含该对象的结构信息
		 *    然后将这组字节通过其连接的流写出
		 *    
		 *    上述操作对应的术语：对象序列化
		 *    
		 * 2：经过文件流时，文件流将这组字节写
		 *    入到了文件中。   
		 *    
		 *    将数据写入磁盘做长久保存的过程
		 *    对应的术语：数据持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕！");
		oos.close();
	}

}
