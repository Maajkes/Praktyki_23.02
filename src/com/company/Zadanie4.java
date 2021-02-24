package com.company;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Podaj kat a ");
        int kata = scanner.nextInt();
        System.out.println(" Podaj kat b ");
        int katb = scanner.nextInt();
        System.out.println(" Podaj kat c ");
        int katc = scanner.nextInt();

        if (kata + katb > katc)
            System.out.println(" Trojkat Prawidlowy ");
        else
            System.out.println(" Trojkat Nieprawidlowy");
    }
}