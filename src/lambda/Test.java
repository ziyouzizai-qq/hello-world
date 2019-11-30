package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		System.out.println("===========");
		list.forEach(s -> System.out.println(s));
	}
}
