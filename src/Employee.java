
public class Employee {
	private int ID; 
	private String lastname; 
	private String firstname; 
	private String birthDate;
	
	public  Employee() {} 
	
	public Employee(int iD, String lastname, String firstname, String birthDate) {
		super();
		ID = iD;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthDate = birthDate;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * Override the equals
	 */
	@Override
    public boolean equals(Object o) {
 
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Workshop)) {
            return false;
        }
         
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
