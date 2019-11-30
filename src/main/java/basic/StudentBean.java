package basic;

public class StudentBean {
	
	public StudentBean() {
		System.out.println("StudentBean()");
	}
	
	public void init(){
		System.out.println("StudentBean的init方法");
	}
	
	public void destroy(){
		System.out.println("StudentBean的destroy方法");
	}
}
