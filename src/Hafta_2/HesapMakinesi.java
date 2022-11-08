package Hafta_2;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, operation;
        double result = 0.0;

        System.out.print("1. sayıyı giriniz: ");
        firstNumber = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        secondNumber = input.nextInt();

        System.out.print("Toplama İşlemi: 1\nÇıkarma İşlemi: 2\nBölme İşlemi: 3\nÇarpma İşlemi: 4\n");
        System.out.print("Bir işlem seçiniz: ");
        operation = input.nextInt();

        switch (operation){
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                if(secondNumber != 0){
                    result = firstNumber/secondNumber;
                    break;
                }
                else{
                    System.out.println("2. sayı 0 olamaz!");
                    break;
                }
            case 4:
                result = firstNumber * secondNumber;
                break;
        }
        System.out.println("Sonuç: "+ result);
    }
}
