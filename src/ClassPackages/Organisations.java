package ClassPackages;

public class Organisations {

	 int EmployeeCount;
	 String CompanyDetails;
	 String CompanyName;
	 double TurnOver;
	 int Rank;
	 String Location;
	 String Owner;
	 
	 double tax;
	 double income;
	 
	 int Dept_Id;
	 String Dept_Name;
	 String Dept_Head;
	 
	 int EmployeeId=0;
	 String EmployeeName;
	 
	 
	 public  void setOrganisationName() {
		 System.out.println("Entered in to Seting Organization name");
		 CompanyName="Company A";
		 
	 }
	 public String getEmployeeName() {
		 return EmployeeName;
	 }
	 public  void setOrganisationDetails() {
		 System.out.println("Entered in to Seting Organization name");
		 CompanyDetails="Company for XXX manufacturing and production";
		 
	 }
	
	 public String getLocation() {
		 return Location;
	 }
	 public void addEmployee() {
		 
		 EmployeeId =203;
		 EmployeeName="Namatha";
		 EmployeeCount++;
		 
	 }
	public double calculateTurnOver() {
		return (income-tax);
	}
	
}
