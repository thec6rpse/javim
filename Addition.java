// Summing up two numbers and display accordingly with user input

import java.util.Scanner;

public class Addition
{
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int a;
    int b;
    int sum;

    System.out.print("Enter first integer: ");
    a = input.nextInt();

    System.out.print("Now the second integer ");
    b = input.nextInt();

    sum = a + b;

    System.out.printf("Sum is %d%n", sum);
  }
}
