
public class Break {

	public static void main(String[] args) {
		int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
		int searchFor = 12;
		int i;
		int j = 0;
		boolean foundIt = false;
		
		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchFor) {
				foundIt = true;
				break;
			}
		}
		
		if (foundIt) {
			System.out.println("Item is: " + searchFor + " at index: " + i);
		} else {
			System.out.println("Item not in index.");
		}
		
		foundIt = false;
		
		search:
			for (i = 0; i < arrayOfInts.length; i++) {
				for (j = 0; j < arrayOfInts.length; j++) {
					if (arrayOfInts[i][j] == searchFor) {
						foundIt = true;
						break search;
					}
				}
			}
		if (foundIt) {
			System.out.println("Object is: " + searchFor + " at index: " + i + "," + j);
		} else {
			System.out.println("Object is not in array.");
		}
	}

}
