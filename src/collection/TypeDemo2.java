package collection;
/**
 * �����Ǳ������Ͽɣ������������
 * �������Ὣ���͸�ΪObject�����Է��͵�ʵ��
 * ���;���Object
 * ��ʹ�÷���ʱ���������Ḩ������������
 * 1���Է�������ֵʱ�������������ֵ������
 *    �Ƿ��뷺��һ�£���һ������벻ͨ����
 * 2���ڻ�ȡ����ֵʱ��������������������͵�
 *    ���롣
 * @author Java
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		Location<Integer> loc1 = new Location<Integer>(1, 2);
		/**
		 * ����������ʵ�ʸ�ֵ�Ƿ���Ϸ�������
		 * Ҫ�󣺲����ϱ��벻ͨ����
		 */
		loc1.setX(1);
	//	loca.setX("1"); //���벻ͨ��
		/**
		 * ���������ڱ���ʱ��ȫ�����������͵Ĵ���Ϊ��
		 * int x1 = (Integer)loc1.getX();
		 * Ȼ�󻹻ᴥ���Զ����䣬��Ϊ
		 * int x1 = ((Integer)loc1.getX()).intvalue()
		 */
		int x1 = loc1.getX();
		System.out.println("loc1:"+loc1);
		System.out.println("x1:"+x1);
		/**
		 * ���Ϳ��Բ�ָ������ָ������Ĭ�ϵ�
		 * Object����
		 */
		Location loc2 = loc1;
		System.out.println("loc2:"+loc2);
		loc2.setX("��");
		System.out.println("loc2:"+loc2);
		
		//�ٴ���locl�ǶȻ�ȡx
		//int x1 = (Integer)loc1.getX();
		x1 = loc1.getX();//�������쳣
		System.out.println("x1:"+x1);
	}
}
