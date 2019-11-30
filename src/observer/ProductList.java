package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * �۲���ģʽ
 *
 */
public class ProductList extends Observable {

	// ��Ʒ�б�
	private List<String> productList = null;
	
	// ��Ψһʵ��
	private static ProductList instance;
	
	private ProductList() {}
	
	/**
	 * ȡ��Ψһʵ��
	 * @return ��Ʒ�б�Ψһʵ��
	 */
	public static ProductList getInstance(){
		if (instance == null){
			instance = new ProductList();
			instance.productList = new ArrayList<String>();
		}
		return instance;
	}
	
	/**
	 * ���ӹ۲���
	 * @param observer �۲���
	 */
	public void addProductListObservable(Observer observer){
		this.addObserver(observer);
	}
	
	/**
	 * ������Ʒ
	 * @param newProduct �²�Ʒ
	 */
	public void addProduct(String newProduct){
		productList.add(newProduct);
		System.out.println("��Ʒ�б������˲�Ʒ��" + newProduct);
		this.setChanged(); // ���ñ��۲�������仯
		this.notifyObservers(newProduct);// ֪ͨ�۲��ߣ��������²�Ʒ
	}
}
