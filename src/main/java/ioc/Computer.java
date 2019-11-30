package ioc;

public class Computer {
	
	private IB b;
	
	public void setB(IB b) {
		System.out.println("Computer的setB方法");
		this.b = b;
	}

	public Computer() {
		System.out.println("Computer()");
	}
	
	public void service(){
		System.out.println("Computer的service方法");
		b.f1();
	}
	
	
}
