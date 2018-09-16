package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月30日下午5:39:15
 * @type 练习题
 */
public class Demo10_25 {

	public static String[] spilt(String s, String regex) {
		int len = 0;
		int flag = 1;
		for (int i = 0; i < s.length(); i++) {
			if (flag == 1 && !isBraced(s.charAt(i), regex)) {
				len++;
				flag = 0;
			} else
				flag = 1;
		}
		String[] a = new String[len];
		int j = -1;
		flag = 1;
		for (int i = 0; i < s.length(); i++) {
			if (!isBraced(s.charAt(i), regex)) {
				if (flag == 1) {
					j++;
					a[j] = s.charAt(i) + "";
				} else
					a[j] += s.charAt(i);
				flag = 0;
			} else
				flag = 1;
		}
		return a;
	}

	private static boolean isBraced(char ch, String regex) {
		for (int i = 0; i < regex.length(); i++)
			if (ch == regex.charAt(i))
				return true;
		return false;
	}

	public static void main(String[] args) {
		String str = "a?b?gf#e";
		String reg = "[?#]";
		for (int i = 0; i < spilt(str, reg).length; i++)
			System.out.print(spilt(str, reg)[i] + "\t");
	}

}
