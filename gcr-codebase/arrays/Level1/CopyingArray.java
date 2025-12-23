import java.util.Scanner;
public class CopyingArray{
public static void main(String args[]){

	//Taking the input of rows and columns
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	int columns=sc.nextInt();
	int matrix[][]=new int[rows][columns];
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			matrix[i][j]=sc.nextInt();
		}	
	}
	
	//Copying the elements of 2d in 1d
	int a[]=new int[rows*columns];
	int index=0;
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			a[index]=matrix[i][j];
			index++;
		}
	}
	
	//Displaying the elements of 1D array
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}
}
