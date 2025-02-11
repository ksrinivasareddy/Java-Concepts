package com.codegnan.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterrr {

	public static void main(String[] args) {
		String fn = "Srinu.text";
		try {
			FileWriter fw= new FileWriter(fn);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(10);
			bw.newLine();
			char[] ch = {'a','b','c','d','e','f'};
			bw.write(ch);
			bw.newLine();
			bw.write("@Hello srinu");
			bw.flush();
			System.out.print("written successfully");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
