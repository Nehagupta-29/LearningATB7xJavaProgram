package Homework;

public class Fizzbuzz {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <100; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.print("\nFizzBuzz");
            }
            else if (i%3 == 0)
            {
                System.out.print("\nFizz");
            }
            else if (i%5== 0)
            {
                System.out.print("\nBuzz");
            }
            else
            {
                System.out.printf("\n%d", i);
            }

        }

    }
}
