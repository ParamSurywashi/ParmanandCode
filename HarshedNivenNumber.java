package Assignment.Loops;
import java.util.Scanner;
public class HarshedNivenNumber {

  public static void main(String[] args) {
  int sum=0;
  Scanner sk=new Scanner(System.in);
 System.out.print("Enter a Number =   ");
int num=sk.nextInt();
int Tq=num; 
while (num != 0) 

    {

        sum = sum+ (num % 10);
   
        num = num / 10;
    
    }
    if(Tq%sum==0){
    
    System.out.println(Tq + " is Harshed Number or Niven Number...YES. ");
    }
    else{
    
    System.out.println(Tq + "  Number is Not Harshed or Niven Number...NO ");
    
    }
    
  }

}
