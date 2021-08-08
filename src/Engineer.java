
public class Engineer extends Employee {
	private String departmentAssigned; 
	private int totalWorkHours; 
	private String specialty;
	
	public Engineer() {}
	
	public Engineer(String departmentAssigned, int totalWorkHours, String specialty) {
		super();
		this.departmentAssigned = departmentAssigned;
		this.totalWorkHours = totalWorkHours;
		this.specialty = specialty;
	}
	
	public Engineer (int iD, String lastname, String firstname, String birthDate, String departmentAssigned, int totalWorkHours, String specialty) {
		super( iD,  lastname,  firstname,  birthDate);
		this.departmentAssigned = departmentAssigned;
		this.totalWorkHours = totalWorkHours;
		this.specialty = specialty;
	}
	
	public String getDepartmentAssigned() {
		return departmentAssigned;
	}
	public void setDepartmentAssigned(String departmentAssigned) {
		this.departmentAssigned = departmentAssigned;
	}
	public int getTotalWorkHours() {
		return totalWorkHours;
	}
	public void setTotalWorkHours(int totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	} 
	
	
}
