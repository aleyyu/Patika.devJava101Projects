package Hafta_3;

import java.util.Scanner;

public class EbobEkok {

    /*
    EBOB: 2 ya da daha fazla sayının ortak bölenlerinin en büyüğü
    örn: 18 ve 24 ebob => 18 bölenleri: 1 2 3 6 9 18..
                          24 bölenleri: 1 2 3 4 6 8 12 24..
                          ebob = 6

    EKOK: 2 ya da daha fazla sayının ortak katlarının en küçüğü
    örn: 6 ve 8 ekok => 6 katları: 6 12 18 24 30 36 42 48..
                        8 katları: 8 16 24 32 40 48..
                        ekok = 24

    ekok = (n1*n2)/ebob

    ödev: 2 sayının ebob ve ekok değerlerini while ile bul
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb1, numb2;
        int ebob = 0;
        int ekok = 0;
        int bolen1 = 1;
        int bolen2  = 1;

        System.out.print("İlk sayıyı giriniz: ");
        numb1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        numb2 = inp.nextInt();

        //ebob bulan döngü
        while(bolen1 <= numb1 && bolen2 <= numb2){
            if(numb1 % bolen1 == 0 && numb2 % bolen2 == 0){ //eğer bölenler iki sayıyı da tam bölüyorsa
                if(bolen1 == bolen2){ // eğer bölenler birbirine eşitse
                    ebob = bolen1;
                }
            }
            bolen1++;
            bolen2++;
        }
        ekok = (numb1*numb2)/ebob;

        System.out.println("ebob: " + ebob);
        System.out.println("ekok: " + ekok);


    }
}
