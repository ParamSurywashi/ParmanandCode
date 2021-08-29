package Assignment.Loops;
import java.util.Scanner;
public class CountDigit {

  public static void main(String[] args) {

int num; 
int count = 0;

Scanner sk=new Scanner(System.in);
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
System.out.print("Enter Any Number of Display Digit = ");
num=sk.nextInt();
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
    while (num != 0) 

    {

        num = num / 10;

        count ++ ;


  }
  
System.out.println(count + " Digit");
System.out.println("••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
}
}
