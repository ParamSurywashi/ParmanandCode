package Assignment;
import java.util.Scanner;
public class Days {

  public static void main(String[] args) {
  
System.out.println("Enter a month number :"); 
Scanner sk=new Scanner(System.in); 
int month=sk.nextInt(); 

switch(month){
  
  case 1:
  System.out.println("31 Days in January"); 
  break ; 

  case 2:
  System.out.println("28 or 29 Days in Febuary"); 
  break ; 
  

  case 3:
  System.out.println("31 Days in March"); 
  break ; 

  case 4:
  System.out.println("30 Days in April"); 
  break ; 

  case 5:
  System.out.println("31 Days in May"); 
  break ; 

  case 6:
  System.out.println("30 Days in Jun"); 
  break ; 

  case 7:
  System.out.println("31 Days in July"); 
  break ; 

  case 8:
  System.out.println("31 Days in Auguest"); 
  break ; 

  case 9:
  System.out.println("30 Days in September"); 
  break ; 

  case 10:
  System.out.println("31 Days in Octomber"); 
  break ; 
  
  case 11:
  System.out.println("30 Days in Number"); 
  break ; 

  case 12:
  System.out.println("31 Days in December"); 
  break ; 

}

  }

}
