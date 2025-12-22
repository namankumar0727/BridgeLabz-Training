import java.util.Scanner;
class RockPaperScissor{
	
	//Method for computer
	static String computer(){
		String a[]={"rock","paper","scissors"};
		return a[(int)(Math.random()*3)];
	}

	//Method for winner
	static int winner(String u,String c){
		if(u.equals(c))return 0;
		if((u.equals("rock")&&c.equals("scissors"))||
		(u.equals("paper")&&c.equals("rock"))||
		(u.equals("scissors")&&c.equals("paper")))return 1;
		return -1;
	}

	public static void main(String args[]){
	
		//Taking inputs from the user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int uw=0,cw=0;
		for(int i=0;i<n;i++){
			String u=sc.next();
			String c=computer();
			int r=winner(u,c);
			if(r==1)uw++;
			if(r==-1)cw++;
		}
	
		//Displaying the desired outputs
		System.out.println(uw+" "+cw);
		System.out.println((uw*100.0/n)+" "+(cw*100.0/n));
	}
}