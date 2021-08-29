package Assignment.Loops;
import java.util.Scanner;
public class ProductOfDigit {

  public static void main(String[] args) {
int num; 
int product = 1;

Scanner sk=new Scanner(System.in);
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
System.out.print("Enter Any Number to given Product Of Digit= ");
num=sk.nextInt();
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");


 

    while (num != 0) 

    {

        product = product * (num % 10);
   
        num = num / 10;
    
    }
    
System.out.println(product + "  = Product of Digit that Number");
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
  }

}
