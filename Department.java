/*------------------------------------------------------
 My name: Quy Binh Nguyen
 My student number: 7613623
 My course code: CSIT121
 My email address: qbinhhh164@gmail.com / qbn774@uowmail.edu.au
 Assignment number: 1
-------------------------------------------------------*/

class Department {
	
	// private data members
	private int dNumber;
	private String dName;
	private int manager;
	private double budget;
	private String startDate;

	// constructor with 5 parameters
	public Department(int dNumber, String dName, int manager, double budget, String startDate) {
		this.dNumber = dNumber;
		this.dName = dName;
		this.manager = manager;
		this.budget = budget;
		this.startDate = startDate;
	}
	
	// toString method to return the string value of all private data members
	public String toString() {
		return "Department number: " + dNumber + ", Department name: "
				 + dName + ", Manager number: " + manager + ", Budget: "
				 + budget + ", Manager start date: " + startDate + "\n";
	}
}