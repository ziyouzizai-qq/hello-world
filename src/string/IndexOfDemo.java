package string;
/**
 * int indexof(String str)
 * ���ظ����ַ����ڵ�ǰ�ַ�����λ�ã�����ǰ
 * �ַ����������������򷵻�ֵ-1.
 * @author Java
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789.....
		String str = "thinking in java";
		//���Դ�ָ��λ��5��ʼ����
		System.out.println("in�ĵ�һ��index:"+str.indexOf("in",5));
		//�������һ�γ��ֵ�λ��
		System.out.println("in�����һ��index:"+str.lastIndexOf("in"));
	}

}
