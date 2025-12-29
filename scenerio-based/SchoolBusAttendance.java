import java.util.Scanner;

public class SchoolBusAttendance {
    
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        String Students[]= {
            "naman", "a", "b", "c", "d",
            "e", "f", "g", "h", "i"
        };

        char attendance[] = new char[10];

        int totalPresent=0;
        int totalAbsent=0;

        int i=0;
        for (String s : Students) {
            System.out.println(s + ": is present or absent (P/A)");
            attendance[i] =sc.next().charAt(0); 
            i++;
        }

        for (char status : attendance) {
            if (status=='P') { 
                totalPresent++;
            } else {
                totalAbsent++;
            }
        }

        for (int j=0; j<10; j++) {
            System.out.println(Students[j] + " is " + attendance[j]);
        }

        System.out.println("Total present students are - >" + totalPresent);
        System.out.println("Total absent students are - > " + totalAbsent);

    }

}
