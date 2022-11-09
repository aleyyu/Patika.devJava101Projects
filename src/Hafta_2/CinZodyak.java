package Hafta_2;

import java.util.Scanner;

public class CinZodyak {
    /*
    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
    Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
    yıldızlarla pek bir ilgisi yoktur.

    Çin Zodyağı nasıl hesaplanır?

    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int birthYear, zodyakNumber;
        String zodyak = "";

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = inp.nextInt();

        zodyakNumber = birthYear % 12;

        switch (zodyakNumber){
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı burcunuz: "+ zodyak);


    }
}
