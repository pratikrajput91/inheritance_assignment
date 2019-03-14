package inheritance_assignment;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager() {
		super();
		
	}
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		this.petrolAllowance=basicSalary*8/100;
		this.foodAllowance=basicSalary*13/100;
		this.otherAllowance=basicSalary*3/100;
	}		
	public double getManagerGrossSalary() {
		return getGrossSalary()+this.petrolAllowance+this.foodAllowance+this.otherAllowance;
		
	}
	
	public double getManagerNetSalary() {
		return getManagerGrossSalary()-(12*getBasicSalary()/100+200);
	
	
		
	}
}
