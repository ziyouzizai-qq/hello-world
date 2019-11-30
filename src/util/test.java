package util;

import java.util.Date;

import util.ok.UtilCopy;

public class test {

	public static void main(String[] args) throws Exception {
		ABC abc = new ABC();
		abc.setAaa("aaa");
		abc.setBbb("bbb");
		abc.setCcc("ccc");
		Teacher t1 = new Teacher();
		t1.setAbc(abc);
		t1.setArr(new String[]{"1","2","3","4","5"});
		t1.setCh('1');
		t1.setDate(new Date());
		t1.setName1("name1");
		t1.setName2("name2");
		t1.setName3("name3");
		Teacher t2 = (Teacher) UtilCopy.EntityCopy(t1);
		for (String str : t2.getArr()) {
			System.out.println(str);
		}
		System.out.println("=====");
		System.out.println(t2.getAbc() == t1.getAbc());
		System.out.println("=====");
		System.out.println(t2.getCh());
		System.out.println(t2.getDate() == t1.getDate());
		System.out.println(t1==t2);
	}

}
