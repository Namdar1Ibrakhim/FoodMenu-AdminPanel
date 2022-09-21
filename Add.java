package com.company;

import java.util.Scanner;

public class Add extends Main {
    String cwm = " ";
    String a = " ";
    String[] array;
    String[] ara;
    int[] in;

    public Add(String cwm, String a, String[] array, String[] ara, int[] in) {
        this.cwm = cwm;
        this.a = a;
        this.in = in;
        this.array = array;
        this.ara = ara;
    }

    public void cwm() {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, type the message that clients will see when they enter the menu: \nTip: use underscore (_) as a splitter \n> ");
        cwm = s.nextLine();
        cwm = cwm.replace("_", "\n");
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        System.out.print("Here you can do the following activities: \n0. Go Back. \n1. Add categories. \n2. Remove categories.\n\nYour choice: ");
        int v2 = s.nextInt();
        if (v2 == 0) {
        } else if (v2 == 1) {
            System.out.print("Write the names of categories separated by comma (c1, c2, c3, ...):\n> ");
            s.nextLine();
            a = s.nextLine();
            String[] ass = a.split(", ");

        }
        if (v2 == 2) {
            a = " ";
        }
    }

    public void submenu() {
        Scanner s = new Scanner(System.in);
        System.out.print("Here you can do the following activities: \n0. Go Back \n1. Add subcategories. \n2. Remove subcategories.\n\nYour choice: ");
        int b = s.nextInt();

        if (b == 0) {

        } else if (b == 1) {
            if (a == " ") {
                System.out.println("\nYou don't have a menu yet.");
            } else {
                System.out.println("Choose a category for which you want to add subcategories:");

                String[] w = a.split(", ");
                for (int i = 0; i < w.length; i++) {
                    System.out.println(i + 1 + ". " + w[i] + ".");
                }
                System.out.print("> ");

                int c = s.nextInt();
                System.out.println("Write the name of subcategories separated by comma (c1, c2, ...):");
                System.out.print("> ");
                s.nextLine();
                array[c] = s.nextLine();
                String[] as = array[c].split(", ");
                for (int i = 0; i < as.length; i++) {
                    ara[i] = as[i];
                }
            }


        } else if (b == 2) {
            if (a == " ") {
                System.out.println("\nYou don't have a menu yet.");

            } else {
                System.out.println("Choose the category from which want to remove subcategories:");
                String[] w = a.split(", ");
                for (int i = 0; i < w.length; i++) {
                    System.out.println(i + 1 + ". " + w[i] + ".");
                }
                System.out.print("> ");
                int ee = s.nextInt();

                if (array[ee] == " ") {
                    System.out.println("You don't have subcategories in this category.");


                } else {
                    String[] qw = array[ee].split(", ");

                    System.out.println();

                    for (int i = 0; i < qw.length; i++) {
                        if (ara[i] == " ") {
                            ara[i] = ara[i + 1];
                        } else if (ara[i] != " ") {
                            System.out.println(i + 1 + ". " + ara[i] + ".");
                        }
                    }
                    System.out.print("Tip: write the indexes separated by comma (i1, i2 ....)\n> ");

                    s.nextLine();
                    String ww = s.nextLine();
                    String[] arr2 = ww.split(", ", 0);
                    int[] arrq = new int[arr2.length];
                    for (int i = 0; i < arrq.length; i++) {
                        arrq[i] = Integer.parseInt(arr2[i]);
                    }
                    for (int i = 0; i < arrq.length; i++) {
                        if (arrq[i] <= arrq.length + 1) {
                            ara[arrq[i] - 1] = " ";
                            in[arrq[i] - 1] = 0;
                        }
                    }
                }
            }
        }

    }

    public void price() {
        Scanner s = new Scanner(System.in);
        if (a == " ") {
            System.out.println("You don't have a menu yet.");

        } else {
            System.out.println("Choose a category for which you want to change prices of subcategories: ");
            String[] qq = a.split(", ");
            for (int i = 0; i < qq.length; i++) {
                System.out.println(i + 1 + ". " + qq[i] + ".");
            }
            System.out.println();
            System.out.print("> ");

            int f = s.nextInt();

            String[] m = array[f].split(", ");

            if (array[f] == " ") {
                System.out.println("You don't have subcategories in this category.");

            } else if (array[f] != " ") {
                System.out.println("Choose a category for which you want to change prices: ");

                for (int i = 0; i < m.length; i++) {
                    if (ara[i] == " ") {
                        ara[i] = ara[i + 1];

                    } else if (ara[i] != " ") {
                        System.out.println(i + 1 + ". " + m[i] + " - " + in[i] + " kzt.");
                    }
                }
            }
            System.out.print("\nTip: write the indexes separated by comma (i1, i2, ...)\n> ");

            s.nextLine();
            String ww = s.nextLine();

            String[] arr1 = ww.split(", ", 0);
            int[] arr = new int[arr1.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arr1[i]);
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= arr.length + 1) {
                    System.out.print("Enter a new price for " + m[arr[i] - 1] + ": ");
                    in[arr[i] - 1] = s.nextInt();
                }
            }
        }


    }

    public void prCwm() {
        System.out.println(cwm);
    }

    public void prMenu() {
        if (a == " ") {
            System.out.println("You don't have a menu yet.");

        } else if (a != " ") {
            String[] w = a.split(", ");
            for (int i = 0; i < w.length; i++) {
                System.out.println(i + 1 + ". " + w[i] + ".");
            }
        }
    }

    public void prSubmenu() {
        Scanner s = new Scanner(System.in);
        String[] w = a.split(", ");
        if (a == " ") {
            System.out.println("You don't have a menu yet.");

        } else if (a != " ") {
            System.out.println("Choose the category for which you want to see its subcategories: ");
            for (int i = 0; i < w.length; i++) {
                System.out.println(i + 1 + ". " + w[i] + ".");
            }
            System.out.print("> ");

            int e = s.nextInt();
            String[] q = array[e].split(", ");


            if (array[e] == " ") {
                System.out.println("You don't have subcategories in this category.");

            } else if (array[e] != " ") {
                System.out.println();

                for (int i = 0; i < q.length; i++) {
                    if (ara[i] == " ") {
                        ara[i] = ara[i + 1];

                    } else if (ara[i] != " ") {
                        System.out.println(i + 1 + ". " + ara[i] + ".");

                    }
                }
            }
        }
    }


    public void prPrice() {
        Scanner s = new Scanner(System.in);
        if (a == " ") {
            System.out.println("You don't have a menu yet.");
        } else {
            System.out.println("Choose the category for which you want to see its subcategories prices: ");
            String[] pp = a.split(", ");
            for (int i = 0; i < pp.length; i++) {
                System.out.println(i + 1 + ". " + pp[i] + ".");
            }
            System.out.print("> ");
            int kk = s.nextInt();

            if (array[kk] == " ") {
                System.out.println("You don't have subcategories in this category.");
            }
            if (array[kk] != " ") {
                System.out.println();
                String[] wq = array[kk].split(", ");

                for (int i = 0; i < wq.length; i++) {
                    if (ara[i] == " ") {
                        ara[i] = ara[i + 1];
                    } else if (ara[i] != " ") {
                        System.out.println(i + 1 + ". " + ara[i] + " - " + in[i] + " kzt.");

                    }
                }
            }
        }
    }

    public void Cs() {
        Case mn = new Case(cwm, a, ara, in, array);
        mn.run();
    }
}
