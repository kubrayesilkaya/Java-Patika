package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName,password,newPassword;

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz:");
        userName = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz:");
        password = input.nextLine();

        if (userName.equals("username") && password.equals("password1234")){
            System.out.println("Başarıyla giriş yaptınız.");
        }else{
            System.out.println("Kullanıcı adı veya şifre bilgisi hatalı.Şifrenizi sıfırlamak istiyor musunuz?");
                System.out.println("Şifrenizi sıfırlamak için yeni şifrenizi giriniz:");
                newPassword = input.nextLine();
                    if (newPassword.equals("password1234")){
                        System.out.println("Şifre oluşturulamadı, lütfen tekrar deneyiniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                        password = newPassword;
                    }
        }
    }
}
