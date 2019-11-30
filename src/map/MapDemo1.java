package map;

import java.util.HashMap;
import java.util.Map;


/**
 * java.util.Map
 * Map 查找表，结构看起来像是一个多行两列的
 * 表格。左列称为key，右列称为value。
 * 所以Map总是以key-value对的形式保存元素。
 * 并且总是根据key去获取对应的value。
 * 对此我们经常讲"查询条件"作为key，将要查询
 * 的数据作为value进行保存。
 * 
 * 本身是一个接口，规定了Map操作的相关方法。
 * 常用实现类：java.util.HashMap
 * 
 * HashMap又称为散列表，哈希表
 * 使用散列算法实现的Map，当今世界上查询速度
 * 最快的数据结构，查询速度最快，查询速度最快！
 * 
 * @author Java
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/**
		 * V put(K k,V v)
		 * 将给定的一组键值对存入到Map中
		 * 
		 * Map有一个要求，即：key不允许重复，
		 * 是否重复时依靠key自身equals比较的
		 * 结果。
		 * 如果使用map中已有的key保存value，
		 * 则这个操作为替换value操作，那么
		 * 这时put方法会将被替换的value返回。
		 * 否则返回值为null。
		 */
		/**
		 * 如果value是一个包装类，那么接收时
		 * 应当避免直接用基本类型。因为这会
		 * 导致自动拆箱，若没有做替换操作，返
		 * 回的value为null时就引发了空指针异常
		 */
		Integer d = map.put("语文",98);
		System.out.println(d);
		map.put("数学",97);
		map.put("英语",96);
		map.put("物理",95);
		map.put("化学",98);
		System.out.println(map);
		
		d = map.put("语文",100);
		System.out.println(d);
		System.out.println(map);
		/**
		 * V get(Object key)
		 * 根据给定的key获取对应的value，若
		 * 给定的key不存在，则返回值为null
		 */
		d = map.get("数学");
		System.out.println("数学："+d);
		
		/**
		 * int saize()
		 * 获取Map中元素的个数，每组键值对算
		 * 一个元素
		 */
		int size = map.size();
		System.out.println("size:"+size);
		/**
		 * V remove(Object key)
		 * 将给定的key所对应的键值对删除。
		 * 返回值为该key对应的value
		 */
		d = map.remove("语文");
		System.out.println(d);
		System.out.println(map);
	}
}
