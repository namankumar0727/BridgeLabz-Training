import java.util.Scanner;

public class SmartParkingSystem{
	
	//Method for Parking
	static int vacant=10;
	static int currOccupied=0;
	public static void park(){
		
		if(vacant>0){
			currOccupied++;
			System.out.println("Parking Successfull");
		}
		return;
		
	
	}
	
	//Method for showing Occupancy
	public static void showOccupancy(){
	
		vacant=vacant-currOccupied;
		System.out.println("Available slots are "+vacant);

	}
			
	public static void main(String args[]){
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		while(true){
			
			if(vacant==currOccupied){
				System.out.println("Parking lot is full. Good Bye");
				return;
			}
			System.out.println("Enter your choice from given below - >");
			System.out.println("1. Park \n2.Show Occupancy \n3.Exit From Parking Lot");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					park();
					break;
				case 2:
					showOccupancy();
					break;
				case 3:
					System.out.println("Application Exited Successfully");
					return;
			}	
		
		}
	
	}

}