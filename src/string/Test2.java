package string;

import java.sql.Date;

/**
 * ͼƬ������
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
		String[] str = imagename.split("\\.");//����"."���
		String imageName = System.currentTimeMillis()+str[1];
		return imageName;
	}
}
