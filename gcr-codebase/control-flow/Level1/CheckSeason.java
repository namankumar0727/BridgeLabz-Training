class CheckSeason{
	
	public static void main(String args[]){
		
		//Taking input of the month and day
		if(args.length<2) return;
		int month = Integer.parseInt(args[0]);
        	int day = Integer.parseInt(args[1]);
		
		
		//Checking if it is a spring season or not
		if(month==3){
			if(day>=20)
			System.out.println("Its a Spring Season");
			else
			System.out.println("Not a Spring Season");
		}
		else if(month==4){
			System.out.println("Its a Spring Season");
		}
		else if(month==5){
			if(day<=20)
			System.out.println("Its a Spring Season");
			else
			System.out.println("Not a Spring Season");
		}	
		else{
			System.out.println("Not a Spring Season");
			}
	}
}