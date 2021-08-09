/*
 * Workshop Class
 * - Contains the details of the workshop
 */

import java.util.ArrayList;
import java.util.List;

public class Workshop implements Comparable{
	private int workshopID; 
	private int maxCapacity; 
	private int productLine; 
	private String workshopName;
	private Engineer eng ;
	private List<Employee> workerParticipants;
	
	/**
	 * Default workshop Constructor
	 */
	public Workshop() {
		this.workerParticipants = new  ArrayList<Employee>();
	}
	
	/**
	 * Custom Workshop Constructor
	 * @param workshopID
	 * @param maxCapacity
	 * @param productLine
	 * @param workshopName
	 * @param workerParticipants
	 */
	public Workshop(int workshopID, int maxCapacity, int productLine, String workshopName,
			List<Employee> workerParticipants) {
		super();
		this.workshopID = workshopID;
		this.maxCapacity = maxCapacity;
		this.productLine = productLine;
		this.workshopName = workshopName;
		this.workerParticipants = new  ArrayList<Employee>();
	}
	
	/**
	 * Get assigned Engineer to perform Workshop
	 * @return
	 */
	public Engineer getEng() {
		return eng;
	}

	/**
	 * Set assigned Engineer to perform Workshop
	 * @param eng
	 */
	public void setEng(Engineer eng) {
		this.eng = eng;
	}

	/**
	 * Get Workshop ID
	 * @return
	 */
	public int getWorkshopID() {
		return workshopID;
	}
	
	/**
	 * Set Workshop ID
	 * @param workshopID
	 */
	public void setWorkshopID(int workshopID) {
		this.workshopID = workshopID;
	}
	
	/**
	 * Get Maximum Capacity
	 * @return
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}
	/**
	 * Set Max Capacity
	 * @param maxCapacity
	 */
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	/**
	 * Get Product Line
	 * @return
	 */
	public int getProductLine() {
		return productLine;
	}
	/**
	 * Set Product Line
	 * @param productLine
	 */
	public void setProductLine(int productLine) {
		this.productLine = productLine;
	}
	/**
	 * Get Workshop Name
	 * @return
	 */
	public String getWorkshopName() {
		return workshopName;
	}
	/**
	 * Set Workshop Name
	 * @param workshopName
	 */
	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}
	/**
	 * Get Worker Participants
	 * @return
	 */
	public List<Employee> getWorkerParticipants() {
		return workerParticipants;
	}
	/**
	 * Set Worker Participants
	 * @param workerParticipants
	 */
	public void setWorkerParticipants(List<Employee> workerParticipants) {
		this.workerParticipants = workerParticipants;
	} 
	
	/**
	 * Override toString method
	 */
	@Override
	public String toString() {
		return "Product line " +  this.productLine + ": " +  this.workshopID + "-" + this.workshopName; 
	}
	
	/**
	 * Override compateTo method for sorting
	 */
	@Override
	public int compareTo(Object o) {
		int compare=(int) ((Workshop)o).getProductLine();
        /* For Ascending order*/
        return (int) (this.productLine-compare);
	}
	
	/**
	 * Override the equals method for comparing two objects
	 */
    @Override
    public boolean equals(Object o) {
    	//Compare if it is the object itself
        if (o == this) {
            return true;
        }
        
        // Compare if it is an instance of a workshop class
        if (!(o instanceof Workshop)) {
            return false;
        }
        //Cast the object as Workshop
        Workshop w = (Workshop) o;
         
        // Compare the data members and return accordingly
        return w.workshopID  == this.workshopID;
    }
    
	/**
	 * Display all participants of the workshop
	 */
	public void displayParticipants() {
		System.out.println("\nParticipants for " + this.workshopName + "\n");
		for(Employee worker : workerParticipants) {
			worker.toString();
		}
		
	}
	
}
