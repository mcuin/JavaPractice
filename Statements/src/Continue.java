
public class Continue {

	public static void main(String[] args) {
		String searchMe = "peter piper picked a " + "peck of pickled peppers"; 
		int max = searchMe.length();
		int p = 0;
		
		for (int i = 0; i < max; i++) {
			if (searchMe.charAt(i) != 'p') {
				continue;
			}
			p++;
		}
		
		System.out.println("Found " + p + " p's in the string.");
		
		String searchMe2 = "Find a substring in me.";
		String subString = "sub";
		boolean foundIt = false;
		
		int max2 = searchMe2.length() - subString.length();
		
		test:
			for (int i = 0; i <= max; i++) {
				int n = subString.length();
				int j = i;
				int k = 0;
				while (n-- != 0) {
					if (searchMe2.charAt(j++) != subString.charAt(k++)) {
						continue test;
					} 
				}
				foundIt = true;
				break test;
			}
		
		System.out.println(foundIt ? "Found it" : "Did not find it");
	}

}
