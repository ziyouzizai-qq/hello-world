package string;
/**
 * StringBuilderר�������޸��ַ������ݵ�API
 * String�������Ż���Ƶ��µ�������ǲ���Ƶ��
 * �޸ģ�ÿ�ζ������¶���
 * @author Java
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "Ŭ��ѧϰjava";
		//Ĭ�ϱ�ʾ���ַ���
		//StringBuilder builder = new StringBuilder();
		StringBuilder builder = new StringBuilder(str);
		
		/**
		 * append()
		 * ƴ���ַ���
		 */
		builder.append(",Ϊ��һ���ù�����");
		str = builder.toString();
		System.out.println(str);
		
		
		/**
		 * Ŭ��ѧϰjava,Ϊ��һ���ù�����
		 * Ŭ��ѧϰjava,Ϊ�˸ı�ȫ����
		 * replace()
		 */
		builder.replace(9, 16, "Ϊ�˸ı�ȫ����");
		str = builder.toString();
		System.out.println(str);
		
		/**
		 * Ŭ��ѧϰjava,Ϊ��һ���ù�����
		 * ,Ϊ�˸ı�ȫ����
		 * delete()
		 */
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		/**
		 * ,Ϊ�˸ı�ȫ����
		 * ����,Ϊ�˸ı�ȫ����
		 * insert()
		 */
		builder.insert(0, "����");
		str = builder.toString();
		System.out.println(str);
	}

}
