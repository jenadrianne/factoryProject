import java.util.Scanner;

public class mainClass {
	
	//Scanner for user inputs
	public static Scanner scan= new Scanner(System.in); 

	public static void main(String[] args) {
		// variable to store the option from the menu
		int option = 0; 
		
		//create a work instance
		WorkshopDriver work = new WorkshopDriver(); 
		
		try {
			do {
				
				//display menu
				option = menu(); 
				
				//call specific functions in workshop driver class
				switch(option) {
					case 1: work.createWorkshop(scan);break; 
					case 2: work.AddWorkersToJoin(scan); break;
					case 3: work.RemoveWorkersToJoin(scan); break;
					case 4: work.getAverageNumberOfParticipants(scan); break;
					case 5: work.displayWorkshop(work.getWorkshopList());break;
					case 6: work.saveTotxt(); break;
					case 7: System.exit(0); break;
					default : System.out.println("Incorrect input"); 
				}
				
			// system will only stop if the option is 6
			}while(option != 7);
			
		} catch (Exception e) {
			System.out.println("Error has occured. Terminatig the program");
		}finally {
			scan.close();
		}
	}
	
	/**
	 * Display Menu Options
	 * @return
	 */
	public static int menu(){
		System.out.println("\n\t\t Welcome to the Factory ");
		System.out.println("1-Create a Workshop");
		System.out.println("2-Add Workers to participate workshop"); 
		System.out.println("3-Removing Workers from workshop"); 
		System.out.println("4-Get Average Participants"); 
		System.out.println("5-Display all Workshops"); 
		System.out.println("6-Export to File"); 
		System.out.println("7-Exit"); 
		System.out.println("Enter your choice of task: "); 
		return scan.nextInt();
	}

}
