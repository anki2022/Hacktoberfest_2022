import java.util.*;
public class Disp1050
{
 public static void main()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two integers");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int add=a+b;
 int sub=a-b;
 int mult=a*b;
 int div=a/b;
 int rem=a%b;
 System.out.println("Addition is: "+add);
 System.out.println("Subtraction is: "+sub);
 System.out.println("Multiplication is: "+mult);
 System.out.println("Division is: "+div);
 System.out.println("remainder is: "+rem);
 }
}
