import java.util.*;
class DigitalWatchSimulation{
	
	public static void main(String args[]){
		for(int i=0;i<24;i++){
			for(int j=0;j<60;j++){
			if(i==13){
				return;
			}
			if(i<10 && j<10){
				System.out.println("0"+i+":0"+j);
			}
			else if(j<10){
				System.out.println(i+":0"+j);
			}
			else if(i<10){
				System.out.println("0"+i+":"+j);
			}
			else{
				System.out.println(i+":"+j);
		}
	}

}
	}
}