package Assignment;
import java.util.Scanner;
public class Maximum3number {

  public static void main(String[] args) {
int a, b, c; 

System.out.println("Enter a First Number="); 
  Scanner sk=new Scanner(System.in); 
  a=sk.nextInt(); 
  
  System.out.println("Enter a Second number="); 
  b=sk.nextInt(); 
  
  System.out.println("Enter a Third Number="); 
  c=sk.nextInt(); 
  
  
  if(a>b)
  {
  if(a>c)
  {
  System.out.println(a + " is greater "); 
  
  }
  }else
  if (b>c)
  {
  if(b>a)
  {
  System.out.println(b + "is greater"); 
  }
  }
 else
 {
 System.out.println(c + "is greater"); 
  }
  }
  }
  
  
  


