package Assignment;
import java.util.Scanner; 

public class negetivepositive {

  public static void main(String[] args) {
System.out.println("Enter any Number to check Negative, Positive or Zero="); 
  
  Scanner sk=new Scanner(System.in); 
  int num=sk.nextInt(); 
  if(num>0){
  System.out.println(num + " is Positive"); 
  }
  else if(num==0){  
  System.out.println(num + " is Zero"); 

  }else if (num<0){
    System.out.println(num + " is Négative "); 

  }else{
    System.out.println("Enter Valid Number"); 

  }
}
}
