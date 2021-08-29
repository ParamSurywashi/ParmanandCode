package Assignment.Loops;
import java.util.Scanner;
public class SumOneTonOdd {

  public static void main(String[] args) {

int n; 
int i; 
int Sum=0;
Scanner sk=new Scanner(System.in);
System.out.println("____________________________________________________"); 
System.out.println("Enter a number for Find Sum of ODD Number till Number = ");
n=sk.nextInt();
System.out.println("____________________________________________________"); 
for(i=1; i<=n; i++)
{
if(i%2!=0){
System.out.println( "                " + i);
Sum=Sum + i;


}
}
System.out.println(" ");
System.out.println("____________________________________________________"); 
System.out.println("Sum is  " +Sum); 

System.out.println("____________________________________________________"); 

  }

}

  


