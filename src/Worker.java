
public class Worker extends Employee{
	private int productLineAssigned; 
	private String departmentAssigned;
	
	public Worker() {} 
	
	public Worker(int productLineAssigned, String departmentAssigned) {
		super();
		this.productLineAssigned = productLineAssigned;
		this.departmentAssigned = departmentAssigned;
	}
	
	public Worker(int iD, String lastname, String firstname, String birthDate,int productLineAssigned, String departmentAssigned) {
		super( iD,  lastname,  firstname,  birthDate);
		this.productLineAssigned = productLineAssigned;
		this.departmentAssigned = departmentAssigned;
	}
	
	public int getProductLineAssigned() {
		return productLineAssigned;
	}
	public void setProductLineAssigned(int productLineAssigned) {
		this.productLineAssigned = productLineAssigned;
	}
	public String getDepartmentAssigned() {
		return departmentAssigned;
	}
	public void setDepartmentAssigned(String departmentAssigned) {
		this.departmentAssigned = departmentAssigned;
	}  
	
	

}
