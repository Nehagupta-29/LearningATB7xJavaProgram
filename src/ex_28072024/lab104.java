package ex_28072024;

import java.util.Scanner;

public class lab104 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        marks[0] = 91;
        marks[1] = 90;
        marks[2] = 94;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in array");
        marks[0] = sc.nextInt();

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Value at"+ i+ "is :"+ marks[i]);

        }

    }
}
