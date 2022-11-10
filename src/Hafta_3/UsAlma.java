package Hafta_3;

import java.util.Scanner;

public class UsAlma {

    /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int alt, ust, result = 1, counter = 1;

        System.out.print("Taban sayısını giriniz: ");
        alt = inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        ust = inp.nextInt();

        // while kullanarak;
        /*

        while(counter <= ust){
            result *= alt;
            counter++;
        }
        System.out.println(alt + "^^" + ust + " işleminin sonucu: " + result);

        */

        // for kullanarak;

        for(int i = 1; i <= ust; i++){
            result *= alt;
        }
        System.out.println(alt + "^^" + ust + " işleminin sonucu: " + result);
    }
}
