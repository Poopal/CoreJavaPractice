package OOPS;


public class EmployeeData {
	
	//Private data Variables
	private int ssn;
	private String empName;
	private int empAge;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData emp= new EmployeeData();
		emp.setempName("Sandesh");
		emp.setssn(123456789);
		emp.setempAge(30);
		
		System.out.println("Employee Name is : " + emp.getempName() );
		System.out.println("Employee Age is : " +emp.getempAge());
		System.out.println("Employee SSN is : " +emp.getssn());
				
	}
	//getter and Setter Methods
	 public int getssn()
	 {
		 return ssn;
	 }
	 
	 public void setssn(int ssn)
	 {
		 this.ssn=ssn;
	 }

	 public String getempName() 
	 {	 
	  return empName;
	 }
	 
	 public void setempName(String empName)
	 
	 {
		this.empName=empName;
	 }
	 
	 public int getempAge()
	 {
		 return empAge;
	 }
	 public void setempAge(int empAge)
	 {
		 this.empAge=empAge;
	 }
}
