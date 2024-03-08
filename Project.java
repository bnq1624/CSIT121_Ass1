/*------------------------------------------------------
 My name: Quy Binh Nguyen
 My student number: 7613623
 My course code: CSIT121
 My email address: qbinhhh164@gmail.com / qbn774@uowmail.edu.au
 Assignment number: 1
-------------------------------------------------------*/

class Project {
	
	// private data members
	private long pNumber;
	private String title;
	private String sponsor;
	private int dNumber;
	private double budget;
	
	// constructor with 5 parameters
	public Project(long pNumber, String title, String sponsor, int dNumber, double budget) {
		this.pNumber = pNumber;
		this.title = title;
		this.sponsor = sponsor;
		this.dNumber = dNumber;
		this.budget = budget;
	}
	
	// getter for pNumber
	public long getPNumber() {
		return pNumber;
	}

	// toString method to return the string value of all private data members
	public String toString() {
		return "Project number: " + pNumber + ", Project title: "
			    + title + ", Sponsor: " + sponsor + ", Department number: "
				 + dNumber + ", Project budget: " + budget + "\n";
	}
}