package com.unit1.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world2");
		 test();
 		 String s="ƒ„∫√ ¿ΩÁ5";
 		 FileWriter fw = null;
 		 fw=new FileWriter("D:\\demo\\hello.txt",true);
 		 fw.write(s);
 		 fw.flush();
 		
	}
	public static void test() {
		System.out.println("woshi ceshi ");
	}

}
