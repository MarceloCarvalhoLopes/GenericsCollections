package br.com.marcelocarvalho.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		/**
		 *Generics and Java API Collections 
		 */
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		
		for(String s : list) {
			System.out.println(s);
		}

	}

}
