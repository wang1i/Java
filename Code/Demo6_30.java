package myjava;

/**
 * @author wl
 * @date 创建时间：2018年4月25日下午4:50:30
 * @type 练习题
 */
public class Demo6_30 {

	public static void main(String[] args) {
		int digit1 = (int) (Math.random() * 6 + 1);
		int digit2 = (int) (Math.random() * 6 + 1);
		if (digit1 + digit2 == 2 || digit1 + digit2 == 3 || digit1 + digit2 == 12) {
			System.out.println("你投掷：" + digit1 + " + " + digit2 + " = " + (digit1 + digit2));
			System.out.println("你输了");
			System.exit(1);
		} else if (digit1 + digit2 == 7 || digit1 + digit2 == 11) {
			System.out.println("你投掷：" + digit1 + " + " + digit2 + " = " + (digit1 + digit2));
			System.out.println("你赢了");
			System.exit(1);
		} else {
			int point = digit1 + digit2;
			System.out.println("你投掷：" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\npoint = " + point);
			do {
				digit1 = (int) (Math.random() * 6 + 1);
				digit2 = (int) (Math.random() * 6 + 1);
			} while (digit1 + digit2 != 7 && digit1 + digit2 != point);
			if (digit1 + digit2 == 7)
				System.out.println("你投掷：" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\n你输了");
			else
				System.out.println("你投掷：" + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + "\n你赢了");
		}
	}

}
