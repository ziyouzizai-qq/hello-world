package object;
/**
 * 使用当前类测试重写Object相关方法
 * @author Java
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
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
	/**
	 * toString方法会被很多API调用，所以当我们
	 * 定义一个类时，很常见的操作就是重写这方法。
	 * 
	 * 该方法的意义是将当前对象转换为一个字符串
	 * 形式。该字符串内容格式没有严格的要求。
	 * 原则为包含这个对象的相关属性信息
	 */
	public String toString() {
        return "("+x+","+y+")";
    }
	/**
	 * equals的作用是比较当前对象与参数对象
	 * 的内容是否一致。
	 */
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		if (obj==this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}
