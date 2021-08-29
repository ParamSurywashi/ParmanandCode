package Assignment.Loops;
import java.util.Scanner;
public class Table {

  public static void main(String[] args) {
int table; 
int i, n; 
Scanner sk=new Scanner(System.in);
System.out.print("Enter a Number for Give Table =");
table=sk.nextInt();

System.out.println("____________________");
for(i=1; i<=10; i++)
{
n=table*i;
System.out.println(+ i + " Multiply " +table + " == " + n);
System.out.println("____________________");
}

  }

}
