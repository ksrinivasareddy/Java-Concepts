package com.codegnan.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

	public static void main(String[] args) throws IOException {
		String fn = "Srinu.text";
		try {
			FileReader fr = new FileReader(fn);
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
				
			}
			fr.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
