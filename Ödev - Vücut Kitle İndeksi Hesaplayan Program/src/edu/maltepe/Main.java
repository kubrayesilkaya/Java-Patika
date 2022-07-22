package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double weight,height,bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weight as kg(kilogram) : ");
        weight = input.nextDouble();

        System.out.print("Please enter your height as m(metre): ");
        height = input.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.println("Your body mass index is equal : "+bodyMassIndex);

    }
}
