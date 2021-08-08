import java.util.Scanner;

public class mainClass {
	public static Scanner scan= new Scanner(System.in); 

	public static void main(String[] args) {
		int option = 0; 
		WorkshopDriver work = new WorkshopDriver(); 
		
		try {
			do {
				option = menu(); 
				switch(option) {
					case 1: work.createWorkshop(scan);break; 
					case 2: work.AddWorkersToJoin(scan); break;
					case 3: work.RemoveWorkersToJoin(scan); break;
					case 4: work.displayWorkshop(work.getWorkshopList());break;
					case 5: work.saveTotxt(); break;
					case 6: System.exit(0); break;
					default : System.out.println("Incorrect input"); 
				}
			}while(option !=6);
		} catch (Exception e) {
			System.out.println("Error has occured. Terminatig the program");
		}
	}
	
	public static int menu(){
		System.out.println("\n\t\t Welcome to the Factory ");
		System.out.println("1-Create a Workshop");
		System.out.println("2-Add Workers to participate workshop"); 
		System.out.println("3-Removing Workers from workshop"); 
		System.out.println("4-Display all Workshops"); 
		System.out.println("5-Export to File"); 
		System.out.println("6-Exit"); 
		System.out.println("Enter your choice of task: "); 
		return scan.nextInt();
	}

}
