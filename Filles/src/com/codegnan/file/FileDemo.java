package com.codegnan.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		/* File f = new File("abc.text");
		
		// check if file is present or not,
		System.out.println(f.exists());
		
		// create a file
		f.createNewFile();
		System.out.println(f.exists());*/
		
		// create dictionary
		// write a java program to  display file present in current directory
		File dic = new File("D:\\course");
		if(dic.exists() && dic.isDirectory()) {
			String[] filesunderDic = dic.list();
			if(filesunderDic != null) {
				System.out.println("Files in Directory in D:\\course");
				for(String name : filesunderDic) {
					System.out.println(name);
				}
			}
		}
		
		

	}

}
