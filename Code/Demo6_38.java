package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月25日下午10:22:17
 * @type 练习题
 */
public class Demo6_38 {

	public static void main(String[] args) {
		int count = 0;
		char ch;
		while (count < 100) {
			ch = (char) (Math.random() * 26 + 'A');
			System.out.print(ch + "  ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
