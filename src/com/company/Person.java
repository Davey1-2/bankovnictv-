package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private static String jmeno;
    private static String prijmeni;
    private static String narozeni;
    private static String bydliste;
    public static ArrayList<String> profileSaver = new ArrayList<>();


    public static Scanner sc = new Scanner(System.in);

    public static void personCreate() {

        if (profileSaver.size() < 1) {

            System.out.println("U jake banky chcete zalozit profil?");
            String profile = sc.nextLine();
            profileSaver.add(profile);

            System.out.println("-------------FORMULAR-------------");
            System.out.println("Zadejte krestni jmeno");
            jmeno = sc.nextLine();

            System.out.println("Zadejte prijmeni");
            prijmeni = sc.nextLine();

            System.out.println("Zadejte datum narozeni");
            narozeni = sc.nextLine();

            System.out.println("Zadejte adresu bydliste");
            bydliste = sc.nextLine();

            System.out.println("Vas profil je zalozen");
        } else {
            System.out.println("--------------------------");
            System.out.println("Zvolte bankovni profil");
            for (int i = 0; i < profileSaver.size(); i++) {
                System.out.println(i + ") " + profileSaver.get(i));
            }
            int select = sc.nextInt();
            System.out.println("vybral jste si profil " + profileSaver.get(select));

        }
    }

    public static void personDelete() {
        System.out.println("Ktery profil chcete vymazat?");
        for (int i = 0; i < profileSaver.size(); i++) {
            System.out.println(i + ") " + profileSaver.get(i));
        }
        int selectDel = sc.nextInt();
        profileSaver.remove(selectDel);
        System.out.println("profil je vymazan");
    }

}
