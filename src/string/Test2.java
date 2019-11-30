package string;

import java.sql.Date;

/**
 * 图片重命名
 * @author Java
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String imagename = "abc.jpg";
		imagename = imageRename(imagename);
		System.out.println(imagename);
		

	}
	public static String imageRename(String imagename){
		String[] str = imagename.split("\\.");//按照"."拆分
		String imageName = System.currentTimeMillis()+str[1];
		return imageName;
	}
}
