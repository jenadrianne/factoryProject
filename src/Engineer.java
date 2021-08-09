/*
 * Engineer Class 
 * - Child Class 
 * - Extends from Employee Class
 */
public class Engineer extends Employee {
	private String departmentAssigned; 
	private int totalWorkHours; 
	private String specialty;
	
	/**
	 * Default Constructor
	 */
	public Engineer() {}
	
	/**
	 * Custom Constructor
	 * @param departmentAssigned
	 * @param totalWorkHours
	 * @param specialty
	 */
	public Engineer(String departmentAssigned, int totalWorkHours, String specialty) {
		super();
		this.departmentAssigned = departmentAssigned;
		this.totalWorkHours = totalWorkHours;
		this.specialty = specialty;
	}
	
	/**
	 * Engineer Custom Constructor 
	 * - calls Employee's Custom Constructor
	 * @param iD
	 * @param lastname
	 * @param firstname
	 * @param birthDate
	 * @param departmentAssigned
	 * @param totalWorkHours
	 * @param specialty
	 */
	public Engineer (int iD, String lastname, String firstname, String birthDate, String departmentAssigned, int totalWorkHours, String specialty) {
		super( iD,  lastname,  firstname,  birthDate);
		this.departmentAssigned = departmentAssigned;
		this.totalWorkHours = totalWorkHours;
		this.specialty = specialty;
	}
	
	/**
	 * Get Department assigned
	 * @return
	 */
	public String getDepartmentAssigned() {
		return departmentAssigned;
	}
	/**
	 * Set Department assigned
	 * @param departmentAssigned
	 */
	public void setDepartmentAssigned(String departmentAssigned) {
		this.departmentAssigned = departmentAssigned;
	}
	/**
	 * Get Total Work Hours
	 * @return
	 */
	public int getTotalWorkHours() {
		return totalWorkHours;
	}
	/**
	 * Set total Work hours
	 * @param totalWorkHours
	 */
	public void setTotalWorkHours(int totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}
	/**
	 * Get Specialty
	 * @return
	 */
	public String getSpecialty() {
		return specialty;
	}
	/**
	 * Set Specialty
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	} 
}
