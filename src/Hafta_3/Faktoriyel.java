package Hafta_3;

import java.util.Scanner;

public class Faktoriyel {

    /*
    Java ile faktöriyel hesaplayan program yazıyoruz.

    Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
    N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb, factorial = 1;

        System.out.print("Bir sayı giriniz: ");
        numb = inp.nextInt();

        // (numb!) = 1*2*3*4* ... * numb
        for(int i = 1; i <= numb; i++){ //faktöriyeli veren döngü
            factorial *= i;
        }
        System.out.println(numb + "! işleminin sonucu: " + factorial);

        // kombinasyon

        int eleman, altGrup, combination, elemanFark, factEleman = 1, factAlt = 1, factFark = 1;

        System.out.print("Eleman sayısı giriniz: ");
        eleman = inp.nextInt();

        System.out.print("Alt gruplar için eleman sayısı giriniz: ");
        altGrup = inp.nextInt();

        // n! hesaplanır
        for(int i = 1; i <= eleman; i++){
            factEleman *= i;
        }
        // r! hesaplanır
        for(int i = 1; i <= altGrup; i++){
            factAlt *= i;
        }

        // n ve r'nin farkı alınır
        elemanFark = eleman - altGrup;
        // (n-r)! hesaplanır
        for(int i = 1; i <= elemanFark; i++){
            factFark *= i;
        }

        // C(n,r) = n! / (r! * (n-r)!)
        combination = factEleman / ( factAlt * (factFark));

        System.out.println("Girilen değerlere göre C(" + eleman + "," + altGrup + "): " + combination);
    }
}
