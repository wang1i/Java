package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月14日下午11:34:30
 * @type 练习题
 */
public class Demo10_6 {

	public static void main(String[] args) {
		StackOfPrime p = new StackOfPrime(120);
		int n = p.getTop();
		int[] prime = p.getPrime();
		for (int i = n - 1; i > 0; i--) {
			System.out.print(prime[i] + "、");
		}
		System.out.println(prime[0]);

	}

}
