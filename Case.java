package com.company;

import java.util.Scanner;

public class Case extends Main {
    private String a;
    private String cwm;
    private String[] ara;
    private int[] in;
    private String[] array;


    public Case(String cwm, String a, String[] ara, int[] in, String[] array) {
        this.in = in;
        this.cwm = cwm;
        this.ara = ara;
        this.a = a;
        this.array = array;
    }

    public void run() {
        String basket = "";
        int sum = 0;

        Scanner s = new Scanner(System.in);

        if (a == " ") {
            System.out.println("You don't have a menu yet.\n");
        } else {
            if (cwm == " ") {
                System.out.println("You don't have Welcome Massage.\n");
            } else {
                System.out.println(cwm);
            }
            System.out.println("Here you can see our menu below.");

            while (true) {
                System.out.println();
                String[] w = a.split(", ");
                System.out.println("0. Exit menu.");
                for (int i = 0; i < w.length; i++) {
                    System.out.println(i + 1 + ". " + w[i] + ".");
                }
                System.out.println(w.length + 1 + ". Clear basket.");
                System.out.println(w.length + 2 + ". Check basket.");
                System.out.println(w.length + 3 + ". Back to Admin Panel.");

                System.out.print("Choose one: ");
                int q = s.nextInt();

                if (q > 0 && q <= w.length) {
                    if (array[q] == " ") {
                        System.out.println("\nYou don't have subcategories in this category.");

                    } else {
                        System.out.println();
                        String[] a1 = array[q].split(", ");
                        for (int i = 0; i < a1.length; i++) {
                            if (a1[i] != " ") {
                                System.out.println(i + 1 + ". " + a1[i] + " - " + in[i] + " kzt.");
                            }
                        }
                        System.out.print("Choose a " + w[q - 1] + ": ");
                        int q1 = s.nextInt();

                        basket += a1[q1 - 1];
                        basket += "\n";
                        sum += in[q1 - 1];
                    }

//
                } else if (q == 0) {

                } else if (q == w.length + 1) {
                    System.out.println("Clear basket? \n1. YES \n2. NO");
                    int l = s.nextInt();

                    if (l == 1) {
                        sum = 0;
                        basket = "";

                    } else if (l == 2) {
                    }
                } else if (q == w.length + 2) {
                    System.out.println();
                    if (basket == "") {
                        System.out.println("Basket is empty.");
                        System.out.println("Total price: 0 kzt.");

                    } else if (basket != "") {
                        System.out.println("Basket: \n" + basket);

                        System.out.print("Total price: ");
                        System.out.println(sum + " kzt.");
                    }

                } else if (q == w.length + 3) {
                    break;


                }
            }
        }
        return;
    }
}
