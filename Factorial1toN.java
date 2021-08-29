package Assignment.Loops;
import java.util.Scanner;
public class Factorial1toN {

  public static void main(String[] args) {
 int i,f=1; 
 int num=5;
 int sum=0;
 
 Scanner sk=new Scanner(System.in);
 System.out.println("Enter a Number =");
 num=sk.nextInt();
 
   for(i=1;i<=num;i++) 
        { 
          f=f*i;
          sum =sum+f;
       }
    System.out.print("Sum of Factorial 1! to "+ num + "!  =  ");
    System.out.print(sum);
    }
  }


