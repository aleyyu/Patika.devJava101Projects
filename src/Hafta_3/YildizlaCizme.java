package Hafta_3;

import java.util.Scanner;

public class YildizlaCizme {

    /*
        Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

        numb sayısı kadar
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        /*
        int numb;

        System.out.print("Basamak sayısını giriniz: ");
        numb = inp.nextInt();

        //ÜÇGEN ÇİZME

        for(int i = 1; i <= numb; i++){ // satırlar
            for (int j = 1; j <= (numb - i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= ((2*i) - 1); j++){
                System.out.print("*");
            }

            System.out.println();
        }
        */

        //ELMAS ÇİZME

        int digit;
        int middle;

        System.out.print("Tek bir basamak sayısı giriniz: ");
        digit = inp.nextInt();

        middle = (digit/2) + 1; // digit = 9 middle = 5

        for(int i = 1; i <= middle; i++){      // en çok yıldızın olduğu satıra kadar gider
            for(int j = 1; j <= middle - i; j++){      // 0 boşluğa kadar olan boşluklar
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2*i)- 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = middle - 1; i >= 1; i--){ // i = 4
            for(int j = 1; j <= middle - i; j++){ // middle - i = 5 - 4 = 1
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){ // j = 2*6 -1 = 11
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
