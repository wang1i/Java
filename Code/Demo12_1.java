package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��3������9:55:09
 * @type ��ϰ��
 */
public class Demo12_1 {

	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			throw new Exception("������������");
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
