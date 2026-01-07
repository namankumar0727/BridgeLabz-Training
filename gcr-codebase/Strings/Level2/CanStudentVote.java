public class CanStudentVote{
	
	//Method to generate Ages
	public static int[] generateAges(int n){
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=10+(int)(Math.random()*50);
		}
		return a;
	}
	
	public static String[][] canVote(int a[]){
		
		//Method to get the new string
		String r[][]=new String[a.length][2];
		for(int i=0;i<a.length;i++){
			r[i][0]=String.valueOf(a[i]);
			r[i][1]=String.valueOf(a[i]>=18);
		}
		return r;
	}
}
