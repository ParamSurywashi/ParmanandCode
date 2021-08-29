package Assignment.Loops;

public class Prime400To300 {

 public static void main(String[] args) {

  int primeCheckNumber;
  int n = 300;
  int divisibleCount;

  while (n <= 400) {
   divisibleCount = 0;
   primeCheckNumber = 2;
   while (primeCheckNumber <= n / 2) {
    if (n % primeCheckNumber == 0) {
     divisibleCount++;
     break;
    }
    primeCheckNumber++;
   }
   if (divisibleCount == 0 && n != 1) {
    System.out.println(n + " ");
   }
   n++;
  }

}
}
