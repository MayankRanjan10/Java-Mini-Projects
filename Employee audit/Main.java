package com;

import java.util.*;

public class Main implements EmployeeAudit {
	
	private HashMap<String, Double> employeeMap = new HashMap<>();
	
	public void addEmployeeDetails(String employeeName, double Salary) {
		employeeMap.put(employeeName, Salary);
	}
	
	@Override
	public ArrayList<String> fetchEmployeeDetails(double salary) {
		ArrayList<String> list = new ArrayList<>();
		employeeMap.forEach((key,value)->{if(value<salary) list.add(key);});
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		
		int a=0;	
		while(a!=3)
		{
			System.out.println("\n1. Add Employee Details "+"\n"+"2. Find Employee Details "+"\n"+"3. Exit ");
			System.out.println("Enter the choice : ");
			a=sc.nextInt();
			String name;
			double sal;
			double threshold;
			sc.nextLine();
			switch(a) {			
			case 1:
				System.out.println("Enter the Employee name : ");
				name= sc.nextLine();
				System.out.println("Enter the Employee Salary: ");
				sal = sc.nextDouble();
				obj.addEmployeeDetails(name, sal);
				break;
				
			case 2:
				System.out.print("Enter the salary to be searched : ");
				threshold= sc.nextDouble();
				for(var i: obj.fetchEmployeeDetails(threshold)) {
					System.out.println(i);
				}
				break;
				
			
			default:
				System.out.println("Let's complete the session");
			}
		}

	}

}
