package Hafta_2;

import java.util.Scanner;

public class UcakBileti {

    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve
    sonrasındaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    -Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    -Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    -Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    -Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    -Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int distance, age, travelType;
        double pricePerKm = 0.10;
        double ticketPrice, netPrice;
        double ageDiscount;
        double travelTypeDiscount = 0.0;

        System.out.print("Mesafeyi km cinsinden girin: ");
        distance = inp.nextInt();

        System.out.print("Yaşınızı girin: ");
        age = inp.nextInt();

        System.out.print("Tek Yön: 1 - Gidiş-Dönüş: 2 --> Birini seçiniz: ");
        travelType = inp.nextInt();

        //kontroller
        if(distance < 0){
            System.out.print("Lütfen geçerli bir mesafe giriniz.");
            //inp.nextInt();
            //distance = inp.nextInt();
        }
        else if(age < 0){
            System.out.print("Lütfen geçerli bir yaş giriniz.");
            //inp.nextInt();
            //age = inp.nextInt();
        }
        else if( (travelType < 0) || (travelType > 2) ){
            System.out.print("Lütfen geçerli bir seyahat tipi giriniz.");
            //inp.nextInt();
            //travelType = inp.nextInt();
        }
        else{

            ticketPrice = distance * pricePerKm;

            System.out.println("İndirimsiz bilet fiyatı: "+ ticketPrice);

            //yaş indirimleri
            /*
                -Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                -Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                -Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            */
            if(age<12){
                ageDiscount = (ticketPrice/2);
                ticketPrice -= ageDiscount;
            }
            else if(age <= 24){
                ageDiscount = (ticketPrice * 0.10);
                ticketPrice -= ageDiscount;
            }
            else if(age>65){
                ageDiscount = (ticketPrice*0.30);
                ticketPrice -= ageDiscount;
            }

            System.out.println("Yaş indirimli: "+ ticketPrice);

            //yolculuk tipi indirimi
            /*
                -Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
            */
            if(travelType == 1){
                netPrice = ticketPrice;
                System.out.println("Biletin son fiyatı: "+ netPrice);
            }
            else if(travelType == 2){
                ticketPrice -= ticketPrice * 0.2;
                netPrice = ticketPrice * 2;
                System.out.println("Biletin son fiyatı: "+ netPrice);
            }



        }



    }




}
