package Assignment.Switch;
import java.util.Scanner; 
public class greatestNum {

  public static void main(String[] args) {
int a, b ; int i ; 

System.out.println("Enter a First Number="); 
  Scanner sk=new Scanner(System.in); 
  a=sk.nextInt(); 
  
  System.out.println("Enter a Second number="); 
  b=sk.nextInt(); 
 
if (a>b)i=1; 
if(a<b)i=2; 
 
 
 switch('i') {
 case '1' : 
 System.out.println(a + "is greater than " + b); 
 break ; 
 
 case '2' :
 System.out.println(b + "is greater than " + a); 
 break ; 
 
 default:
 System.out.println(a + "  is Equal to " + b); 
 break ; 
 }
 
  }

}
