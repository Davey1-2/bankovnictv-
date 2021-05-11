package com.company;

import java.util.Scanner;

public class BankAcc {
    public static Scanner sc = new Scanner(System.in);

    public static void addMoney() {

        System.out.println("Na jaky ucet chcete vlozit penize");
        for (int i = 0; i < Bank.nameSaver.size(); i++) {
            System.out.println(i + ")" + Bank.nameSaver.get(i) + " - zustatek: " + Bank.balanceSaver.get(i));
        }
        int chooseDepAcc = sc.nextInt();
        System.out.println("Kolik penez chcete vlozit?");
        int chooseSum = sc.nextInt();
        System.out.println("Vlozte penize do bankomatu");
        System.out.println("BZZZZBZZZZBEEPBOOP");
        System.out.println("Penize mate nyni na ucte");
        Bank.balanceSaver.set(chooseDepAcc, Bank.balanceSaver.get(chooseDepAcc) + chooseSum);

    }

    public static void takeMoney() {
        boolean takeChecker = true;

        System.out.println("Z jakeho uctu chcete vzit penize");
        for (int i = 0; i < Bank.nameSaver.size(); i++) {
            System.out.println(i + ")" + Bank.nameSaver.get(i) + " - zustatek: " + Bank.balanceSaver.get(i));
        }
        int chooseWitAcc = sc.nextInt();
        while (takeChecker = true) {
            System.out.println("Kolik penez chcete vybrat?");
            int chooseSum = sc.nextInt();
            if (Bank.balanceSaver.get(chooseWitAcc) < chooseSum) {
                System.out.println("Na ucte nemate dostatek penez na vybrani teto castky");
            } else {
                Bank.balanceSaver.set(chooseWitAcc, Bank.balanceSaver.get(chooseWitAcc) - chooseSum);
                System.out.println("BZZZZBZZZZBEEPBOOP");
                System.out.println("Vyber probeghl uspesne");
                takeChecker = false;
                break;

            }

        }


    }

}
