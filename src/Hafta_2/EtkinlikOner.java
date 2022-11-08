package Hafta_2;

import java.util.Scanner;

public class EtkinlikOner {
    /*
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    İlk akla gelen klasik if else yapısından farklı yap
     */
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = inp.nextInt();

        if(heat<=15){ // Seçenekler --> Sinema veya Kayak
            if(heat>=5){ // 5 <= heat <= 15 --> Sinema
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else { // heat < 5 --> Kayak
                System.out.println("Kayak yapabilirsiniz.");
            }
        }
        else{ // heat > 15 Seçenekler --> Piknik veya Yüzme
            if(heat <= 25 ){ // 15 < heat <= 25 --> Piknik
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            else{ // heat > 25 --> Yüzme
                System.out.println("Yüzmeye gidebilirsiniz.");
            }
        }

    }
}
