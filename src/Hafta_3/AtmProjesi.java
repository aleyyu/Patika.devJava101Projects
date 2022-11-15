package Hafta_3;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 500;
        int select;
        int price = 0;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = inp.nextLine();

            System.out.print("Parolanız : ");
            password = inp.nextLine();

            if (userName.equals("aleyyu") && password.equals("aleyyu1234")) {
                System.out.println("Merhaba, Bankamıza Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak para miktarı : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapıldı. Tekrar görüşmek üzere.");
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyin.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
