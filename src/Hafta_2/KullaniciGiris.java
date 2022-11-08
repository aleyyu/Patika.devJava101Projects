package Hafta_2;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        String userName, password, newPassword;
        int operation;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();
        
        if((userName.equals("aleyna")) && (password.equals("şifrem"))){
            System.out.println("Giriş başarılı");
        }
        else if ((userName.equals("aleyna")) && (password != "şifrem")){
            System.out.print("Şifrenizi yanlış girdiniz. Değiştirmek istiyorsanız 1 yazınız... ");
            operation = inp.nextInt();

            if(operation == 1){
                System.out.print("Yeni şifrenizi giriniz: ");
                inp.nextLine();
                newPassword = inp.nextLine();

                while(newPassword.equals("şifrem")){
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz. Başka bir şifre giriniz: ");
                    newPassword = inp.nextLine();
                }
                password = newPassword;
                System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + password);
            }
        }
        else if((userName != "aleyna") && (password.equals("şifrem"))){
            System.out.println("Kullanıcı adınızı yanlış girdiniz.");
        }
        else{
            System.out.println("Bilgilerinizi yanlış girdiniz.");
        }
    }
}
