package edu.maltepe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int radius;
        double pi = 3.14,centralAngle,areaOfCirclePiece;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle : ");
        radius = input.nextInt();

        System.out.print("Plaese enter the measure of the center angle of the circle : ");
        centralAngle = input.nextDouble();

        areaOfCirclePiece = (pi * (radius*radius) * centralAngle) / 360;

        System.out.println("Area of the circle piece is : "+areaOfCirclePiece);


    }
}
