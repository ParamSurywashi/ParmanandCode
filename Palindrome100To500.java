package Assignment.Loops;

public class Palindrome100To500 {

  public static void main(String[] args) {

int i, k; 
int r; 
for(i=100; i<=500; i++)
{
int CD = i; 
int sum=0;
while(CD>0)
{
r=CD%10;
sum = (sum * 10) + r; 
CD=CD/10;

}

if(sum==i) {
System.out.println(i);


}
  }
  } 
  }
