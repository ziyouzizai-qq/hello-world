package collection;

public class TypeDemo {
	public static void main(String[] args) {
		Location<Integer> loc1 = new Location<Integer>(1, 2);
		loc1.setX(2);
		int x1 = loc1.getX();
		System.out.println("loc1:"+loc1);
		System.out.println("x1:"+x1);
		
		Location<Double> loc2 = new Location<Double>(1.0, 2.0);
		loc2.setX(2.0);
		double x2 = loc2.getX();
		System.out.println("loc2:"+loc2);
		System.out.println("x2:"+x2);
		
		Location<String> loc3 = new Location<String>("Ò»", "¶þ");
		loc3.setX("¶þ");
		String x3 = loc3.getX();
		System.out.println("loc3:"+loc3);
		System.out.println("x3:"+x3);
		
		/*Location<Double,Integer> loc4 = new Location<Double,Integer>(1.0, 2);
		loc4.setX(2.0);
		double x4 = loc4.getX();
		System.out.println("loc4:"+loc4);
		System.out.println("x4:"+x4);*/
	}
}
