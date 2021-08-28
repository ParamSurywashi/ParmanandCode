package Assignment;
import java.util.Scanner; 
public class ThreeDigit {

  public static void main(String[] args) {
  
	int num;
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter Any Number You Like :");
	num=sk.nextInt();

	 if(num>99 && num<1000)
	{ 
		System.out.println("It is a Three Digit Number.");
	}
	else
	{
		System.out.println("It is Not a Three Digit Number.");
	}

  }

}
