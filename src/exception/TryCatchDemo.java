package exception;
/**
 * java�쳣��������е�try-catch
 * try���������������ܳ���Ĵ���Ƭ�Σ�catch
 * ����������Щ������Ըô�����д���
 * @author Java
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "";
			/**
			 * ��JVMִ�д���ʱ����һ������ʱ����
			 * ���ݴ���ʵ������Ӧ���쳣ʵ������
			 * ������ִ�й������ý�ȥ��Ȼ�󽫸���
			 * ���ڳ�������λ���׳���
			 * ֮��JVM�����׳��쳣������Ƿ���
			 * ��try-catch������û������Ϊ����
			 * ��������ڷ���û�н���쳣��������
			 * ��֮���쳣�׳����÷����⡣
			 */
			System.out.println("111");
			System.out.println("222");
			/**
			 * try�����г�������������ݲ�ִ��
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println("333");
		} catch (NullPointerException e) {
			System.out.println("��ָ���쳣");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ���쳣");
			/**
			 * Ӧ�������һ��catch������Exception
			 * ��������һ��δ�����쳣���³����ж�
			 */
		} catch (Exception e) {
			System.out.println("�쳣");
		}
		System.out.println("���������");

	}

}
