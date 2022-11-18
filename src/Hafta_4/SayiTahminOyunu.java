package Hafta_4;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    /*
        Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
        kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
        5 yanlış cevap hakkı var
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int userGuess, wrong = 5;
        boolean win = false;

        Random rand = new Random();
        int number = rand.nextInt(100);

        while (wrong > 0) {
            System.out.print("Lütfen 0 ile 100 arasında bir sayı giriniz: ");
            userGuess = inp.nextInt();

            if (userGuess > 100 || userGuess < 0) {
                System.out.println("Lütfen 0-100 arası bir sayı giriniz.");
                continue;
            }

            if (userGuess == number) {
                System.out.println("Doğru tahmin! Tahmin ettiğin sayı: " + number);
                win = true;
                break;
            } else {
                System.out.println("Yanlış tahmin. Bir daha deneyin. Kalan hakkınız: " + wrong);
                wrong--;
                if (userGuess > number) {
                    System.out.println("Daha küçük bir sayı girmelisiniz.");
                } else {
                    System.out.println("Daha büyük bir sayı girmelisiniz.");
                }
            }

        }

        if(!win){
            System.out.println("Tahmin hakkınız bitti. Kaybettiniz!");
        }


    }
}
