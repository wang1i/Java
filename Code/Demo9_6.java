package myjava;

import java.util.Random;

/**
 * @author wl
 * @date 创建时间：2018年6月7日下午9:32:27
 * @type 练习题
 */
public class Demo9_6 {

	public static void main(String[] args) {
		final int N = 100000;
		Random r = new Random();
		StopWatch t = new StopWatch();
		t.start();
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
			a[i] = r.nextDouble();
		for (int i = 0; i < N - 1; i++) { // 选择排序
			int k = i;
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[k])
					k = j;
			}
			if (i != k) {
				double temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
		t.end();
		double waste = t.getElapsedTime();
		System.out.println("耗时" + waste + "毫秒");

	}

}
