import java.util.Scanner;

public class aio
{
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    float z;
    float p;
    float r;
    float q;
    float w;
    float x;
    float y;
    
    System.out.print("Enter p: ");
    p = input.nextInt();
    
    System.out.print("Enter r: ");
    r = input.nextInt();

    System.out.print("Enter q: ");
    q = input.nextInt();

    System.out.print("Enter w: ");
    w = input.nextInt();
    
    System.out.print("Enter x: ");
    x = input.nextInt();
    
    System.out.print("Enter y: ");
    y = input.nextInt();
   
    z = ((p * r) % q) + (w / x) - y;

    System.out.printf("The result is %f%n", z);
  }
}

