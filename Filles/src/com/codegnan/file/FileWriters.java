package com.codegnan.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Srinu.text");
		fw.write(99);
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.write("\n");
		fw.write("srinu");
		fw.write("\n");
		fw.write("ravi");
		fw.write("\n");
		fw.write("venkat");
		fw.close();
		
		

	}

}
