package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������11:34:30
 * @type ��ϰ��
 */
public class Demo10_6 {

	public static void main(String[] args) {
		StackOfPrime p = new StackOfPrime(120);
		int n = p.getTop();
		int[] prime = p.getPrime();
		for (int i = n - 1; i > 0; i--) {
			System.out.print(prime[i] + "��");
		}
		System.out.println(prime[0]);

	}

}
