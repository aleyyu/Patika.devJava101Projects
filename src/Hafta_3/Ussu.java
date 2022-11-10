package Hafta_3;

import java.util.Scanner;

public class Ussu {

    /*
        Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb;

        System.out.print("Bir sayı giriniz: ");
        numb = inp.nextInt();

        System.out.println("Verilen sayıya kadar olan 4 ve katları");
        for(int i = 1; i <= numb; i*=4){
            System.out.println(i);
        }

        System.out.println("Verilen sayıya kadar olan 5 ve katları");
        for(int i = 1; i <= numb; i*=5){
            System.out.println(i);
        }

    }
}
