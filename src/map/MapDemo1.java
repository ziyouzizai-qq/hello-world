package map;

import java.util.HashMap;
import java.util.Map;


/**
 * java.util.Map
 * Map ���ұ��ṹ����������һ���������е�
 * ������г�Ϊkey�����г�Ϊvalue��
 * ����Map������key-value�Ե���ʽ����Ԫ�ء�
 * �������Ǹ���keyȥ��ȡ��Ӧ��value��
 * �Դ����Ǿ�����"��ѯ����"��Ϊkey����Ҫ��ѯ
 * ��������Ϊvalue���б��档
 * 
 * ������һ���ӿڣ��涨��Map��������ط�����
 * ����ʵ���ࣺjava.util.HashMap
 * 
 * HashMap�ֳ�Ϊɢ�б���ϣ��
 * ʹ��ɢ���㷨ʵ�ֵ�Map�����������ϲ�ѯ�ٶ�
 * �������ݽṹ����ѯ�ٶ���죬��ѯ�ٶ���죡
 * 
 * @author Java
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/**
		 * V put(K k,V v)
		 * ��������һ���ֵ�Դ��뵽Map��
		 * 
		 * Map��һ��Ҫ�󣬼���key�������ظ���
		 * �Ƿ��ظ�ʱ����key����equals�Ƚϵ�
		 * �����
		 * ���ʹ��map�����е�key����value��
		 * ���������Ϊ�滻value��������ô
		 * ��ʱput�����Ὣ���滻��value���ء�
		 * ���򷵻�ֵΪnull��
		 */
		/**
		 * ���value��һ����װ�࣬��ô����ʱ
		 * Ӧ������ֱ���û������͡���Ϊ���
		 * �����Զ����䣬��û�����滻��������
		 * �ص�valueΪnullʱ�������˿�ָ���쳣
		 */
		Integer d = map.put("����",98);
		System.out.println(d);
		map.put("��ѧ",97);
		map.put("Ӣ��",96);
		map.put("����",95);
		map.put("��ѧ",98);
		System.out.println(map);
		
		d = map.put("����",100);
		System.out.println(d);
		System.out.println(map);
		/**
		 * V get(Object key)
		 * ���ݸ�����key��ȡ��Ӧ��value����
		 * ������key�����ڣ��򷵻�ֵΪnull
		 */
		d = map.get("��ѧ");
		System.out.println("��ѧ��"+d);
		
		/**
		 * int saize()
		 * ��ȡMap��Ԫ�صĸ�����ÿ���ֵ����
		 * һ��Ԫ��
		 */
		int size = map.size();
		System.out.println("size:"+size);
		/**
		 * V remove(Object key)
		 * ��������key����Ӧ�ļ�ֵ��ɾ����
		 * ����ֵΪ��key��Ӧ��value
		 */
		d = map.remove("����");
		System.out.println(d);
		System.out.println(map);
	}
}
