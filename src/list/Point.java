package list;
/**
 * 使用当前类实例作为集合元素，测试集合相关
 * 操作。
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
	 * 当一个类实现了Comparable接口后必须重写
	 * 方法：compareTo
	 * 该方法的作用是比较当前对象this与方法的
	 * 参数对象o之间的大小
	 * 
	 * 返回值不关心具体取值，只关心取值范围
	 * 当返回值>0：当前对象大于参数对象（this>0）
	 * 当返回值<0：当前对象小于参数对象
	 * 当返回值=0：两个对象相等
	 */
	public int compareTo(Point o) {
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
}
