package basic;

public class MessageBean {
	
	public MessageBean() {
		System.out.println("MessageBean()");
	}
	
	public void init(){
		System.out.println("MessageBean的init方法");
	}
	
	public void sendMsg(){
		System.out.println("MessageBean的sendMs方法");
	}
	
	public void destroy(){
		System.out.println("MessageBean的destroy方法");
	}
}
