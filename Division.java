
import java.util.Scanner;

public class Division 
{
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    float a;
    float b;
    float div;

    System.out.print("Enter first real number: ");
    a = input.nextInt();

    System.out.print("Now the divisor one ");
    b = input.nextInt();

    div = a/b;

    System.out.printf("Div is %f%n", div);
  }
}
