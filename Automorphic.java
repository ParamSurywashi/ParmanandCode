package Assignment.Loops;
import java.util.Scanner;
public class Automorphic {

  public static void main(String[] args) {
 
Scanner sk=new Scanner(System.in);
 System.out.print("Enter a Number =   ");
int num=sk.nextInt();
int SqN=num * num; 

while (num > 0)   
{   

if (num % 10 != SqN% 10)   

System.out.println("NO,This number is Not Automorphic. Number..... ");
 
num = num/10;   
SqN= SqN/10;   
}   
System.out.println("YES,This is AutoMorphic Number......");   



}
}   
  


