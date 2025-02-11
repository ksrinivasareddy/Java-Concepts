package com.codegnan.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterrr {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("Srinu.text");
			pw.write(100);
			pw.print(100);
			pw.write("Srinu");
			
			pw.println(45);
			pw.print(false);
			pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
