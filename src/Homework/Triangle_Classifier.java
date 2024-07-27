package Homework;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        System.out.println("Sides of the triangles are:");
        System.out.println(side1);
        System.out.println(side2);
        System.out.println(side3);

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Triangle is equillateral");

        } else if (side1== side2 || side2== side3 || side1== side3)

        //((side1 == side2 || side1 == side3) || (side2 == side3 || side2 == side1)) // AT first time i use this logic
        {
            System.out.println("Isoceles triangle");


        }
        else
        {
            System.out.println("Scalene triangle");
        }

        sc.close();


    }
}
