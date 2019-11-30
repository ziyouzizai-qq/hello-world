package list;
/**
 * ʹ�õ�ǰ��ʵ����Ϊ����Ԫ�أ����Լ������
 * ������
 * @author Java
 *
 */
public class Point implements Comparable<Point>{
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
	/**
	 * ��һ����ʵ����Comparable�ӿں������д
	 * ������compareTo
	 * �÷����������ǱȽϵ�ǰ����this�뷽����
	 * ��������o֮��Ĵ�С
	 * 
	 * ����ֵ�����ľ���ȡֵ��ֻ����ȡֵ��Χ
	 * ������ֵ>0����ǰ������ڲ�������this>0��
	 * ������ֵ<0����ǰ����С�ڲ�������
	 * ������ֵ=0�������������
	 */
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
}
