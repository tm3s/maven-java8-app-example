package com.mycompany.app;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> words = List.of("Hello", "World!");
		words.forEach(System.out::println);
	}
}
