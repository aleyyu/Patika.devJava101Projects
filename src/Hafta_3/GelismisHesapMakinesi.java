package Hafta_3;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void addition(){
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true){
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();
            if (number == 0){
                break;
            }
            result += number;
            i++;
        }
        System.out.println("İşlem sonucu: " + result);
    }

    static void minus(){
        Scanner inp = new Scanner(System.in);
        int counter, number, result = 0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = inp.nextInt();

        for (int i = 1; i<= counter; i++){
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("İşlem sonucu: " + result);

    }

    static void multiplication(){
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();

            if (number == 1){
                break;
            }
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
            i++;
        }
        System.out.println("İşlem sonucu: " + result);
    }

    static void division(){
        Scanner inp = new Scanner(System.in);
        int counter;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = inp.nextInt();
        double number, result = 0.0;

        for(int i = 1; i<=counter; i++){
            System.out.print(i + ". sayı: ");
            number = inp.nextInt();
            if(i != 1 && number == 0){
                System.out.println("BÖlen 0 olamaz.");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("İşlem sonucu: " + result);
    }

    static void power(){
        Scanner inp = new Scanner(System.in);
        int alt, us;
        System.out.print("Taban sayısını giriniz: ");
        alt = inp.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        us = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= us; i++){
            result *= alt;
        }
        System.out.println("İşlem sonucu: " + result);
    }

    static void factorial(){
        Scanner inp = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Sayı giriniz: ");
        number = inp.nextInt();

        for(int i = 1; i<= number; i++){
            result *= i;
        }
        System.out.println("İşlem sonucu: " + result);
    }
    static void mod(){
        Scanner inp = new Scanner(System.in);
        int numb1, numb2, result;
        System.out.print("İlk sayıyı giriniz: ");
        numb1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        numb2 = inp.nextInt();
        result = numb1 % numb2;
        System.out.println(numb1 + " mod " + numb2 + " = " + result);
    }
    static void rectangleAreaPerimeter(){
        Scanner inp = new Scanner(System.in);
        int kisaKenar, uzunKenar, perimeter, area;
        System.out.print("Kısa kenar değeri giriniz: ");
        kisaKenar = inp.nextInt();
        System.out.print("Uzun kenar değeri giriniz: ");
        uzunKenar = inp.nextInt();
        perimeter = (2*kisaKenar) + (2*uzunKenar);
        area = kisaKenar * uzunKenar;
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
        System.out.println("Dikdörtgenin alanı: " + area);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int operation;

        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

        do{
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            operation = inp.nextInt();

            switch (operation){
                case 1:
                    addition();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleAreaPerimeter();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
            }
        }while (operation != 0);
    }
}
