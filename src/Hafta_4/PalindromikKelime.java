package Hafta_4;

import java.util.Scanner;

public class PalindromikKelime {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String str, reversedStr = "";

        System.out.print("Bir kelime giriniz: ");
        str = inp.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }

        if(str.equals(reversedStr)){
            System.out.println("Girdiğiniz '" + str + "' kelimesi Palindrome Kelimedir.");
        }
    }

}
