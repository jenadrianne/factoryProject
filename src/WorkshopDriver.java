/*
 * Workshop Driver Class
 * - server as the controller of the factory system
 * - contains the factory management functions such as add, remove, display ,etc..
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkshopDriver {
	private List<Workshop> workshopList;
	private List<Employee> employeeList;
	
	/**
	 * Default Constructor
	 */
	public WorkshopDriver() {
		workshopList = new ArrayList<Workshop>();
		populateEmployeeList();
	}
	
	/**
	 * Get Workshop List
	 * @return
	 */
	public List<Workshop> getWorkshopList() {
		return workshopList;
	}
	/**
	 * Set WorkshopList
	 * @param workshopList
	 */
	public void setWorkshopList(List<Workshop> workshopList) {
		this.workshopList = workshopList;
	}
	
	/**
	 * Create a Workshop
	 * @param scan
	 */
	public void createWorkshop(Scanner scan) {
		//Enter the details for the workshop
		System.out.println("\nEnter workshop name:");
		String workshopName = scan.next(); 
		System.out.println("\nEnter workshop capacity:"); 
		int maxCapacity = scan.nextInt(); 
		System.out.println("\nEnter product line id:");
		int productLine = scan.nextInt(); 
		int workshopID = 0; 
		
		//Display All engineer data available
		displayEmployeeEngineers(); 
		System.out.println("\nEnter ID of the Engineer Practitioner"); 
		int engId = scan.nextInt();
		
		//Find if the engineer data is valid or existing
		Employee emp = findEmployeeByID(engId); 
		
		//if does not exist the workshop is not created
		if(emp == null) {
			System.out.println("Unable to create the workshop. Please try again.  "); 
		}else {
			//Random unique int is created for the ID
			Random random = new Random();
	        workshopID = Math.abs(random.nextInt());
			
	        //Create a workshop object and set its data
			Workshop workshop = new Workshop(); 
			workshop.setMaxCapacity(maxCapacity);
			workshop.setProductLine(productLine);
			workshop.setWorkshopName(workshopName);
			workshop.setWorkshopID(workshopID);
			workshop.setEng((Engineer) emp);
			
			
			//find if the workshop already exist or is a duplicate
			if(workshopFinder(workshop)) {
				//if workshop exist, it is not created successfully
				System.out.println("Unable to create the workshop. Please try again.  "); 
			}else {
				//add the workshop to the list 
				workshopList.add(workshop);
				System.out.println("Workshop has been added");
			}
		}
		
	}
	
	
	/**
	 * Display Workshop
	 */
	public void displayWorkshop(List<Workshop> workshopList) {
		int average = 0; 
		//sort workshop list by product line; 
		 Collections.sort(workshopList);
		 
		 //Display the workshop details
		 System.out.println("\n\t\t Available Workshop ");
		 for(Workshop workshop : workshopList) {
			 System.out.println(workshop.toString());
		 }
		 
		 
	}
	
	/**
	 * Search for a workshop data in the list 
	 * @param workshop
	 * @return
	 */
	public boolean workshopFinder(Workshop workshop) {
		boolean result = false; 
		for(Workshop data : workshopList) {
			if(data.equals(workshop)) {
				result = true; 
			}
		}
		return result;
	}
	
	/**
	 * Find workshop by productID
	 * @param ID
	 * @return
	 */
	public List<Workshop> workshopFinderByProductID(int ID) {
		List<Workshop> list = new ArrayList<Workshop>();
		for(Workshop data : workshopList) {
			if(data.getWorkshopID() == ID) {
				list.add(data);
			}
		}
		return list;
	}
	
	/**
	 * Display Employee
	 * @param ID
	 */
	public void displayEmployee(int ID) {
		System.out.println("\n\t\tAvailable Employees");
		for(Employee e : employeeList) {
			if(e instanceof Worker && ((Worker) e).getProductLineAssigned() == ID){
				System.out.println(e.toString());
			}
		}
	}
	
	/**
	 * Display Employee Engineers
	 * @param ID
	 */
	public void displayEmployeeEngineers() {
		System.out.println("\n\t\tAvailable Employees");
		for(Employee e : employeeList) {
			if(e instanceof Engineer){
				System.out.println(e.toString());
			}
		}
	}
	
	/**
	 * Find Employee by ID 
	 * @param ID
	 * @return
	 */
	public Employee findEmployeeByID(int ID) {
		for(Employee e : employeeList) {
			if(e.getID() == ID) {
				return e; 
			}
		}
		return null;
	}
	
	/**
	 * find Workshop by product line ID
	 * @param ID
	 * @return
	 */
	public Workshop findWorkshopByID(int ID) {
		for(Workshop data : workshopList) {
			if(data.getProductLine() == ID) {
				return data; 
			}
		}
		return null;
	}
	
	/**
	 * find Workshop by product line ID
	 * @param ID
	 * @return
	 */
	public Workshop findWorkshopByWorkshopID(int ID) {
		for(Workshop data : workshopList) {
			if(data.getWorkshopID() == ID) {
				return data; 
			}
		}
		return null;
	}
	
	/**
	 * Popualate employee list
	 */
	private void populateEmployeeList() {
		employeeList = new ArrayList<Employee>();

		//create 5 engineers 
		employeeList.add(new Engineer (12345, "Doe", "John", "04/04/2001", "Civil", 8, "CE"));
		employeeList.add(new Engineer (12346, "Doe", "Alex", "04/04/2002", "Civil", 8, "CE"));
		employeeList.add(new Engineer (12347, "Doe", "Brandon", "04/04/2003", "Civil", 8, "CE"));
		employeeList.add(new Engineer (12348, "Doe", "Charles", "04/04/2004", "Civil", 8, "CE"));
		employeeList.add(new Engineer (12346, "Doe", "Dext", "04/04/2005", "Civil", 8, "CE"));
		
		//10 workers
		employeeList.add(new Worker(98765, "Carev", "Ely", "08/08/2021",1,"Civil"));
		employeeList.add(new Worker(98766, "Carev", "Francis", "08/08/2022",3,"Civil"));
		employeeList.add(new Worker(98767, "Carev", "Granz", "08/08/2023",2,"Civil"));
		employeeList.add(new Worker(98768, "Carev", "Harry", "08/08/2024",4,"Civil"));
		employeeList.add(new Worker(98769, "Carev", "Irene", "08/08/2025",2,"Civil"));
		
		employeeList.add(new Worker(45678, "Boston", "James", "08/08/2021",1,"Civil"));
		employeeList.add(new Worker(45677, "Boston", "Kevin", "08/08/2022",3,"Civil"));
		employeeList.add(new Worker(45676, "Boston", "Leo", "08/08/2023",1,"Civil"));
		employeeList.add(new Worker(45675, "Boston", "Mark", "08/08/2024",1,"Civil"));
		employeeList.add(new Worker(45674, "Boston", "Noel", "08/08/2025",5,"Civil"));

	}
	
	/**
	 * Add workers to join a workshop
	 * @param scan
	 */
	public void AddWorkersToJoin(Scanner scan) {
		displayWorkshop(workshopList); 
		
		//Get the workshop to work with
		System.out.println("\nEnter Workshop ID: "); ;
		int ID = scan.nextInt();
		Workshop workshop = findWorkshopByWorkshopID(ID);
		
		//If the workshop does not exist then display the error message
		if(workshop == null ) {
			System.out.println("Sorry the workshop ID does not exist"); 
		}else {
			
			//Display the employees under the same product line of the workshop
			displayEmployee(workshop.getProductLine());
			
			//Enter which employee should join the event
			System.out.println("\nEnter Employee ID to Join:");
			int EmployeeID = scan.nextInt();
			
			//Find it the ID is a valid employee
			Employee e = findEmployeeByID(EmployeeID);
			int cap = workshop.getWorkerParticipants().size();
			
			//If the employee exist and the workshop has not reached its max capacity
			if(e != null && cap < workshop.getMaxCapacity()) {
				
				//Determine if employee is already a participant
				if(findEmployeeinParticipantList(workshop, e.getID())) {
					// If true, print an error that Employee was not added successfully because it already is a participant
					System.out.println("Employee is already a participant"); 
				}else {
					
					//Add Employee to the list of participants
					List<Employee> part = workshop.getWorkerParticipants();
					part.add(e); 
					workshop.setWorkerParticipants(part);
					System.out.println("Successfully added Employee to the list");
				}
				
			}else {
				System.out.println("Was not able to add an employee to the list. Please try again later.");
			}
		}
	}
	
	/**
	 * Find if employee is already participating in the workshop
	 * @param workshop
	 * @param id
	 * @return
	 */
	public boolean findEmployeeinParticipantList(Workshop workshop, int id) {
		boolean result = false; 
		for(Employee e: workshop.getWorkerParticipants()) {
			if(e.getID() == id) {
				result = true; 
			}
		}
		return result;
	}
	/**
	 * Display participants of a workshop
	 * @param workshop
	 */
	public void displayParticipants(Workshop workshop) {
		System.out.println("\n\t\tParticipants of " + workshop.getWorkshopName());
		for(Employee emp : workshop.getWorkerParticipants()) {
			System.out.println(emp.toString());
		}
		System.out.println("There are " + workshop.getWorkerParticipants().size() + " out of " + workshop.getMaxCapacity()+ " participants"); 
		System.out.println("Average is: " + workshop.getWorkerParticipants().size()/workshop.getMaxCapacity());
	
	}
	
	/**
	 * Add workers to join a workshop
	 * @param scan
	 */
	public void RemoveWorkersToJoin(Scanner scan) {
		displayWorkshop(workshopList); 
		
		//get the workshop object to work with
		System.out.println("\nEnter Workshop ID: "); ;
		int lineID = scan.nextInt();
		Workshop workshop = findWorkshopByWorkshopID(lineID);
		
		// if the workshop does not exist display an error message
		if(workshop == null ) {
			System.out.println("Sorry the workshop ID does not exist."); 
		}else {
			
			//Get the participants 
			if(workshop.getWorkerParticipants().size() <= 0) {
				// if there are no participants display that message since there are no employee to be removed
				System.out.println("No participants yet.");
			}else {
				//display all joining participants
				displayParticipants(workshop);
				
				//Get the employee information to remove
				System.out.println("\nEnter Employee ID to Delete:");
				int EmployeeID = scan.nextInt();
				
				//Confirm it is a valid employee
				Employee e = findEmployeeByID(EmployeeID); 
				if(e != null) {
					//remove participant from list
					List<Employee> part = workshop.getWorkerParticipants();
					part.remove(e); 
					workshop.setWorkerParticipants(part);
					System.out.println("Successfully removed Employee to the list");
				}else {
					//display an error that the employee does not exist
					System.out.println("Was not able to remove an employee to the list. Please try again later.");
				}
			}
		}
	}
	
	/**
	 * Save workshop details to file
	 */
	public void saveTotxt() {
		 try (PrintWriter writer = new PrintWriter("./src/output.txt")) {
	    	   StringBuilder sb = new StringBuilder();
	    	   String newLine = "/n";

	    	   //sort workshop list by product line; 
	  		 	Collections.sort(workshopList);
	  		 	
	  		 	//Print each workshop information
	           for (Workshop w : workshopList) {
	        	   sb.append("Product Line :" + w.getProductLine() + System.lineSeparator()); 
	        	   sb.append("ID: " + w.getWorkshopID() + System.lineSeparator());
	        	   sb.append("Workshop Name: " + w.getWorkshopName() + System.lineSeparator());
	        	   sb.append("Engineer In-Charge:" + w.getEng().toString() + System.lineSeparator());
	        	   sb.append("Capacity:" + w.getMaxCapacity() + System.lineSeparator()); 
	        	   sb.append("Participants"+ System.lineSeparator()); 
	        	   
	        	   //display the participants information
	        	   for(Employee e : w.getWorkerParticipants()) {
	        		   sb.append(e.toString() + System.lineSeparator());
	        	   }
	        	   
	        	   sb.append("\n----------\n");
	           }
	           
	           //write the details to the txt file
	           writer.write(sb.toString());

	           System.out.println("Done writing to txt!");

	       } catch (FileNotFoundException e) {
	           System.out.println("Error saving into file!" + e.getMessage());
	       } catch (IOException e) {
	    	   System.out.println("Error in writing the file!");
	       }
	   }
	
	    /**
	     * Get Average number of participants per workshop
	     * @param scan
	     */
		public void getAverageNumberOfParticipants(Scanner scan) {
			for(Workshop workshop : workshopList) {
				//display all joining participants
				displayParticipants(workshop);
				System.out.println("\n");
			}
			
		}
	
}