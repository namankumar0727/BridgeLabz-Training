import java.util.Scanner;
public class CheckAnagrams{

    public static void main(String[] args){
	
		//Taking User inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
		
		//Replacing the characters and checking the characters frequency
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        boolean isAnagram=true;
        if(s1.length()!=s2.length()){
            isAnagram=false;
        }
		else{
            for(int i=0;i<s1.length();i++){
                int count1=0;
                int count2=0;
                for(int j=0;j<s1.length();j++){
                    if(s1.charAt(i)==s1.charAt(j)){
                        count1++;
                    }
                    if(s1.charAt(i)==s2.charAt(j)){
                        count2++;
                    }
                }
                if(count1!=count2){
                    isAnagram=false;
                    break;
                }
            }
        }
		
		//Displaying the desired results
        if(isAnagram){
            System.out.println("Strings are Anagrams");
        }else{
            System.out.println("Strings are not Anagrams");
        }
    }
}