package map;

import java.util.Collection;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历Map的三种方式
 * 1：遍历所有的key
 * 2：遍历每一组键值对
 * 3：遍历所有的value9(相对不常用)
 * 
 * @author Java
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		//						  new LinkedHashMap<String,Integer>();有序的HashMap
		map.put("语文",98);
		map.put("数学",97);
		map.put("英语",96);
		map.put("物理",95);
		map.put("化学",98);
		System.out.println(map);
		
		/**
		 * 遍历所有的key
		 * Set<k> keySet()
		 * 将当前Map中所有的key以一个Set集合
		 * 形式返回。遍历这个集合就等同于遍历
		 * 了所有的key
		 */
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println("key:"+key);
		}
		/**
		 * 遍历每一组键值对
		 * Set<Entry> entrySet()
		 * 
		 * java.util.Map.Entry
		 * Entry的每一个实例用于表示当前Map中的
		 * 一组键值时。其中有两个常用的方法：
		 * getKey(),getValue()分别用于获取对应的
		 * key与value
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key:"+key+",value:"+value);
		}
		
		/**
		 * 遍历所有的value
		 */
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println("value:"+value);
		}
	}
}
