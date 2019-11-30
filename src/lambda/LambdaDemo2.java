package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("传奇");
		list.add("小泽老师");
		list.add("苍老师");
		System.out.println(list);
		
		/*Comparator<String> com = new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};*/
		/**
		 * 方法中的参数类型可以不再指定，编译器会结合
		 * 程序自动分析参数类型
		 */
	/*	Comparator<String> com = (o1,o2)->{
			return o1.length()-o2.length();
		};*/
		/**
		 * 如果只有一句代码那么在忽略"{}"号的同时，
		 * return关键字也要忽略
		 */
		Comparator<String> com = (o1,o2)->o1.length()-o2.length();
		Collections.sort(list,com);
		System.out.println(list);
	}
}
