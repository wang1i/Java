package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月30日上午9:28:44
 * @type 练习题
 */
public class Demo10_22 {

	public static void main(String[] args) {
		char[] s = { 'Q', 'a', 's' };
		String s2 = "aVBnM";
		MyString1 str = new MyString1(s);
		MyString2 str2 = new MyString2(s2);
		System.out.println(str.length() + "\n" + str.substring(0, 2) + "\n" + str.toLowerCase().getStr());

	}

}
