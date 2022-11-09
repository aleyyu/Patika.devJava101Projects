package Hafta_3;

import java.util.Scanner;

import java.util.Scanner;

public class TekSayilar {

    /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb, total = 0;
        int evenNumb, evenTotal = 0;

        // Girilen pozitif sayılardan tek olanları toplama
        do {
            System.out.print("Enter a number greater than 0: ");
            numb = inp.nextInt();

            if(numb % 2 == 1){
                total += numb;
            }
        }
        while(numb > 0);

        System.out.println("The total of odd numbers given: " + total);


        // Girilen çift sayılardan 4'e bölünebilenleri toplama
        do {
            System.out.print("Enter an even number: ");
            evenNumb = inp.nextInt();

            if(evenNumb % 4 == 0){
                evenTotal += evenNumb;
            }

        }
        while(evenNumb % 2 == 0);

        System.out.println("The total of even numbers given that can be divided by 4 is: " + evenTotal);
    }
}
