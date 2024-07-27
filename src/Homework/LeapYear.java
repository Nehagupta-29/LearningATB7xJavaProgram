package Homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();

        boolean leapyear = false;

        if( (year%4 == 0 && year % 100 != 0) || (year%400 == 0))
        {
            leapyear = true;

        }

        if(leapyear)     // my logic was (leapyear== true)
        {
            System.out.println( year+ "This is leapyear");
        }
        else
        {
            System.out.println(year+ "This is not the leapyear");
        }

    }
}
