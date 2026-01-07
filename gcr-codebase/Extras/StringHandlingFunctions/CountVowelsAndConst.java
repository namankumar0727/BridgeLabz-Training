import java.util.Scanner;
public class CountVowelsAndConst{
	
	//Taking user inputs
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	
	int vowelCount=0;
	int consonentCount=0;
	
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
		str.charAt(i)=='o' ||str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || 
		str.charAt(i)=='O' ||str.charAt(i)=='U')
		{
			vowelCount++;
		}
		else
		consonentCount++;
	}

	System.out.println("Total Number of Vowels are "+vowelCount);
	System.out.println("Total Number of Vowels are "+vowelCount);
	
	return 0;
	}
}