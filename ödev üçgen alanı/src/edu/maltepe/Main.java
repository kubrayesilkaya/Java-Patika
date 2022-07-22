package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c,alan,cevre,u;

        Scanner deger = new Scanner(System.in);

        System.out.println("üçgenin 1.kenarının degerini giriniz : ");
        a = deger.nextDouble();

        System.out.println("üçgenin 2.kenarının degerini giriniz : ");
        b = deger.nextDouble();

        System.out.println("üçgenin 3.kenarının degerini giriniz : ");
        c = deger.nextDouble();

        cevre = a + b + c;
        u = cevre/2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı : "+alan);




    }
}
