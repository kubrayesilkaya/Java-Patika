package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sayi1, sayi2;
        int islemNumarasi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz:");
        sayi1 = input.nextDouble();

        System.out.print("Lütfen ikinci sayıyı giriniz:");
        sayi2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
        islemNumarasi = input.nextInt();

        switch (islemNumarasi) {

            case 1:     //toplama işlemi
                System.out.println(sayi1 + sayi2);
                break;

            case 2:     //Çıkarma işlemi
                System.out.println(sayi1 - sayi2);

            case 3:     //çarpma işlemi
                System.out.println(sayi1 * sayi2);
                break;

            case 4:     //bölme işlemi
                if (sayi2 == 0) {
                    System.out.println("Bölünenen sayı 0 olamaz.İşlem başarısız.");
                } else {
                    System.out.println(sayi1 / sayi2);
                }

            default:
                System.out.println("Hata!");
        }
    }
}
