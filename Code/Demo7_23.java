package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月7日下午3:23:31
 * @type 练习题
 */
public class Demo7_23 {

	public static void main(String[] args) {
		boolean[] state = new boolean[100];
		for (int i = 0; i < 100; i++) {
			for (int m = i; m < 100; m += i + 1) {
				if (state[m])
					state[m] = false;
				else
					state[m] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (state[i])
				System.out.print("开  ");
			else
				System.out.print("关  ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
