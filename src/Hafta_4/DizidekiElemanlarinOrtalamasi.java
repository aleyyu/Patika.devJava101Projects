package Hafta_4;

public class DizidekiElemanlarinOrtalamasi {

    /*
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
     */

    public static void main(String[] args) {

        int numberList[] = {1, 2, 3, 4, 5};
        int sum = 0, listLength = numberList.length, harmonikOrtalama = 0, harmonikSeri = 0;

        for(int i = 0; i < listLength; i++){
            sum += numberList[i];
        }
        sum /= listLength;
        System.out.println("Dizideki elemanların ortalaması: " + sum);

        for(double i = 1; i <= listLength; i++){
            harmonikSeri += 1/i;
        }

        harmonikOrtalama = listLength / harmonikSeri;
        System.out.println("Dizideki eleman sayısına göre harmonik ortalama: " + harmonikOrtalama);

    }
}
