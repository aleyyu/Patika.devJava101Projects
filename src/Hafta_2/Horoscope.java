package Hafta_2;

import java.util.Scanner;

public class Horoscope {
    /*

    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık

    Aynı örneği switch-case kullanmadan yapınız.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int month, day;

        System.out.print("Kaçıncı ayda doğdunuz: ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = inp.nextInt();

        if( ((day < 1) || (day > 31)) || ( (month < 1) || (month > 12) ) ){
            System.out.println("Geçersiz ay veya gün girdiniz.");
        }

        if(month == 1){ // ocak ayı
            if((day >= 1) && (day <= 21)){ // 1-21 ocak --> oğlak
                System.out.println("Burcunuz Oğlak!");
            }
            else if((day > 21) && (day <= 31)){ // 22-31 ocak kova
                System.out.println("Burcunuz Kova!");
            }
        }
        else if(month == 2){ // şubat
            if((day >= 1) && (day <= 19)){ // 1-19 şubat --> kova
                System.out.println("Burcunuz Kova!");
            }
            else if((day > 19) && (day <= 28)){ // 20-28 şubat balık
                System.out.println("Burcunuz Balık!");
            }
        }
        else if(month == 3){ // mart
            if((day >= 1) && (day <= 20)){ // 1-20 mart --> balık
                System.out.println("Burcunuz Balık!");
            }
            else if((day > 20) && (day <= 31)){ // 21-31 mart koç
                System.out.println("Burcunuz Koç!");
            }
        }
        else if(month == 4){ // nisan
            if((day >= 1) && (day <= 20)){ // 1-20 nisan --> koç
                System.out.println("Burcunuz Koç!");
            }
            else if((day > 20) && (day <= 30)){ // 21-30 nisan boğa
                System.out.println("Burcunuz Boğa!");
            }
        }
        else if(month == 5){ // mayıs
            if((day >= 1) && (day <= 21)){ // 1-21 mayıs --> boğa
                System.out.println("Burcunuz Boğa!");
            }
            else if((day > 21) && (day <= 31)){ // 22-31 mayıs ikizler
                System.out.println("Burcunuz İkizler!");
            }
        }
        else if(month == 6){ // haziran
            if((day >= 1) && (day <= 22)){ // 1-22 haziran --> ikizler
                System.out.println("Burcunuz İkizler!");
            }
            else if((day > 22) && (day <= 30)){ // 23-30 haziran yengeç
                System.out.println("Burcunuz Yengeç!");
            }
        }
        else if(month == 7){ // temmuz
            if((day >= 1) && (day <= 22)){ // 1-22 temmuz --> yengeç
                System.out.println("Burcunuz Yengeç!");
            }
            else if((day > 22) && (day <= 31)){ // 23-31 haziran aslan
                System.out.println("Burcunuz Aslan!");
            }
        }
        else if(month == 8){ // ağustos
            if((day >= 1) && (day <= 22)){ // 1-22 ağustos --> aslan
                System.out.println("Burcunuz Aslan!");
            }
            else if((day > 22) && (day <= 31)){ // 23-31 ağustos başak
                System.out.println("Burcunuz Başak!");
            }
        }
        else if(month == 9){ // eylül
            if((day >= 1) && (day <= 22)){ // 1-22 eylül --> başak
                System.out.println("Burcunuz Başak!");
            }
            else if((day > 22) && (day <= 30)){ // 23-30 eylül terazi
                System.out.println("Burcunuz Terazi!");
            }
        }
        else if(month == 10){ // ekim
            if((day >= 1) && (day <= 22)){ // 1-22 ekim --> terazi
                System.out.println("Burcunuz Terazi!");
            }
            else if((day > 22) && (day <= 31)){ // 23-31 ekim akrep
                System.out.println("Burcunuz Akrep!");
            }
        }
        else if(month == 11){ // kasım
            if((day >= 1) && (day <= 21)){ // 1-21 kasım --> akrep
                System.out.println("Burcunuz Akrep!");
            }
            else if((day > 22) && (day <= 30)){ // 22-30 ekim yay
                System.out.println("Burcunuz Yay!");
            }
        }
        else if(month == 12){ // aralık
            if((day >= 1) && (day <= 21)){ // 1-21 aralık yay
                System.out.println("Burcunuz Yay!");
            }
            else if((day > 21) && (day <= 31)){ // 22-31 aralık oğlak
                System.out.println("Burcunuz Oğlak!");
            }

        }


    }
}
