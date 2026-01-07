public class FrequencyNested{

	//Method for frequency
	public static String[] frequency(String s){
		char c[]=s.toCharArray();
		int f[]=new int[c.length];
		for(int i=0;i<c.length;i++){
			f[i]=1;
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					f[i]++;
					c[j]='0';
				}
			}
		}
		String temp[]=new String[c.length];
			int k=0;
			for(int i=0;i<c.length;i++){
				if(c[i]!='0'){
					temp[k++]=c[i]+" "+f[i];
				}
			}
		String result[]=new String[k];
		for(int i=0;i<k;i++)result[i]=temp[i];
			return result;
	}
	
	public static void main(String args[]){
	
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		//Calling method frequency
		String res[]=frequency(text);
		
		//Displaying the desired output
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
	}
}

	