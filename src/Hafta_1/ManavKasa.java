package Hafta_1;

import java.util.Scanner;

public class ManavKasa {
    /*
    Java ile kullanıcıların manavdan almış oldukları ürünlerin
    kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutPrice = 2.14;
        double elmaPrice = 3.67;
        double domatesPrice = 1.11;
        double muzPrice = 0.95;
        double patlicanPrice = 5.00;

        double armut, elma, domates, muz, patlican, toplam;

        System.out.print("Armut için kg değeri giriniz: ");
        armut = input.nextDouble();

        System.out.print("Elma için kg değeri giriniz: ");
        elma = input.nextDouble();

        System.out.print("Domates için kg değeri giriniz: ");
        domates = input.nextDouble();

        System.out.print("Muz için kg değeri giriniz: ");
        muz = input.nextDouble();

        System.out.print("Patlıcan için kg değeri giriniz: ");
        patlican = input.nextDouble();

        armutPrice *= armut;
        elmaPrice *= elma;
        domatesPrice *= domates;
        muzPrice *= muz;
        patlicanPrice *= patlican;

        toplam = armutPrice + elmaPrice + domatesPrice + muzPrice + patlicanPrice;

        System.out.println("Toplam tutar: "+ toplam);

    }
}
