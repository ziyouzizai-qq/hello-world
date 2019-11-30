package reflect;

import java.lang.reflect.Method;

/**
 * java�ķ������
 * ������ƿ�����������ʵ����һ���࣬���÷���
 * �������Դӱ����ڸ�Ϊ�������ھ������������
 * ���������ڼ䶯̬�ĵ�֪һ��������(������Щ
 * ���������Ե�)
 * ������ƿ��Դ����ߴ�������ȣ�����ʵ��
 * ������ʹ��Ҫ�ʶȡ�����ʹ�÷���ή�ʹ����
 * ����Ч��
 * @author Java
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * ����ĵ�һ������ȡҪ��������������
		 * 
		 * java��ÿ����JVM���ص�����JVM�ڲ���
		 * ����ֻ��һ�������(class��ʵ��)��֮
		 * ��Ӧ��
		 * ͨ��ĳ������������Ե�֪������
		 * ��Ϣ(����Щ��������Щ���Եȵ���Ϣ)
		 * ���ҿ��Խ���ʵ�����Ȳ�����
		 * 
		 * ���ȡһ����������ķ�ʽ��
		 * 1������.class
		 *    ÿ���඼��һ����̬���ԣ�class��
		 *    ����ֱ�ӻ�ȡ�����������
		 *    ��������ȷ��Ҫ��ȡĳ����������
		 *    ʱ����ʹ�����ַ�ʽ��
		 *    
		 * 2��ͨ��Class�ľ�̬������forName��
		 *    ���ַ�ʽ���ǿ���ָ������ص���
		 *    ����������ȡ����������
		 *    
		 * 3��ͨ���������ClassLoader
		 */
		
		//�鿴Person�����Ϣ
		/*
		 * 1���Ȼ�ȡPerson�������
		 */
//		Class cls = Person.class;
		/*
		 * Class.forName(String className)
		 * �����ڼ���һ����ʱָ�����ַ���Ϊ�������
		 * ��ȫ�޶���������.����
		 */
		Class cls = Class.forName("reflect.Person");
		String name = cls.getName();
		System.out.println(name);
		
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
