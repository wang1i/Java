package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月30日下午10:51:53
 * @type 练习题
 */
public class MyStringBuilder1 {
	private String str;

	public MyStringBuilder1(String s) {
		str = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(str + s);
	}

	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(str + i);
	}

	public int length() {
		return str.length();
	}

	public char charAt(int index) {
		return str.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(str.toLowerCase());
	}

	public static void main(String[] args) {
		String s1 = "asd";
		System.out.println(s1 + 1);
	}
}
