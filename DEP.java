/*------------------------------------------------------
 My name: Quy Binh Nguyen
 My student number: 7613623
 My course code: CSIT121
 My email address: qbinhhh164@gmail.com / qbn774@uowmail.edu.au
 Assignment number: 1
-------------------------------------------------------*/

import java.util.ArrayList;
import java.util.Scanner;

public class DEP {
	
	// private data members
	private ArrayList<Department> depts;
	private ArrayList<Employee> emps;
	private ArrayList<Project> projs;
	private ArrayList<WorksOn> works;
	
	// default constructor
	public DEP() {
		depts = new ArrayList<Department>(0);
		emps = new ArrayList<Employee>(0);
		projs = new ArrayList<Project>(0);
		works = new ArrayList<WorksOn>(0);
	}
	
	// display department information
	public void displayDepartment() {
	for(Department d:depts) {
		System.out.println(d.toString());
	}
	}
	
	// display employee information
	public void displayEmployee() {
		for(Employee e:emps) {
			System.out.println(e.toString());
		}
	}
	
	// display project information
	public void displayProject() {
		for(Project p:projs) {
			System.out.println(p.toString());
		}
	}
	
	// display worksOn information
	public void displayWorksOn() {
		for(WorksOn w:works) {
			System.out.println(w.toString());
		}
	}
	
	// create and add the objects of departments to the depts ArrayList
	public void addDepartment() {
		Department sales = new Department(1, "SALES", 110, 1234.00, "02/01/2012");
		Department accounting = new Department(2, "ACCOUNTING", 120, 5566789.50, "30/10/2010");
		Department games = new Department(3, "GAMES", 150, 100000.00, "01/03/2008");
		Department humanResources = new Department(4, "HUMAN RESOURCES", 200, 500000.0, "02/01/2013");
		Department sports = new Department(5, "SPORTS", 250, 8500000.00, "10/05/2010");
		Department research = new Department(6, "RESEARCH", 300, 45500.00, "10/06/2020");
		Department education = new Department(7, "EDUCATION", 350, 100000.00, "10/07/2019");
		Department finance = new Department(8, "FINANCE", 500, 8400000.00, "10/08/2022");
		Department computing = new Department(9, "COMPUTING", 600, 90000.00, "10/09/2018");
	
		depts.add(sales);
		depts.add(accounting);
		depts.add(games);
		depts.add(humanResources);
		depts.add(sports);
		depts.add(research);
		depts.add(education);
		depts.add(finance);
		depts.add(computing);
	}
	
	// create and add the objects of employees to the emps ArrayList
	public void addEmployee() {
		Employee willy = new Employee(600, "Willy", "01/01/1988", "41 Station Street, Wollongong, NSW 2500", "M", 250.5, 0, 9);
		Employee zhi = new Employee(700, "Zhi", "12/09/1999", "112 Smith Street, Windang, NSW 2525", "M", 80.2, 600, 9);
		Employee mary = new Employee(800, "Mary", "03/10/2000", "26 Gibsons Road, Figtree, NSW 2525", "F", 50.0, 700, 9);
		Employee angelina = new Employee(500, "Angelina", "20/11/1990", "25 Bong Bong Road, Horsley, NSW 2530", "F", 250.0, 0, 8);
		Employee anna = new Employee(510, "Anna", "20/11/1990", "200 Cemetary Road, Hawea, NSW 2800", "F", 100.0, 500, 8);
		Employee madelaine = new Employee(520, "Madelaine", "20/11/1990", "23 Lake View Street, Figtree, NSW 2525", "F", 50.0, 510, 8);
		Employee robert = new Employee(530, "Robert", "20/11/1990", "80 Penny Road, Windang, NSW 2520", "M", 50.0, 510, 8);
		Employee claudio = new Employee(540, "Claudio", "20/11/1990", "23 Horsley Street, Unanderra, NSW 2528", "M", 50.0, 510, 8);
		Employee brian = new Employee(350, "Brian", "13/05/1965", "23 Station Street, Wollongong, NSW 2500", "M", 200.4, 0, 7);
		Employee alvin = new Employee(110, "Alvin", "13/10/1977", "56 Marlo Road, Wollongong, NSW 2500", "M", 156.4, 100, 1);
	
		emps.add(willy);
		emps.add(zhi);
		emps.add(mary);
		emps.add(angelina);
		emps.add(anna);
		emps.add(madelaine);
		emps.add(robert);
		emps.add(claudio);
		emps.add(brian);
		emps.add(alvin);
	}
	
	// create and add the objects of projects to the projs ArrayList
	public void addProject() {
		Project computation = new Project(1001, "Computation", "Microsoft", 8, 25000);
		Project studyMethods = new Project(1002, "Study methods", "Education committee", 3, 15000);
		Project racingCar = new Project(1003, "Racing car", "Cloud Pty Ltd", 3, 225000);
		Project football = new Project(1004, "Football", "Football Club", 5, 35000);
		Project swimming = new Project(1005, "Swimming", "Education Committee", 5, 125000);
		Project database = new Project(1006, "Database", "Database Committee", 5, 125000);
	
		projs.add(computation);
		projs.add(studyMethods);
		projs.add(racingCar);
		projs.add(football);
		projs.add(swimming);
		projs.add(database);
	}
	
	// display menu
	public void displayMenu() {
		System.out.println("1. Display all departments.");
		System.out.println("2. Display all employees.");
		System.out.println("3. Display all projects.");
		System.out.println("4. Display information for employees who works on projects.");
		System.out.println("5. Add a record for an employee who works on a project.");
		System.out.println("0. Exit.");
	}
	
	// method to check if the employee exists
	public boolean checkEmployee(int eNumber) {
		boolean exist = true;
		for(Employee e:emps) {
			if(e.getENumber() == eNumber) {
				exist = true;
				break;
			}else {
				exist = false;
			}
		}
		return exist;
	}
	
	// method to check if the project exists
	public boolean checkProject(int pNumber) {
		boolean exist = true;
		for(Project p:projs) {
			if(p.getPNumber() == pNumber) {
				exist = true;
				break;
			}else {
				exist = false;
			}
		}
		return exist;
	}
	
	// method to check if the employee has been allocated
	public boolean employeeHasBeenAllocated(int eNumber, long pNumber) {
		boolean allocated = false;
		for(int i=0; i<works.size(); i++) {
			if((works.get(i).getEmp().getENumber() == eNumber) && (works.get(i).getProj().getPNumber() == pNumber)) {
				allocated = true;
				break;
			}
		}
		return allocated;
	}
	
	
	// method to find the project
	public Project findProject(int pNumber) {
		for(int i=0; i<projs.size(); i++) {
			if(pNumber == projs.get(i).getPNumber()) {
				return projs.get(i);
			}
		}
		return null;
	}
	
	// method to find the employee
	public Employee findEmployee(int eNumber) {
		for(int i=0; i<emps.size(); i++) {
			if(eNumber == emps.get(i).getENumber()) {
				return emps.get(i);
			}
		}
		return null;
	}
	
	// main method to run the program
	public static void main(String[] args) {		
		DEP dep = new DEP();
		
		dep.displayMenu();
		dep.addDepartment();
		dep.addEmployee();
		dep.addProject();
		dep.inputSection();
	}
		
	// method allows user to input multiple times & show the output
	public void inputSection() {
		System.out.print("Input a choice (0-5):");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
			
		switch(userInput) {
			// input is 1: display all departments
			case 1: 
				displayDepartment();
				displayMenu();
				inputSection();
				break;
				
			// input is 2: display all employees
			case 2:
				displayEmployee();
				displayMenu();
				inputSection();
				break;
			
			// input is 3: display all projects
			case 3:
				displayProject();
				displayMenu();
				inputSection();
				break;
				
			// input is 4: display information for employees who works on projects
			case 4: 
				if(works == null) {
					System.out.println();
					displayMenu();
					inputSection();
					break;
				}else {
					displayWorksOn();
					System.out.println();
					displayMenu();
					inputSection();
					break;
				}
			
			// input is 5: add a record for an employee who works on a project
			case 5:
				System.out.print("Input an employee number: ");
				int eNumber = input.nextInt();
				
				if(checkEmployee(eNumber)) {
					System.out.print("Input a project number: ");
					int pNumber = input.nextInt();
					
					if(checkProject(pNumber)) {
						
						if(employeeHasBeenAllocated(eNumber, pNumber)) {
							System.out.println("The employee " + eNumber + " has already been allocated to the project " + pNumber);
							System.out.println();
							displayMenu();
							inputSection();
							break;
						}else {
							System.out.print("Input total hours: ");
							int totalHours = input.nextInt();
							
							WorksOn worksOnInfo = new WorksOn(findProject(pNumber), findEmployee(eNumber), totalHours);
							works.add(worksOnInfo);
							System.out.println();
							displayMenu();
							inputSection();
							break;
						}
						
					}else {
						System.out.println("The project " + pNumber + " does not exist.");
						System.out.println();
						displayMenu();
						inputSection();
						break;
					}
					
				}else {
					System.out.println("The employee " + eNumber +  " does not exist.");
					System.out.println();
					displayMenu();
					inputSection();
					break;
				}
				
			// input is 0
			case 0:
				System.out.print("Bye");
				break;	
		} 
	}
}