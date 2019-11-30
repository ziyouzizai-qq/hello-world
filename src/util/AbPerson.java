package util;

public abstract class AbPerson implements Person{
	
	private String[] arr;

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "AbPerson [name1=" + name1 + "]";
	}

	private String name1;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	
}
