package Assignment.Loops;
import java.util.Scanner;
public class Palindrome {

  public static void main(String[] args) {
  int r; 
Scanner sk=new Scanner(System.in);
 System.out.print("Enter a Number =   ");
int num=sk.nextInt();
int CD =num; 
int sum=0;
while(CD>0)
{
r=CD%10;
sum = (sum * 10) + r; 
CD=CD/10;

}

if(sum==num) {
System.out.println(num + "  Number is Palindrome.....Number... ");

}else{
System.out.println(num + "Number is NOT Palindrome... Number");

}
  }

}
