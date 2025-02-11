package com.codegnan.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergingOfTwoFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (PrintWriter pw1 = new PrintWriter("file1.txt")) {
			pw1.println(66666666);
			pw1.println(77777777);
			pw1.println(88888888);

		} catch (IOException e) {
			System.out.println("an eroor will occur to file1.text: " + e.getMessage());
		}
		try (PrintWriter pw2 = new PrintWriter("file2.txt")) {
			pw2.println("aaaaa");
			pw2.println("bbbbb");
			pw2.println("ccccc");

		} catch (IOException e) {
			System.out.println("an eroor will occur to file2.text: " + e.getMessage());
		}

		try (BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
				PrintWriter pw3 = new PrintWriter(new FileWriter("pw3.txt"))) {
			String line;
			while ((line = br1.readLine()) != null) {
				pw3.println(line);
			}
			while((line = br2.readLine()) != null) {
				pw3.print(line);
			}

		}catch(Exception e) {
			System.out.println("An error occured while merging files:" + e.getMessage());
		}

	}

}
