package Hafta_4;

import java.util.Scanner;
import java.util.Arrays;

public class DizidekiMaxveMin {

    /*
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int[] numbersList = {5, 12, 32, 24, 9};
        int minNumber = numbersList[0];
        int maxNumber = numbersList[0];
        int userValue;

        for(int i:numbersList){
            if(i > maxNumber){ // dizideki en büyük sayıyı bulur
                maxNumber = i;
            }
            if(i < minNumber){ // dizideki en küçük sayıyı bulur
                minNumber = i;
            }
        }
        System.out.println("Dizideki en küçük eleman: " + minNumber);
        System.out.println("Dizideki en büyük eleman: " + maxNumber);

        System.out.print("Bir sayı giriniz: "); // sayı 15 ise küçük en büyük => 12, büyük en küçük => 24
        userValue = inp.nextInt();

        int greaterSmallest = numbersList[0];   // sayıdan büyük en küçük
        int lessBiggest = numbersList[0];       // sayıdan küçük en büyük

        Arrays.sort(numbersList);
        System.out.println("dizi: ");
        for(int i:numbersList){
            System.out.println(i);
        }

        // 5, 9, 12, 24, 32   -----  15
        for(int i = 0; i < numbersList.length; i++){
            while (userValue > numbersList[i]){ // dizideki girilen sayıdan büyük elemanlar
                lessBiggest = numbersList[i];
                break;
            }
        }

        for(int i = numbersList.length - 1; i >= 0; i--){
            while(userValue < numbersList[i]){
                greaterSmallest = numbersList[i];
                break;
            }
        }

        System.out.println(userValue + " değerinden küçük en büyük sayı: " + lessBiggest);
        System.out.println(userValue + " değerinden büyük en küçük sayı: " + greaterSmallest);

    }
}
