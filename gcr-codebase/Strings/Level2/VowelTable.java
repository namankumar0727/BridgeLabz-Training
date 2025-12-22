class VowelTable{
	
	//Method to classify
	static String[][] classify(String s){
		String r[][]=new String[s.length()][2];
		for(int i=0;i<s.length();i++){
			r[i][0]=String.valueOf(s.charAt(i));
			r[i][1]=VowelCount.type(s.charAt(i));
		}
		return r;
	}
}