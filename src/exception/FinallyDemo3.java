package exception;
/**
 * 请分别说明：
 * final finally finalize？
 * @author Java
 *
 */
public class FinallyDemo3 {

	public static void main(String[] args) {
		System.out.println(test("0")+","+test(null)+","+test(""));
	}

	private static int test(String str) {
		try {
			System.out.println("str:"+str);
			return str.charAt(0)-'0'; 
		} catch (NullPointerException e) {
			System.out.println("空指针");
			return 1;
		} catch (Exception e) {
			System.out.println("其他异常");
			return 2;
		} finally {
			return 3;
		}
		
	}

}
