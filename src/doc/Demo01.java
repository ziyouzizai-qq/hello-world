package doc;

public class Demo01 {
	public static void main(String[] args) {
		Object o = new Object();
		try {
			o.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
