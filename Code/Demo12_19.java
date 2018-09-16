package myjava;

import java.net.URL;
import java.util.Scanner;

public class Demo12_19 {

	public static void main(String[] args) throws Exception {
		try {
			URL url = new URL("https://read.qidian.com/chapter/rCo0cx0UxW08kjk6dUsm_A2/j5xtNOEEJvq2uJcMpdsVgA2");
			Scanner input = new Scanner(url.openStream());
			int words = 0;
			while (input.hasNext()) {
				words++;
				if (words == 50000)
					break;
			}
			System.out.println("单词数：" + words);
			input.close();
		} catch (Exception ex) {
			System.out.println("无效的网址");
			ex.printStackTrace();
		}

	}

}
