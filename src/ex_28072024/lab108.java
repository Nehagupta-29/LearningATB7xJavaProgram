package ex_28072024;

import java.util.Scanner;

public class lab108 {
    public static void main(String[] args) {
        float[] marks = new float[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of sub" + (i+1));
            marks[i] = sc.nextFloat();

        }

        //for (int i = 0; i < marks.length; i++) {
           // System.out.println("Marks of the subs are:" + marks[i]);

        //}

       // for (int i = 0; i < marks.length-1; i++) // incorrect logic
        //{
          // marks[i]= marks[i]+ marks[i+1];
            //System.out.println(marks[i]);
        //}
        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average is:"+ avg);

    }
}
