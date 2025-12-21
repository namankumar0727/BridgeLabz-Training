class CheckSpringSeason{

	//Method to check if it is a spring season or not
	static boolean isSpringSeason(int month,int day){
		if(month==3 && day>=20){
			return true;
		}
		if(month==4 || month==5){
			return true;
		}
		if(month==6 && day<=20){
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		
		if(args.length<2) return;
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		
		//Calling method to check if it is a spring season or not and displaying the desired results
		if(isSpringSeason(month,day)){
			System.out.println("It is  a Spring Season");
		}
		else{
			System.out.println("It is not a Spring Season");
		}
	}
}

