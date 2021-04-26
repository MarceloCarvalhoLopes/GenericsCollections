package br.com.marcelocarvalho.java.generics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import br.com.marcelocarvalho.java.generics.entities.Product;

public class MapExample {

	public static void main(String[] args) {
		
		//TreeMap sort by key
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99887766");
		
		cookies.remove("email");
		cookies.put("phone", "99887765");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone")); //true
		System.out.println("Email: " + cookies.get("email")); //null
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies:");
		for(String key : cookies.keySet() ) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println("");
		System.out.println("********************************");
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		

	}

}
