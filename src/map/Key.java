package map;
/**
 * HashMap是查询速度最快的数据结构，内部使用
 * 数组实现，它通过Key的hashcode值计算该元素
 * 在数组中的下标位置，从而避免了遍历数组的操
 * 作，从而查询不受元素多少影响。
 * 
 * 由于Key的hashcode方法（决定其在HashMap内部
 * 数组的位置）和equals方法（决定Key是否为重复）
 * 直接影响HashMap是否会出现链表，对此这两个
 * 方法在Object类中有明确的重写说明。
 * 
 * 当一个HashMap内部出现链表时。会降低其查询
 * 性能，应当尽量避免。而出现链表的情况在于：
 * 当两个key的hashcode值相同，而equals比较不
 * 为true时就会形成。
 * 
 * API手册中在Object类里说明了这两个方法的重
 * 写规划：
 * 1：成对重写
 * 	  当我们需要重写一个类的equals方法时，就
 * 	  应当连同重写hashcode方法
 * 2：一致性
 *    当两个对象的equals比较为true时，hashcode
 *    方法返回的数字必须相等。反之则不是必须的，
 *    但是应当尽量保证当两个对象hashcode值相同
 *    时equals方法比较为true，否则在HashMap中
 *    作为key使用时会出现链表！
 * 3：稳定性
 * 	  当一个对象参与equals比较的属性值没有发生
 *    过改变的前提下，多次调用hashcode方法返回
 *    的数字应当相同。
 * 
 * @author Java
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
