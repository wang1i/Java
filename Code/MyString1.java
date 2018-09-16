package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月30日上午9:29:30
 * @type 练习题
 */
public class MyString1 {
	private char[] str;

	public MyString1(char[] chars) {
		str = chars;
	}

	public char charAt(int index) {
		return str[index];
	}

	public int length() {
		return str.length;
	}

	public String getStr() {
		return new String(str);
	}

	public MyString1 substring(int begin, int end) {
		char[] a = new char[end - begin];
		int j = 0;
		for (int i = begin; i < end; i++) {
			a[j++] = str[i];
		}
		return new MyString1(a);
	}

	public MyString1 toLowerCase() {
		char[] a = new char[str.length];
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'A' && str[i] <= 'Z')
				a[i] = (char) (str[i] + 32);
			else
				a[i] = str[i];
		}
		return new MyString1(a);
	}

	public boolean equals(MyString1 s) {
		if (s.length() != this.length())
			return false;
		for (int i = 0; i < this.length(); i++) {
			if (s.charAt(i) != this.charAt(i))
				return false;
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		int num = i;
		int len = 0;
		while (num > 0) {
			num = num / 10;
			len++;
		}
		char[] a = new char[len];
		while (i > 0) {
			a[len--] = (char) (i % 10 + 48);
			i = i / 10;
		}
		return new MyString1(a);
	}

}
