/*------------------------------------------------------
 My name: Quy Binh Nguyen
 My student number: 7613623
 My course code: CSIT121
 My email address: qbinhhh164@gmail.com / qbn774@uowmail.edu.au
 Assignment number: 1
-------------------------------------------------------*/

class WorksOn {
	
	// private data members
	private Project proj;
	private Employee emp;
	private int hours;
	
	// constructor with 3 parameters
	public WorksOn(Project proj, Employee emp, int hours) {
		this.proj = proj;
		this.emp = emp;
		this.hours = hours;
	}
	
	// getter for Project and Employee
	public Project getProj() {
		return proj;
	}

	public Employee getEmp() {
		return emp;
	}

	// toString method to return the string value of all private data members
	public String toString() {
		return proj.toString() + "\n" + emp.toString() + "\n Hours: " + hours + "\n";
	}
}