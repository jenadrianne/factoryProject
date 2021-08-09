/*
 * Worker Class 
 * - Child Class 
 * - Extends from the parent class Employee
 */
public class Worker extends Employee{
	private int productLineAssigned; 
	private String departmentAssigned;
	
	/**
	 * Default Constructor
	 */
	public Worker() {} 
	
	/**
	 * Custom Constructor 
	 * - calls parent's default constructor
	 * @param productLineAssigned
	 * @param departmentAssigned
	 */
	public Worker(int productLineAssigned, String departmentAssigned) {
		super();
		this.productLineAssigned = productLineAssigned;
		this.departmentAssigned = departmentAssigned;
	}
	
	/**
	 * Custom Constructor
	 * - calls parent's custome constructor
	 * @param iD
	 * @param lastname
	 * @param firstname
	 * @param birthDate
	 * @param productLineAssigned
	 * @param departmentAssigned
	 */
	public Worker(int iD, String lastname, String firstname, String birthDate,int productLineAssigned, String departmentAssigned) {
		super( iD,  lastname,  firstname,  birthDate);
		this.productLineAssigned = productLineAssigned;
		this.departmentAssigned = departmentAssigned;
	}
	
	/**
	 * Get product line assignment
	 * @return
	 */
	public int getProductLineAssigned() {
		return productLineAssigned;
	}
	
	/**
	 * Set productline assignment
	 * @param productLineAssigned
	 */
	public void setProductLineAssigned(int productLineAssigned) {
		this.productLineAssigned = productLineAssigned;
	}
	/**
	 * Get Department Assignment 
	 * @return
	 */
	public String getDepartmentAssigned() {
		return departmentAssigned;
	}
	/**
	 * Set Department Assignment
	 * @param departmentAssigned
	 */
	public void setDepartmentAssigned(String departmentAssigned) {
		this.departmentAssigned = departmentAssigned;
	}  
	
	

}
