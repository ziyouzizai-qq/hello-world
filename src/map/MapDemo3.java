package map;

import java.util.HashMap;
import java.util.Map;

/**
 * �ж�Map�Ƿ��������Ԫ�ء�
 * ���Էֱ��ж��Ƿ����key��value
 * boolean containsKey(Object k)
 * boolean containsValue(Object v)
 * @author Java
 *
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����",98);
		map.put("��ѧ",97);
		map.put("Ӣ��",96);
		map.put("����",95);
		map.put("��ѧ",98);
		System.out.println(map);
		
		/**
		 * �鿴�Ƿ����ָ����key
		 */
		boolean ck = map.containsKey("����");
		System.out.println("����key:"+ck);
		
		boolean cv = map.containsValue(80);
		System.out.println("����value:"+cv);
	}
}
