package com.company;

public class Main {

    public static void main(String[] args) {
        Product a = new Product("Milk",10);
        Product b = new Product("Eggs", 14);
        Product c = new Product("Butter", 50);

	    System.out.println(a.toString());
	    System.out.println(b.toString());
	    System.out.println(c.toString());

        a.setWeight(4);
        b.setWeight(4);
        c.setWeight(25);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
