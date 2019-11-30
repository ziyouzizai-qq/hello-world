package util;

import java.util.Date;

public class Teacher extends AbPerson {
	
	private ABC abc;

	public ABC getAbc() {
		return abc;
	}


	public void setAbc(ABC abc) {
		this.abc = abc;
	}


	private Character ch;
	
	public Character getCh() {
		return ch;
	}


	public void setCh(Character ch) {
		this.ch = ch;
	}


	private Date date;
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	private String name2;
	
	
	private String name3;


	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}


	public String getName3() {
		return name3;
	}


	public void setName3(String name3) {
		this.name3 = name3;
	}


	@Override
	public String toString() {
		return "Teacher [name2=" + name2 + ", name3=" + name3 + "]";
	}
	
	
}
