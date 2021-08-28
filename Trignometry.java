package Assignment.Switch;
import java.util.Scanner; 
public class Trignometry {

  public static void main(String[] args) {
double ans ; 
Scanner sk=new Scanner(System.in); 
System.out.println("________________________________________________________"); 
System.out.println("Enter a operation for you want like \n Area of Circle = 1 \nArea of Square = 2 \n Area of a right angled triangle = 3 \nArea of RectAngle = 4 \nCircumference of a circle = 5 \nPerimeter of a square = 6 \n"); 
System.out.println("________________________________________________________"); 
int operation=sk.nextInt(); 
System.out.println("________________________________________________________"); 
switch(operation){

case 1:
System.out.print("Enter a Radius of Circle= "); 
float r=sk.nextFloat(); 
ans= 3.14*r*r ; 

System.out.println("Area of Circle is " + ans); 
break ; 

case 2:
System.out.print("Enter a Length of the Side of the Square = "); 
float a=sk.nextFloat(); 
ans=a*a ; 

System.out.println("Area of Square is " + ans); 
break ; 

case 3:
System.out.print("Enter a Base of Right Triangle= "); 
float base=sk.nextFloat(); 

System.out.print("Enter a Height of Right Triangle= "); 
float height=sk.nextFloat(); 

ans= 1/2 * base * height ; 

System.out.println("Area of Right Angled Triangle is " + ans); 
break ; 


case 4:
System.out.print("Enter a Width of RectAngle = "); 
float width=sk.nextFloat(); 

System.out.print("Enter a Height of RectAngle = "); 
float h=sk.nextFloat(); 
ans= width * h ; 

System.out.println("Area of RectAngle is " + ans); 
break ; 

case 5:
System.out.print("Enter a Radius of Circle= "); 
float R=sk.nextFloat(); 
ans= 2*3.14*R; 

System.out.println(" Circumference of a Circle is " + ans); 
break ; 

case 6:
System.out.print("Enter a Length of the Side of the Square = "); 
float S=sk.nextFloat(); 
ans=4 * S; 

System.out.println("Perimeter of Square is " + ans); 
break ; 

default :
System.out.println("Plz Enter A Valid Opération  Number like 1 to 6"); 
break ; 
}
System.out.println("________________________________________________________"); 
}

}
