package VendarMachine;
import java.util.Scanner ; 

public class BankCashWidrawal {

  public static void main(String[] args) 
  {
  int
  Amount, originalAmount, 
  twothousand, fivehundred, twohundred,
  onehundred, fifty, twenty, ten, five ,one; 
 
System.out.println("____________________________________________________"); 
System.out.println("Enter Any Amount for you want ="); 

Scanner sk=new Scanner(System.in); 
Amount=sk.nextInt(); 

System.out.println("____________________________________________________"); 
originalAmount=Amount; 
{
twothousand=Amount/2000; 
Amount=Amount%2000; 
fivehundred= Amount/500; 
Amount=Amount%500;
twohundred=Amount/200; 
Amount=Amount%200; 
onehundred=Amount/100; 
Amount=Amount%100; 
fifty=Amount/50; 
Amount=Amount%50; 
twenty=Amount/20; 
Amount=Amount%20; 
ten=Amount/10; 
Amount=Amount%10;
five=Amount/5; 
Amount=Amount%5; 
one=Amount/1; 
//Amount=Amount%1; 

System.out.println("Total Amount is = " + originalAmount); 

System.out.println("____________________________________________________"); 
System.out.println("2000rs Note = "  + twothousand); 
System.out.println("500rs Note = " + fivehundred); 
System.out.println("200rs Note = " + twohundred); 
System.out.println("100rs Note = " + onehundred ); 
System.out.println("50rs Note = " + fifty); 
System.out.println("20rs Note = " +twenty); 
System.out.println("10rs Note = " + ten); 
System.out.println("5rs Note = " + five); 
System.out.println("1 rs Note = " +one); 

System.out.println("____________________________________________________"); 
  }
  }

}
