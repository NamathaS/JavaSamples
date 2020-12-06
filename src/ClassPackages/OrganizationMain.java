package ClassPackages;

public class OrganizationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organisations org = new Organisations();
		
		org.CompanyName="Sample B";
		org.Location="Auckland";
		System.out.println(org.getLocation());
		System.out.println("Hellp");
		org.addEmployee();
		System.out.println(org.getEmployeeName());
	}

}
