package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner deger = new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz : ");
        mat = deger.nextInt();

        System.out.println("Lütfen fizik notunuzu  giriniz : ");
        fizik = deger.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz : ");
        kimya = deger.nextInt();

        System.out.println("Lütfen türkçe notunuzu girniz : ");
        turkce = deger.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz : ");
        tarih = deger.nextInt();

        System.out.println("Lütfen müzik notunuzu giriniz : ");
        muzik = deger.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        System.out.println("Ortalama : "+ortalama);

        boolean kosul = ortalama>60;

        String sınıfıGecme = kosul ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sınıfıGecme);





    }
}
