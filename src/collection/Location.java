package collection;
/**
 * ������JDK5�Ƴ������ԣ�Ҳ��Ϊ����������
 * ������һ���������Ե����ͣ���������������
 * �Լ���������ֵ���͵ȵĶ���Ȩ�ƶ�����ʹ���ߡ�
 * ��ʹ��ʵ��Ӧ����ʹ��������������ݡ�
 * @author Java
 *
 */
public class Location<E> {
	private E x;
	private E y;
	public Location(E x, E y) {
		super();
		this.x = x;
		this.y = y;
	}
	public E getX() {
		return x;
	}
	public void setX(E x) {
		this.x = x;
	}
	public E getY() {
		return y;
	}
	public void setY(E y) {
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
}
