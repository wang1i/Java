package myjava;

import java.util.Random;

/**
 * @author wl
 * @date 创建时间：2018年6月7日下午8:19:48
 * @type 练习题
 */
public class Demo9_4 {

	public static void main(String[] args) {
		Random r = new Random(1000);
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 0)
				System.out.print(r.nextInt(100) + "\n");
			else
				System.out.print(r.nextInt(100) + "\t");
		}

	}

}
