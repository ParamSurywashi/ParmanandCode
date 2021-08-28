package Assignment;
import java.util.Scanner; 
public class Calculator {

  public static void main(String[] args) 
  {
  int first, second ; 
  int sum, sub, div, mul ; 
  char sign ; 
Scanner sk=new Scanner(System.in); 

System.out.println("____________________________________________________"); 
System.out.println("<<<<<-----------------CALCULATOR---------------------->>>>>"); 

System.out.println("____________________________________________________"); 
System.out.println("Enter a First Number  ="); 
first=sk.nextInt(); 
System.out.println("Enter a Second Number ="); 
second=sk.nextInt(); 

System.out.println("____________________________________________________"); 
System.out.println("Choice Any Operation like + ,  -  , * ,  / "); 
sign=sk.next( ).charAt(0);

System.out.println("____________________________________________________"); 
if(sign== '+'){
sum=first+second ; 
System.out.println(first +" "+sign +" "+second +"= "+" "+ sum); 
System.out.println("Sum of the number is =" + sum); 
  }
else if(sign=='-')
{
sub=first-second ; 
System.out.println(first +" "+sign +" "+second +"= "+" "+ sub); 
System.out.println("Substraction of the number is =" + sub); 
  }
  else if(sign=='/'){
div=first/second ; 
System.out.println(first +" "+sign +" "+second +"= "+" "+ div); 
System.out.println("Division of the number is =" + div); 
  }
else if(sign=='*'){
mul=first*second ; 
System.out.println(first +" "+sign +" "+second +"= "+" "+ mul); 
System.out.println("Multiplication of the number is =" + mul); 
  }

else{
System.out.println("Enter a Valid Operation ::::::::::::"); 
}

System.out.println("____________________________________________________"); 
}
}