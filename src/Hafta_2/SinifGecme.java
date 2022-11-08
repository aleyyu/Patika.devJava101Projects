package Hafta_2;

import java.util.Scanner;

public class SinifGecme {
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat, fizik, turk, kimya, music, ortalama;
        int gecmeNotu = 55;
        int dersSayi = 0;
        int toplam = 0;

        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();
        if(mat>0 && mat<=100){
            toplam += mat;
            dersSayi++;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = inp.nextInt();
        if(fizik>0 && fizik<=100){
            toplam += fizik;
            dersSayi++;
        }


        System.out.print("Türkçe notunu giriniz: ");
        turk = inp.nextInt();
        if(turk>0 && turk<=100){
            toplam += turk;
            dersSayi++;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = inp.nextInt();
        if(kimya>0 && kimya<=100){
            toplam += kimya;
            dersSayi++;
        }

        System.out.print("Müzik notunu giriniz: ");
        music = inp.nextInt();
        if(music>0 && music<=100){
            toplam += music;
            dersSayi++;
        }

        ortalama = toplam/dersSayi;
        System.out.println("Toplam ders sayısı:"+dersSayi);
        System.out.println("Öğrencinin ortalaması: "+ ortalama);
        if(ortalama>55){
            System.out.println("Öğrenci sınıfı geçti.");
        }
        else{
            System.out.println("Öğrenci sınıfı geçemedi.");
        }
    }
}
