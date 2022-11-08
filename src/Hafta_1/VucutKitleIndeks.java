package Hafta_1;

import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        /*

         */
        Scanner input = new Scanner(System.in);

        double boy, kilo, vki;

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        vki = (kilo / (boy*boy));

        System.out.println("Vücut kitle indeksiniz: "+ vki);
    }
}
