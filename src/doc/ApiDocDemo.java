package doc;
/**
 * �ĵ�ע��ֻ�������ط�ʹ��
 * �࣬����������
 * �ĵ�ע���ǹ��ܼ�ע�ͣ�����˵���࣬����������
 * �����ͼ����������
 * �ĵ�ע�����տ��Ա�javadoc��������Ϊ�ֲ�
 * @author yjq
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.0
 *
 */
public class ApiDocDemo {
	/**
	 * sayHell��ʹ�õ��ʺ���
	 */
	public static final String INFO = "���";
	/**
	 * Ϊ�������û�����ʺ���
	 * @param name Ҫ����ʺ�����û��������� 
	 * @return �����ʺ�����ַ���
	 */
	public String sayHello(String name){
		return INFO+name;
	}
}
