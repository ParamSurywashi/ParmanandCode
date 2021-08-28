package Assignment;
import java.util.Scanner; 
public class divisionBy5and11
 {
  public static void main(String[] args) {
System.out.println("Enter a Number for Check divisal by 5 and 11 or Not ="); 
  
  Scanner sk=new Scanner(System.in); 
  int num=sk.nextInt(); 
  
  if(num%5==0)
  {
  if(num%11==0)
 {
  System.out.println(num + " is Divisible by 5 and 11"); 
  }else{
    System.out.println(num + "is not divisible by 5 and 11"); 
  }
  }
else
{
System.out.println(num + "is not divisible by 5 and 11"); 
}
}
}