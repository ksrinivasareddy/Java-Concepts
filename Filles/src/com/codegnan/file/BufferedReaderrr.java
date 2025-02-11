package com.codegnan.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderrr {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Srinu.text"));
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data has retrived Successfully:");

	}

}
