package Assignment.Loops;
import java.util.Scanner;
public class FrequencyOfDigit {

  public static void main(String[] args) {
  
  int Num , Fq; 
  int Count=0;
  Scanner sk=new Scanner(System.in);
  
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.print("Enter Any Number = ");
  Num=sk.nextInt();
  
  System.out.print("Enter a Digit for find frequency = ");
  Fq=sk.nextInt();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  
while(Num>0){

if(Num%10==Fq) 


Count ++;
Num=Num/10;


}
System.out.println(Count + "     Frequency ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

}
