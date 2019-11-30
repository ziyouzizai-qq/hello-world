package changelength;

public class ChangeLength01 {

	public static void main(String[] args) {
		test01(1,2,3);
		test01(new int[]{4,5,6});
	}
	
	public static void test01(int... arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
