package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("\nWelcome to the Admin panel of \"Salam Bro\" Fast Food Station! \nHere you can do the following activites:");
        String cwm = " ";
        String a = " ";
        String[] array = new String[100];
        String[] ara = new String[100];
        int[] in = new int[100];

        for(int i = 0;i< ara.length;i++){
            ara[i] = " ";
        }
        for(int i = 0;i< in.length;i++){
            in[i] = 0;
        }
        for(int i = 0;i< array.length;i++){
            array[i] = " ";
        }


        Add cl = new Add(cwm, a, ara, array, in);
        Scanner s = new Scanner(System.in);



        while (true) {
        System.out.println("\n0. Exit. \n1. Change Welcome Massage. \n2. Change Menu. \n3. Change SubMenu. \n4. Change Prices. \n5. Display Welcome Massage. \n6. Display Menu. \n7. Display SubMenu. \n8. Display Prices. \n9. Switch to Client Mode (coming soon).");
        System.out.print("Choose an activity: ");
        int vybor = s.nextInt();
        System.out.println();

        switch (vybor) {
            case 0:
                break;
            case 1:
                cl.cwm();
                break;
            case 2:
                cl.menu();
                break;
            case 3:
                cl.submenu();
                break;
            case 4:
                cl.price();
                break;
            case 5:
                cl.prCwm();
                break;
            case 6:
                cl.prMenu();
                break;
            case 7:
                cl.prSubmenu();
                break;
            case 8:
                cl.prPrice();
                break;
            case 9:
                cl.Cs();
                break;
            default:


}}}}














