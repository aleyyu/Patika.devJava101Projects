package Hafta_2;

import java.util.Scanner;

public class Sorting {
    /*
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("1. sayıyı giriniz: ");
        number1 = inp.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        number2 = inp.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        number3 = inp.nextInt();

        if((number1 > number2) && (number1 > number3)){ // en büyük n1 olma durumu
            if(number2 > number3){ // n1 > n2 > n3
                System.out.println(number1 + ">" + number2 + ">" + number3);
            }
            if(number3 > number2){ // n1 > n3 > n2
                System.out.println(number1 + ">" + number3 + ">" + number2);
            }
        }
        else if((number2 > number1) && (number2 > number3)){ // en büyük n2 olma durumu
            if(number1 > number3){ // n2 > n1 > n3
                System.out.println(number2 + ">" + number1 + ">" + number3);
            }
            if(number3 > number1){ // n2 > n3 > n1
                System.out.println(number2 + ">" + number3 + ">" + number1);
            }
        }
        else if((number3 > number1) && (number3 > number2)){ // en büyük n3 olma durumu
            if(number1 > number2){ // n3 > n1 > n2
                System.out.println(number3 + ">" + number1 + ">" + number2);
            }
            if(number2 > number1){ // n3 > n2 > n1
                System.out.println(number3 + ">" + number2 + ">" + number1);
            }
        }
    }
}
