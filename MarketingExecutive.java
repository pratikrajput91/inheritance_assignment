package inheritance_assignment;

public class MarketingExecutive extends Employee {
	
	private double kmTravelled;
	private double tourAllowance=5;
	private double telephoneAllowance=1500;
	public MarketingExecutive() {
		super();
		
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,int kmTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kmTravelled=kmTravelled;
		this.tourAllowance=tourAllowance;
		this.telephoneAllowance=telephoneAllowance;
		
	}
	public double getExecutiveGrossSalary() {
		return getGrossSalary()+this.tourAllowance*this.telephoneAllowance;
		
	}
	

}
