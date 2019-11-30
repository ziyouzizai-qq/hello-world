package observer;

public class Test {

	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver tb = new TaoBaoObserver();
		JingDongObserver jd = new JingDongObserver();
		observable.addObserver(tb);
		observable.addObserver(jd);
		observable.addProduct("������Ʒ1");
	}

}
