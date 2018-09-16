package myjava;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo12_27 {

	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		File[] subfiles = f.listFiles();
		for (File subf : subfiles) {
			RandomAccessFile raf = new RandomAccessFile(subf, "rw");
			int lastPoint = 0;
			while (raf.getFilePointer() != (-1)) {
				String line = raf.readLine();
				if (line.contains("Excercise")) {
					String s1 = newStr(line);
					raf.seek(lastPoint);
					raf.write(s1.getBytes());
				}
				lastPoint = (int) raf.getFilePointer();
			}
			raf.close();
		}
	}

	private static String newStr(String line) {
		String s1;
		int index = line.indexOf("Excercise");
		if (line.charAt(index + 10) == '_') {
			s1 = "Excercise0" + line.charAt(index + 9);
			if (line.charAt(index + 12) == ' ')
				s1 += "0" + line.charAt(11);
			else
				s1 += line.charAt(11) + line.charAt(12);
		} else {
			s1 = "Excercise" + line.charAt(index + 9) + line.charAt(index + 10);
			if (line.charAt(index + 13) == ' ')
				s1 += "0" + line.charAt(12);
			else
				s1 += line.charAt(12) + line.charAt(13);
		}

		return s1;
	}

}
