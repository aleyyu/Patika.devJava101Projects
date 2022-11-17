package Hafta_3;

import java.util.Scanner;

public class PalindromSayi {

    /*
    Palindrom sayı: iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb;
        int temp, reverseNumber = 0, lastNumber = 0;

        System.out.print("Bir sayı giriniz: ");
        numb = inp.nextInt();

        temp = numb;

        while(temp != 0){
            lastNumber = temp % 10;                            // temp'in son basamağı (birler basamağı) lastNumber'a eşitlendi
            reverseNumber = (reverseNumber * 10) + lastNumber; //reverse numberın ilk basamağı lastNumber yapıldı
            temp /= 10;                                        //temp'in birler basamağı silindi
        }

        System.out.println("Girilen number: " + numb);
        System.out.println("reverse number: " + reverseNumber);
        if(numb == reverseNumber){
            System.out.println("Girilen sayı palindromdur");
        }
        else{
            System.out.println("Girilen sayı palindrom değildir");
        }

    }
}
