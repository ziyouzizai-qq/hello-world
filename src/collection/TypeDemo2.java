package collection;
/**
 * 泛型是编译器认可，而非虚拟机。
 * 编译器会将泛型改为Object。所以泛型的实际
 * 类型就是Object
 * 在使用泛型时，编译器会辅助做两个操作
 * 1：对泛型设置值时，编译器会检查该值的类型
 *    是否与泛型一致，不一致则编译不通过。
 * 2：在获取泛型值时，编译器会添加向下造型的
 *    代码。
 * @author Java
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		Location<Integer> loc1 = new Location<Integer>(1, 2);
		/**
		 * 编译器会检查实际赋值是否符合泛型类型
		 * 要求：不符合编译不通过。
		 */
		loc1.setX(1);
	//	loca.setX("1"); //编译不通过
		/**
		 * 编译器会在编译时补全代码向下造型的代码为：
		 * int x1 = (Integer)loc1.getX();
		 * 然后还会触发自动拆箱，改为
		 * int x1 = ((Integer)loc1.getX()).intvalue()
		 */
		int x1 = loc1.getX();
		System.out.println("loc1:"+loc1);
		System.out.println("x1:"+x1);
		/**
		 * 泛型可以不指定，不指定则按照默认的
		 * Object看待
		 */
		Location loc2 = loc1;
		System.out.println("loc2:"+loc2);
		loc2.setX("三");
		System.out.println("loc2:"+loc2);
		
		//再次以locl角度获取x
		//int x1 = (Integer)loc1.getX();
		x1 = loc1.getX();//类造型异常
		System.out.println("x1:"+x1);
	}
}
