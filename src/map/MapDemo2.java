package map;

import java.util.Collection;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * ����Map�����ַ�ʽ
 * 1���������е�key
 * 2������ÿһ���ֵ��
 * 3���������е�value9(��Բ�����)
 * 
 * @author Java
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		//						  new LinkedHashMap<String,Integer>();�����HashMap
		map.put("����",98);
		map.put("��ѧ",97);
		map.put("Ӣ��",96);
		map.put("����",95);
		map.put("��ѧ",98);
		System.out.println(map);
		
		/**
		 * �������е�key
		 * Set<k> keySet()
		 * ����ǰMap�����е�key��һ��Set����
		 * ��ʽ���ء�����������Ͼ͵�ͬ�ڱ���
		 * �����е�key
		 */
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println("key:"+key);
		}
		/**
		 * ����ÿһ���ֵ��
		 * Set<Entry> entrySet()
		 * 
		 * java.util.Map.Entry
		 * Entry��ÿһ��ʵ�����ڱ�ʾ��ǰMap�е�
		 * һ���ֵʱ���������������õķ�����
		 * getKey(),getValue()�ֱ����ڻ�ȡ��Ӧ��
		 * key��value
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key:"+key+",value:"+value);
		}
		
		/**
		 * �������е�value
		 */
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println("value:"+value);
		}
	}
}
