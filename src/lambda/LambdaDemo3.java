package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDK8֮�󼯺Ϻ�Map��֧����һ���µķ�����
 * foreach������ʹ��lambda��������Ԫ�ء�
 * ���ڸ÷����Ǽ��������ṩ�ģ���ô��ʹ��һ��
 * �̰߳�ȫ�ļ��ϻ�Mapʱ�����ֱ�����ʽҲ�ǲ���
 * ��ȫ��(ԭ������ģʽ���뼯�Ϸ������⣬����
 * ��Ҫ����ά��)
 * @author Java
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		for (String str : list) {
			System.out.println(str);
		}
		//JDK8֧�ֵ��·�ʽ
		list.forEach(
				str ->System.out.println(str)
				);
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.forEach(
				(k,v)->System.out.println(k+":"+v)
				);
	}
}
