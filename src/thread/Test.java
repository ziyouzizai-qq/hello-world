package thread;

import java.util.Scanner;

/**
 * 倒计时程序 程序启动后，要求输入一个数字，
 * 比如：100 然后每秒输出一次，每次输出数字
 * 递减。 输出到0时提示结束，程序退出。
 * 
 * @author Java
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		System.out.println("请输入你要倒计时的数：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (true) {
			System.out.println(number);
			number--;
			if (number <0) {
				System.out.println("程序结束了");
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
