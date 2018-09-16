package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月3日下午9:55:09
 * @type 练习题
 */
public class Demo12_1 {

	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			throw new Exception("参数个数有误！");
		}
		int result = 0;
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '*':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			break;
		}
		System.out.println(result);
	}

}
