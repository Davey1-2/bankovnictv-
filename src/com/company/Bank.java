package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    public static ArrayList<String> nameSaver = new ArrayList<>();
    public static ArrayList<Integer> balanceSaver = new ArrayList<>();
    public static int count;
    public static Scanner sc = new Scanner(System.in);

    public static void createAcc() {

        System.out.println("U jake banky si zakladate ucet?");
        String choseBank = sc.nextLine();

        System.out.println("Pojmenujte tento ucet");
        String ucet = sc.nextLine();

        nameSaver.add(ucet);


        if (count == 0) {
            System.out.println("Jelikoz jste vytvoril prvni ucet, mate bonus 500czk ke startu!");
            balanceSaver.add(500);
        } else {
            balanceSaver.add(0);
        }

        System.out.println("Uspesne jste vytvoril/a ucet");
        System.out.println("------------------------------");
        System.out.println("Toto jsou vase ucty:");
        for (int i = 0; i < nameSaver.size(); i++) {
            System.out.println(i + ")" + nameSaver.get(i) + " - zustatek: " + balanceSaver.get(i));
        }
        count++;
    }

    public static void deleteAcc() {
        System.out.println("Ktery ucet chcete vymazat?");
        for (int i = 0; i < nameSaver.size(); i++) {
            System.out.println(i + ")" + nameSaver.get(i) + " - zustatek: " + balanceSaver.get(i));
        }
        int delSelect = sc.nextInt();
        nameSaver.remove(delSelect);
        balanceSaver.remove(delSelect);
        count--;
        System.out.println("Ucet byl uspesne vymazan");
    }

    public static void transferMoney(){

            System.out.println("Z jakeho uctu posilate penize?");
            for (int i = 0; i < nameSaver.size(); i++) {
                System.out.println(i + ")" + nameSaver.get(i) + " - zustatek: " + balanceSaver.get(i));
            }
            int transferMe = sc.nextInt();


            System.out.println("Na jaky ucet posilate penize?");
            for (int i = 0; i < nameSaver.size(); i++) {
                System.out.println(i + ")" + nameSaver.get(i) + " - zustatek: " + balanceSaver.get(i));
            }
            int transferOther = sc.nextInt();
            System.out.println("Zadejte castku kterou chcete poslat");
            int sum = sc.nextInt();

            if (balanceSaver.get(transferMe) < sum){
                System.out.println("Na ucte nemate dostatek penez na vybrani teto castky");
            }
            else {
                System.out.println("Transakce provedena");
                balanceSaver.set(transferMe, balanceSaver.get(transferMe) - sum);
                balanceSaver.set(transferOther, balanceSaver.get(transferOther) + sum);
            }

    }
}
