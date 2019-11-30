package reflect;
/**
 * ���Է��书�ܵ���
 * @author Java
 *
 */
public class Person {
	private String name;
	
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void sayHello(){
		System.out.println("Hello");
	}
	
	public void sayHello(String name){
		System.out.println("Hello,"+name);
	}
	
	public void sayHello(String name,int age){
		System.out.println("Hello,"+name+",������"+age+"�ꡣ");
	}
	
	public void sayHi(){
		System.out.println("hi!");
	}
}
