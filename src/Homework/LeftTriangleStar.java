package Homework;

import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();

        for(int i = number; i>= 1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
