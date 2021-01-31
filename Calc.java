import java.util.Scanner;
 
public class JavaProgram
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float divide;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first=in.nextInt();
    second=in.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}
