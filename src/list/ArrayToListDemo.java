package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��ΪList����
 * ͨ������Ĺ����ࣺArrays�ľ�̬����asList
 * ���Խ�һ������ת��Ϊһ��List
 * 
 * @author Java
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/**
		 * ����ת���ļ��϶���Ԫ�ز������Ƕ�
		 * ԭ�����ӦԪ�صĲ���
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println("array:"+Arrays.toString(array));
		/**]
		 * ���������Ƕ����ģ����Բ�֧�ּ���
		 * ����ɾ����������Ĳ������׳��쳣
		 */
//		list.add("five");
		/**
		 * ���еļ��϶��ṩ��һ������ΪCollection
		 * �Ĺ��췽�����������ڴ�����ǰ���ϵ�ͬʱ
		 * �������������е�����Ԫ�ء�
		 */
		List<String> list2 = new ArrayList<String>(list);
		list2.add("five");
		System.out.println(list2);
	}
}
