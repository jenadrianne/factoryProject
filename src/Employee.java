/*
 * Employee Class 
 * - holds the common attributes of Worker and Engineer 
 * - Parent Class of Worker and Engineer 
 */
public class Employee {
	private int ID; 
	private String lastname; 
	private String firstname; 
	private String birthDate;
	
	/**
	 * Default Constructor
	 */
	public  Employee() {} 
	
	/**
	 * Custome Constructor
	 * @param iD
	 * @param lastname
	 * @param firstname
	 * @param birthDate
	 */
	public Employee(int iD, String lastname, String firstname, String birthDate) {
		super();
		ID = iD;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthDate = birthDate;
	}
	
	/**
	 * Get ID
	 * @return
	 */
	public int getID() {
		return ID;
	}
	/**
	 * Set ID
	 * @param iD
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * Get Last Name
	 * @return
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * Set LastName
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * Get FirstName
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * Set Firstname
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * Get Birthdate
	 * @return
	 */
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * Set Birthdate
	 * @param birthDate
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * Override the equals
	 */
	@Override
    public boolean equals(Object o) {
		//if the object is itself
        if (o == this) {
            return true;
        }
        //if the object is not an instance of Employee
        if (!(o instanceof Employee)) {
            return false;
        }
        //Cast the object to an Employee Class
        Employee e = (Employee) o;
         
        // Compare the data members and return accordingly
        return e.getID()  == this.ID;
    }
	
	/**
	 * Override the to string method
	 */
	@Override
	public String toString() {
		return this.ID + ": " +  this.firstname + " " + this.lastname; 
	}
}
