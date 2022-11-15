package Hafta_3;

import java.util.Scanner;

public class HarmonikSeri {
    /*
        Java ile girilen sayının harmonik serisini bulan program yazacağız.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb;
        double result = 0;

        System.out.print("Bir sayı giriniz: ");
        numb = inp.nextInt();

        for(double i = 1; i <= numb; i++){
            result += 1/i;
        }

        System.out.println(numb + " sayısına kadar olan harmonik seri forülü sonucu: " + result);
    }
}
