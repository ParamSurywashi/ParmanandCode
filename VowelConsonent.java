package Assignment;
import java.util.Scanner; 
public class VowelConsonent {

  public static void main(String[] args) {

System.out.println("Enter Any Character to check it's Vowel or Consonent ="); 
Scanner sk=new Scanner(System.in); 

 char ch=sk.next( ).charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
  

}
