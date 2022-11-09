package Hafta_2;

import java.util.Scanner;

public class ArtikYil {
    /*
    Artık Yıl Nasıl Hesaplanır?
    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
    1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
    100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

    Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
    Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
    bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int year;

        System.out.print("Bir yıl giriniz: ");
        year = inp.nextInt();

        if(year % 100 == 0){ // 100ün katı olan yıllar
            if(year % 400 == 0){ // 100ün katıysa 400e kalansız bölünenler artıktır
                System.out.println(year + " yılı artık yıldır.");
            }
            else{
                System.out.println(year + " yılı artık yıl değildir.");
            }
        }
        else{ // 100ün katı değilse 4e bölünmeye bakılır
            if((year % 4) == 0){ // 100ün katı olmayıp e bölünebilen yıllar
                System.out.println(year + " yılı artık yıldır.");
            }
            else{
                System.out.println(year + " yılı artık yıl değildir.");
            }
        }

    }
}
