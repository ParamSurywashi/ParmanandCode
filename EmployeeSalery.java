package Assignment;
import java.util.Scanner; 
public class EmployeeSalery {

  public static void main(String[] args) {
  
  int salary; 
  float HRA, DA, Gross_Salary;
  	
  Scanner sk=new Scanner(System.in); 
  System.out.print("Enter a Employée Salary ="); 
  salary=sk.nextInt(); 
  
  if(salary<=10000)
  {
       HRA = (salary * 20) / 100; 
		DA = (salary* 80) / 100;      
		Gross_Salary = salary+ HRA + DA;
		System.out.println("Your HRA is " + HRA); 
        System.out.println("Your DA is " +DA); 

		System.out.println("Your Gross Salary is " +Gross_Salary); 
		
  }else if(salary<=20000)
  {
       HRA = (salary* 25) / 100; 
		DA = (salary* 90) / 100; 
		Gross_Salary = salary+ HRA + DA;
			System.out.println("Your HRA is " + HRA); 
        System.out.println("Your DA is " +DA); 


		System.out.println("Your Gross Salary is " +Gross_Salary); 

  }else if(salary>20000)
  {
       HRA = (salary * 30) / 100; 
		DA = (salary * 95) / 100; 
		Gross_Salary = salary+ HRA + DA;
			System.out.println("Your HRA is " + HRA); 
        System.out.println("Your DA is " +DA); 
		System.out.println("Your Gross Salary is " +Gross_Salary); 

  }
  }

}
