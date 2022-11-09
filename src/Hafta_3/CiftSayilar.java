package Hafta_3;

import java.util.Scanner;

public class CiftSayilar {

    /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb, count = 0, avr = 0;

        System.out.print("Enter a number greater than 0: ");
        numb = inp.nextInt();

        while(numb < 0){
            System.out.println("Please enter a number greater than 0: ");
            inp.nextInt();
            numb = inp.nextInt();
        }

        for(int i = 0; i <= numb; i++){ // 0'dan sayıya kadar olan çift sayıları yazdırır.
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        for(int i = 1; i <= numb; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                avr += i;
                count++;
            }
        }
        System.out.println("The average of numbers from 0 to " + numb + " is: " + avr/count);

    }
}
