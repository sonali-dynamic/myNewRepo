class CountingRepeatedString {
	public static void main(String args[]) {
		String str = "AABBBEEF" 
        int count = 0;		// A2B3E2F1
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.print(str.charAt(i)+""+count);
		}
	}
  
}