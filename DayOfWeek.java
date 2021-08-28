package Assignment.Switch;
import java.util.Scanner ; 
public class DayOfWeek {

  public static void main(String[] args) {
System.out.println("Enter a Day number :"); 
Scanner sk=new Scanner(System.in); 
int day=sk.nextInt(); 

switch(day){
  
  case 1:
  System.out.println("1st Day is Monday"); 
  break ; 

  case 2:
  System.out.println("2nd Day is Tuesday"); 
  break ; 
  

  case 3:
  System.out.println("3rd Day is Wednesday"); 
  break ; 

  case 4:
  System.out.println("4th Day is Thursday"); 
  break ; 

  case 5:
  System.out.println("5th Day is Friday"); 
  break ; 

  case 6:
  System.out.println("6th Day is Saturday"); 
  break ; 

  case 7:
  System.out.println("7th Day is Sunday"); 
  break ; 

default:
System.out.println("Plz Enter a Day number in week like 1 to 7"); 
System.out.println("ERROR, " + day + " Number of Day is not Exiest in Day number in week"); 
  }
}
}
