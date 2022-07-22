package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armutKiloUcret = 2.14;
        double elmaKiloUcret = 3.67;
        double domatesKiloUcret = 1.11;
        double muzKiloUcret = 0.95;
        double patlicanKiloUcret = 5.00;

        double kg_armut,kg_elma,kg_domates,kg_muz,kg_patlican,toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen satın aldığınız armutun miktarını kg olarak giriniz : ");
        kg_armut = input.nextDouble();

        System.out.print("Lütfen satın aldığınız elmanın miktarını kilogram olarak giriniz : ");
        kg_elma = input.nextDouble();

        System.out.print("Lütfen satın almış olduğunuz domatesin miktarını kg olarak giriniz : ");
        kg_domates = input.nextDouble();

        System.out.print("Lütfen satın almış olduğunuz muzun miktarını kg olarak giriniz : ");
        kg_muz = input.nextDouble();

        System.out.print("Lütfen satın almış olduğunuz patlıcanın kg olarak miktarını giriniz : ");
        kg_patlican = input.nextDouble();

        toplamTutar = (kg_armut*armutKiloUcret + kg_elma*elmaKiloUcret + kg_domates*domatesKiloUcret +
                       kg_muz*muzKiloUcret + kg_patlican*patlicanKiloUcret);

        System.out.println("Ödemeniz gereken toplam tutar : "+toplamTutar);


    }
}
