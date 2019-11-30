package file;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例用于表示硬盘上的文件或
 * 目录。
 * 使用File可以：
 * 1：访问共表示的文件或目录的属性信息（名字，大
 *    小，访问权限等信息）
 * 2：操作文件或目录（创建，删除）
 * 3：访问目录子项
 *    但是不能访问文件数据。
 * @author Java
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/**
		 * 访问当前项目目录下的test.txt
		 * 创建File时，指定的路径通常使用相对
		 * 路径，好处在于：可以跨平台。
		 * 相对路径到底相对在哪里，要看程序的
		 * 运行环境指定的位置。
		 * 在eclipes中运行java程序时，指定的
		 * 相对路径中"当前目录"是当前程序所在
		 * 的项目目录，这里就是JSD1807_SE这个
		 * 目录
		 */
		File file = new File("./test.txt");//.表示当前目录
		
		String name = file.getName();
		System.out.println("name:"+name);
		
		//获取文件大小(字节量)
		long length = file.length();
		System.out.println("len:"+length);
		
		//判断是否可读可写
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("可读："+cr);
		System.out.println("可写："+cw);
		
		//判断是否隐藏
		boolean yc = file.isHidden();
		System.out.println("隐藏："+yc);
	}
}
