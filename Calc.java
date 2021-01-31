import java.util.Scanner;
public class AddTwoNumbers
{
       public static float add(float a, float b)
   {
      float sum = a + b;
      return sum;
   }
      public static float sub(float a, float b)
   {
      float dif= a - b;
      return dif;
   }
      public static float mul(float a, float b)
   {
      float pro= a * b;
      return pro;
   }
      public static float div(float a, float b)
   {
      float div;
      div=a>b?a/b:b/a;
      return div;
   }
   
   public static void main(String[] args)
   {
      float num1, num2, s,d,m,di;
      Scanner sc = new Scanner(System.in);
      System.out.println("First number : ");
      num1 = sc.nextInt();
      System.out.println("Second number : ");
      num2 = sc.nextInt();
      s = add(num1, num2);
      System.out.println("Sum : " + s);
    d= sub(num1, num2);
      System.out.println("Difference : " + d);
    m = mul(num1, num2);
      System.out.println("Product : " + m);
        di = div(num1, num2);
      System.out.println("Division : " + di);
      sc.close();
   }

}
