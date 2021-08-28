package Assignment;
import java.util.Scanner; 

public class LeapYear {

  public static void main(String[] args) {
  int year ; 
  System.out.println("Enter a Year ="); 
  
  Scanner sk=new Scanner(System.in); 
  year=sk.nextInt(); 
  
  if(year%4==0){
    System.out.println(year +" is  Leap year"); 
  }
  else{
    System.out.println(year + "is not leap year"); 
  }
  

  }

}
