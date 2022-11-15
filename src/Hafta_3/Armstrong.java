package Hafta_3;

import java.util.Scanner;

public class Armstrong {

    /*
        ÖDEV
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        ARMSTRONG
        Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

        1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
     */

    public static void main(String[] args) {

        //yapılacaklar
        //1- sayının basamak sayısını bul
        //2- sayıyı basamaklarına ayır
        //3- her basamaktaki sayı üssü basamak sayısı değerlerini bul
        //4- bu değerleri topla sonuca bak

        Scanner inp = new Scanner(System.in);

        //ARMSTRONG KODLARI

        int numb, tempNumb;
        int digitNumber = 0;
        int digitValue = 0;
        int sum = 0;
        int exponent;

        System.out.print("Bir sayı giriniz: ");
        numb = inp.nextInt();
        tempNumb = numb;

        while(tempNumb != 0){ // numb'ın basamak sayısı bulunur
            tempNumb /= 10;
            digitNumber++;
        }

        tempNumb = numb;

        while(tempNumb != 0){
            digitValue = tempNumb % 10; //ilk işlemde digitValue = 7 olur
            exponent = 1; // n. üsse giderken 1 ile başlar

            if(digitValue == 0){ // basamak 0'sa boşuna fora girmeye gerek yok
                exponent = 0;
            }
            else{
                for(int i = 1; i <= digitNumber; i++){ // basamağın n. üssünün değerini bulur
                    exponent *= digitValue;
                }
            }
            sum += exponent;
            tempNumb /= 10;
        }

        if(sum == numb){
            System.out.println(numb + " sayısı Armstrong sayıdır.");
        }
        else{
            System.out.println(numb + " sayısı Armstrong sayı değildir.");
        }

        //ÖDEV

        int number, tempNumber;
        int digits = 0;
        int digitsValue = 0;
        int sumOfDigits = 0;

        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        tempNumber = number;

        while(tempNumber != 0){ // basamak sayısı bulunur
            digitsValue = tempNumber % 10; // birler basamağını verir
            sumOfDigits += digitsValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamaklarının toplamı: " + sumOfDigits);


    }
}
