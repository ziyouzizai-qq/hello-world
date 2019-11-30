package socket;

import java.util.Arrays;

/**
 * 测试删除数组元素的逻辑
 * @author Java
 *
 */
public class Demo {
	public static void main(String[] args) {
		int[] allout = {1,2,3,4,5,6,7,8,9};
		
		int pw = 3;
		
		for (int i = 0; i < allout.length; i++) {
			if (pw==allout[i]) {
				for (int j = i; j < allout.length-1; j++) {
					allout[j] = allout[j + 1];
				}
				allout = Arrays.copyOf(allout, allout.length-1);
				break;
			}
		}
		System.out.println(Arrays.toString(allout));
	}
}
