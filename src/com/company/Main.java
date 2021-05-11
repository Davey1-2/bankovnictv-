package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        boolean end = true;

        while (end) {
            Person.personCreate();
            System.out.println("Jakou akci chcete provest?");
            System.out.println("----------------------------");
            System.out.println("1) Zalozit novy bankovni ucet");
            System.out.println("2) Smazat bankovni ucet");
            System.out.println("3) Pridat penize na bankovni ucet - bankomat");
            System.out.println("4) Vybrat penize z bankovniho uctu - bankomat");
            System.out.println("5) Poslat penize na jiny ucet");
            System.out.println("6) Smazat profil");
            System.out.println("7) Odejit");
            int chooseThing = sc.nextInt();
            if (chooseThing == 1) {
                Bank.createAcc();
            }
            if (chooseThing == 2) {
                Bank.deleteAcc();
            }
            if (chooseThing == 3) {
                BankAcc.addMoney();
            }
            if (chooseThing == 4) {
                BankAcc.takeMoney();
            }
            if (chooseThing == 5) {
                Bank.transferMoney();
            }
            if (chooseThing == 6) {
                Person.personDelete();
            }
            if (chooseThing == 7){
                end = false;
            }
            a++;
        }


    }
}
