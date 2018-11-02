package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SerialTest getData = new SerialTest();
        getData.initialize();
        Thread t=new Thread() {
            public void run() {
                //the following line will keep this app alive for 1000 seconds,
                //waiting for events to occur and responding to them (printing incoming messages to console).
                try {Thread.sleep(1000000);} catch (InterruptedException ie) {}
            }
        };
        t.start();
        System.out.println("Started");


        Product a = new Product("Milk",.67);
        Product b = new Product("Eggs", 14);
        Product c = new Product("Butter", 50);

	    System.out.println(a.toString());
	    System.out.println(b.toString());
	    System.out.println(c.toString());

        try {
            t.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Weight: " + getData.getSerialWeight());


        a.setWeight(Double.parseDouble(getData.getSerialWeight()));
        b.setWeight(4);
        c.setWeight(25);

        System.out.println(a.toString());
        //System.out.println(b.toString());
        //System.out.println(c.toString());

        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Would you like an update? (y/n)");
            answer = scanner.next();

            if(answer.equals("y")){
                try {
                    t.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Weight: " + getData.getSerialWeight());
                a.setWeight(Double.parseDouble(getData.getSerialWeight()));
                b.setWeight(4);
                c.setWeight(25);

                System.out.println(a.toString());
                //System.out.println(b.toString());
                //System.out.println(c.toString());
            }

        }while(answer.equals("y"));

    System.out.println("Terminate");
    System.exit(0);
    }
}
