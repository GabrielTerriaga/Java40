package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode() + " Maria");
		System.out.println(c2.hashCode() + " Alex");
		System.out.println(c3.hashCode() + " Maria");
		System.out.println(c3.equals(c2));
		System.out.println(c3.equals(c1));
	}

}
