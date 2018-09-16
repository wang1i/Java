package myjava;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo12_22 {
	private static int num = 0;

	public static void main(String[] args) throws IOException {
		String filePath = args[0];
		String oldStr = args[1];
		String newStr = args[2];
		replaceStr(filePath, oldStr, newStr);
		System.out.println("ÎÄ¼þÊý£º" + num);
	}

	private static void replaceStr(String filePath, String oldStr, String newStr) throws IOException {
		File file = new File(filePath);
		if (file.isFile())
			if (file.getName().matches("Test.*")) {
				num++;
				System.out.println(file.getAbsolutePath());
				instead(file.getAbsolutePath(), oldStr, newStr);
			}
		if (file.isDirectory()) {
			File[] subFiles = file.listFiles();
			for (File subFile : subFiles)
				replaceStr(subFile.getAbsolutePath(), oldStr, newStr);
		}
	}

	private static void instead(String filePath, String oldStr, String newStr) throws IOException {
		File f = new File(filePath);
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		int lastPoint = 0;
		String line;
		while ((line = raf.readLine()) != null) {
			if (line.contains(oldStr)) {
				String s1 = line.replaceAll(oldStr, newStr);
				raf.seek(lastPoint);
				raf.write(s1.getBytes());
				raf.write("\r\n".getBytes());
			}
			lastPoint = (int) raf.getFilePointer();
		}
		raf.close();
	}

}
