package Assignment.Loops;
import java.util.Scanner;
public class BasePower {

  public static void main(String[] args) {
  
  int Base, Index; 
  int i; 
  
  
Scanner sk=new Scanner(System.in);
System.out.println("©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©");
System.out.print("Enter a Base = ");
Base = sk.nextInt();
int Power=1;
System.out.print("Enter a Index = ");
Index =sk.nextInt();
System.out.println("©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©");
for(i=1; i<=Index; i++)  {

Power = Power* Base;

}

System.out.println(" Base " +Base+ " is power "+Index+ " = " +Power);
  System.out.println("©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©©");
}
}
