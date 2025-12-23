public class ShortLong{

	//Method to find shortlong
	public static int[] shortLong(String[][] a){
		int min=0,max=0;
		for(int i=1;i<a.length;i++){
			if(Integer.parseInt(a[i][1])<Integer.parseInt(a[min][1])){
				min=i;
			}
			if(Integer.parseInt(a[i][1])>Integer.parseInt(a[max][1])){
				max=i;
			}
		}
		return new int[]{min,max};
	}
}
