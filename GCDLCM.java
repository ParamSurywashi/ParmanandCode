package Assignment.Assignment27;
import java.util.Scanner;
public class GCDLCM {

  public static void main(String[] args) {
  int fn, sn; 
  int i, gcd=1;
  Scanner sk=new Scanner(System.in);
  
  System.out.print("Enter a First Number=");
fn=sk.nextInt();
System.out.print("Enter a Second Number=");
sn=sk.nextInt();


for(i=1; i<=fn && i<=sn;  i++)
{
if(fn%i==0 && sn%i==0)
{
gcd=i;
}
}
System.out.println("GCD of " +fn + " and " +sn+" is =" +gcd); 

float lcm=(fn*sn)/gcd; 

System.out.println("LCM of " +fn + " and " +sn+" is =" +lcm); 


  }

}
