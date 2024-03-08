/*------------------------------------------------------
 My name: Quy Binh Nguyen
 My student number: 7613623
 My course code: CSIT121
 My email address: qbinhhh164@gmail.com / qbn774@uowmail.edu.au
 Assignment number: 1
-------------------------------------------------------*/

class Employee {
	
	// private data members
	private int eNumber;
	private String eName;
	private String dob;
	private String address;
	private String gender;
	private double salary;
	private int supervisor;
	private int dNumber;

	// constructor with 8 parameters
	public Employee(int eNumber, String eName, String dob, String address, String gender, double salary, int supervisor, int dNumber) {
		this.eNumber = eNumber;
		this.eName = eName;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.supervisor = supervisor;
		this.dNumber = dNumber;
	}
	
	// getter for eNumber
	public int getENumber() {
		return eNumber;
	}
	
	// toString method to return the string value of all private data members
	public String toString() {
		return "Employee number: " + eNumber + ", Employee name: "
			    + eName + ", Date of birth: " + dob + ", Address: "
				 + address + ", Gender: " + gender + ", Salary: " +
				 salary + ", Supervisor number: " + supervisor +
				 ", Department number: " + dNumber + "\n";
	}
}
