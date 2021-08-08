import java.util.ArrayList;
import java.util.List;

public class Workshop implements Comparable{
	private int workshopID; 
	private int maxCapacity; 
	private int productLine; 
	private String workshopName;
	private Engineer eng ;
	private List<Employee> workerParticipants;
	
	public Workshop() {
		this.workerParticipants = new  ArrayList<Employee>();
	}
	
	public Workshop(int workshopID, int maxCapacity, int productLine, String workshopName,
			List<Employee> workerParticipants) {
		super();
		this.workshopID = workshopID;
		this.maxCapacity = maxCapacity;
		this.productLine = productLine;
		this.workshopName = workshopName;
		this.workerParticipants = new  ArrayList<Employee>();
	}
	
	public Engineer getEng() {
		return eng;
	}

	public void setEng(Engineer eng) {
		this.eng = eng;
	}

	public int getWorkshopID() {
		return workshopID;
	}
	public void setWorkshopID(int workshopID) {
		this.workshopID = workshopID;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public int getProductLine() {
		return productLine;
	}
	public void setProductLine(int productLine) {
		this.productLine = productLine;
	}
	public String getWorkshopName() {
		return workshopName;
	}
	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}
	public List<Employee> getWorkerParticipants() {
		return workerParticipants;
	}
	public void setWorkerParticipants(List<Employee> workerParticipants) {
		this.workerParticipants = workerParticipants;
	} 
	
	/**
	 * Override toString method
	 */
	@Override
	public String toString() {
		return this.productLine + ": " +  this.workshopID + "-" + this.workshopName; 
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
 
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Workshop)) {
            return false;
        }
         
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
