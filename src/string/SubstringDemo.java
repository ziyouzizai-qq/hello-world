package string;
/**
 * String sybstring(int start,int end)
 * ��ȡָ����Χ�ڵ��ַ�������������Ϊ��ʼ��
 * �������±ꡣ
 * ע��java api��һ���ص㣬ͨ�����������ֱ�ʾ
 * ��Χʱ���ǡ���ͷ����β��
 * @author Java
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		String host = "www.baidu.com";
		//���±�Ϊ4��ʼ��ȡ���±�Ϊ8(9��ȡ������)
		String sub = host.substring(4, 9);
		System.out.println(sub);
		//һ������Ϊ��ȡ��ĩβ
		sub = host.substring(4);
		System.out.println(sub);
	}

}
