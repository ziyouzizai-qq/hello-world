package collection;
/**
 * JDK5�Ƴ�ʱ���Ƴ���һ���µ����ԣ�
 * ��ǿ��forѭ����Ҳ��Ϊ��ѭ����for each
 * 
 * ��ѭ����ȡ����ͳforѭ���Ĺ�������ר�����
 * �������������ϻ�����ġ�
 * 
 * @author Java
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","for"};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("===============");
		/**
		 * ��ѭ�����﷨Ҳ�Ǳ������Ͽɣ����������
		 * �Ͽɡ����������ڱ���Դ����ʱ����ѭ��
		 * ���������Ϊ��ͳforѭ�������ķ�ʽ
		 */
		for (String str : array) {
			System.out.println(str);
		}
	}
}
