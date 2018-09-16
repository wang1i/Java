package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月30日上午11:04:42
 * @type 练习题
 */
public class MyString2 {
	private char[] str;

	public MyString2(String s) {
		char[] a = new char[s.length()];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			a[j++] = s.charAt(i);
		}
		str = a;
	}

	public int length() {
		return str.length;
	}

	public int compare(String s) {
		if (str.length != s.length())
			return 0;
		for (int i = 0; i < str.length; i++)
			if (str[i] != s.charAt(i))
				return 0;
		return 1;
	}

	public MyString2 substring(int begin) {
		char[] a = new char[str.length - begin];
		int j = 0;
		for (int i = begin; i < str.length; i++) {
			a[j++] = str[i];
		}
		return new MyString2(new String(a));
	}

	public MyString2 toUpperCase() {
		char[] a = new char[str.length];
		for (int i = 0; i < str.length; i++)
			if (str[i] > 'a' && str[i] < 'z')
				a[i] = (char) (str[i] - 32);
			else
				a[i] = str[i];
		return new MyString2(new String(a));
	}

	public char[] toChars() {
		return str;
	}

	public static MyString2 valueOf(boolean b) {
		String s;
		if (b == false)
			s = "false";
		else
			s = "true";
		return new MyString2(s);
	}
}
