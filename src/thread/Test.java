package thread;

import java.util.Scanner;

/**
 * ����ʱ���� ����������Ҫ������һ�����֣�
 * ���磺100 Ȼ��ÿ�����һ�Σ�ÿ���������
 * �ݼ��� �����0ʱ��ʾ�����������˳���
 * 
 * @author Java
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		System.out.println("��������Ҫ����ʱ������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (true) {
			System.out.println(number);
			number--;
			if (number <0) {
				System.out.println("���������");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
