package string;
/**
 * string�ǲ������JVM��������һ���Ż������ڴ�
 * �п�����һ��������Ϊ�����أ�����ͨ��������������
 * ʽ�������ַ������󶼻Ỻ�沢���á���Ϊ������
 * �������Ըö������ݲ���
 * @author Java
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		//����һ���ַ�������s1
		String s1 = "123abc";
		//s2,s3���ã�������s1ָ��Ķ���
		String s2 = "123abc";
		String s3 = "123abc";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
		//�޸����ݻᴴ���������¶���
		s1 = s1+"!";
		System.out.println("s1:"+s1);
		//s2,s3����Ӱ��
		System.out.println("s2:"+s2);
		//new��һ����������
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		System.out.println(s2==s4);//false
		/**
		 * ��������һ���Ż���ʩ��������Դ����
		 * ʱ����һ��������ʽ���в�����������
		 * ��ʱ����ֱ�ӽ��м��㣬����������뵽
		 * class�ļ��С�
		 * ���������class�ļ���Ϊ��
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";//���������Զ����룬�൱��String s5 = "123abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		/**
		 * ������ʽһ��Ϊ��������ô����������
		 * ƴ�ӣ���ô�ᴴ���¶���
		 */
		String s = "123";
		String s6 = s+"abc";
		System.out.println("s6:"+s6);
		System.out.println(s2==s6);//false
	}

}
