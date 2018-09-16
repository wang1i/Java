package myjava;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12_33 {

	public static void main(String[] args) throws IOException {
		String url = "http://cs.armstrong.edu/liang";
		crawler(url, "Computer Programming");
	}

	private static void crawler(String startingURL, String target) throws IOException {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add(startingURL);
		while (!list1.isEmpty()) {
			String urlString = list1.remove(0);
			try {
				if (contains(urlString, target)) {
					System.out.println("°üº¬" + target + "µÄÍøÒ³ÊÇ£º" + urlString);
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!list2.contains(urlString)) {
				list2.add(urlString);
				System.out.println("Crawl  " + urlString);
				for (String s : getSubURLs(urlString))
					if (!list1.contains(s))
						list1.add(s);
			}
		}
	}

	@SuppressWarnings("resource")
	private static boolean contains(String urlString, String target) throws IOException {
		URL url = new URL(urlString);
		Scanner input = new Scanner(url.openStream());
		while (input.hasNext()) {
			if (input.nextLine().contains(target))
				return true;
		}
		input.close();
		return false;
	}

	private static String[] getSubURLs(String urlString) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		URL url = new URL(urlString);
		Scanner input = new Scanner(url.openStream());
		int current = 0;
		while (input.hasNext()) {
			String line = input.nextLine();
			current = line.indexOf("http:", current);
			while (current > 0) {
				int endIndex = line.indexOf("\"", current);
				if (endIndex > 0) {
					list.add(line.substring(current, endIndex));
					current = line.indexOf("http:", endIndex);
				} else
					current = -1;
			}
		}
		input.close();
		return list.toArray(new String[list.size()]);
	}

}
