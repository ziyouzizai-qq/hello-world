package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ��ʵ�����Զ������Ķ����д����
 * 
 * ��һ�����ʵ��ϣ�����Ա����������и�д����
 * ô�������ʵ�֣�java.io.Serializable�ӿ�
 * ���ͬʱ����ǰ���������������͵����ԣ�����
 * ��Ӧ����Ҳ����ʵ�ָýӿڡ�
 * @author Java
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�Ҫ��
	 * Ӧ������һ��������serialVersionUID������
	 * ���л��汾��
	 * 
	 * ���л��汾��Ӱ�췴���л��Ƿ��ɹ���������
	 * �������ڽ��ж������л�ʱ����ö�����
	 * ��ǰ��İ汾�Ƿ�һ�£���һ�������л�ʱ
	 * ���׳��쳣���·����л�ʧ�ܡ�
	 * һ������Խ��з����л���ԭ��ʱ��Ӧ������
	 * ���л�ԭ��
	 * 
	 * ������ǲ�����ð汾�ţ����������ڱ��뵱ǰ
	 * ��ʱ���ݽṹ����һ���汾�ţ�����һ����ǰ��
	 * �����ı䣬name�汾��һ����ı䣬������ǰ��
	 * ����һ���ǲ����Է����л��ˡ�
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	/**
	 * transient�ؼ������ε������ڶ������л�ʱ
	 * �ᱻ���ԡ�
	 * ���Բ���Ҫ�����Կ��Դﵽ������������á�
	 */
	private transient String[] otherInfo;//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	@Override
	public String toString() {
		return  name + "," + age + "," + gender + ","
				+ Arrays.toString(otherInfo) ;
	}
	
}
