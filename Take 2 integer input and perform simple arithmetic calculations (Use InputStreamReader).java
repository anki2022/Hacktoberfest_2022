import java.io.*;
public class Disp1050
{
 public static void main() throws NumberFormatException, IOException
 {
 InputStreamReader read= new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(read);
 System.out.println("Enter two integers");
 int a=Integer.parseInt(br.readLine());
 int b=Integer.parseInt(br.readLine());
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
