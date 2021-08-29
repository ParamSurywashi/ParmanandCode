package Assignment.Loops;
import java.util.Scanner;
public class Krishnamurti143 {

  public static void main(String[] args) {

int num,i; 
int fact=1;
int sum=0;
int CD; 

 Scanner sk=new Scanner(System.in);
 System.out.print("Enter a Number ======>>>");
 num=sk.nextInt();

int Tk=num;

 while(Tk!=0)
  {
    CD= Tk % 10;
    fact = 1;

    // finding factorial of the currentDigit
    for(i=1; i<=CD; i++)
    {
      fact =fact* i;
    }

    sum = sum+fact;
    Tk = Tk/10;
  }

  if(sum == num)
  {
    System.out.println("Krishnamurthy Number. is " + num);
  }
  else
  {
    System.out.println("Not ¥¥ a Krishnamurthy Number" + num);
  }

 }
}
