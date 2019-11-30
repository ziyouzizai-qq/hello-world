package collection;
/**
 * ʹ�õ�ǰ��ʵ����Ϊ����Ԫ�أ����Լ������
 * ������
 * @author Java
 *
 */
public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}
