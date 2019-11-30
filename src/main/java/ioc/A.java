 package ioc;

public class A {
	private IB b;
	
	public void setB(IB b) {
		System.out.println("A的setB方法...");
		this.b = b;
	}

	public A() {
		System.out.println("A()");
	}
	
	public void service(){
		System.out.println("A的service方法...");
		//需要调用B的f1方法
		b.f1();
	}
}
