package com.employee;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		EmployeeInterface em = new EmployeeImplement();
		System.out.println("Welcome To Employee Management System");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add Emplyee \n"+
		"2.Show All Employee \n"+
					"3.Show Employee Based On Id \n"+
		"4.Update Employee \n"+
					"5.Delete Employee \n");
			System.out.println("Enter Your Choise :");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				Employee emp = new Employee();
				System.out.print("Enter Employe Id :");
				int id = sc.nextInt();
				
				System.out.print("Enter Employee Name :");
				String name = sc.next();
				
				System.out.print("Enter Employee City :");
			    String City = sc.next();
				
				 System.out.print("Enter Employee Salary :");
				    double Salary = sc.nextDouble();
                
				System.out.print("Enter Employee Age :");
				    int Age = sc.nextInt();
				    
				
				    emp.setId(id);
				    emp.setName(name);
				    emp.setCity(City);
				    emp.setAge(Age);
				    emp.setSalary(Salary);
				    em.AddEmployee(emp);
				    break;
				    
			case 2:
				em.ShowEmployee();
				break;
				
			case 3:
				System.out.println("Enter Employee Id To Show Details :");
				int id11 = sc.nextInt();
				em.ShowEmployeeBasedOnId(id11);
				break;
				
			case 4:
				System.out.println("Enter Employe Id :");
				int id111 = sc.nextInt();
				
				System.out.println("Enter Employee Name :");
				String name1 = sc.next();
				
				System.out.println("Enter Employee City :");
				    String City1 = sc.next();
				    
				System.out.println("Enter Employee Age :");
				    int Age1 = sc.nextInt();
				    
				System.out.println("Enter Employee Salary :");
				    double Salary1 = sc.nextDouble();
				
				em.UpdateEmployee(id111,name1,City1,Age1,Salary1);
				break;
				
			case 5:
				System.out.println("Enter Employee Id :");
				int id1111 = sc.nextInt();
				em.DeleteEmployee(id1111);
				break;
				
			case 6:
				System.out.println("Thanku For Using Our Application !!!!");
				System.exit(0);
				
			default :
				System.out.println("Enter Valid Case :");
				break;
			}
		}while(true);
      
	}

}
