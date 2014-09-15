
public class ArrayDemo {

	public static void main(String[] args) {
		int[] anArray;
		
		anArray = new int[10];
		
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;
		
		System.out.println("Element at index 0 is: " + anArray[0]);
		System.out.println("Element at index 1 is: " + anArray[1]);
		System.out.println("Element at index 2 is: " + anArray[2]);
		System.out.println("Element at index 3 is: " + anArray[3]);
		System.out.println("Element at index 4 is: " + anArray[4]);
		System.out.println("Element at index 5 is: " + anArray[5]);
		System.out.println("Element at index 6 is: " + anArray[6]);
		System.out.println("Element at index 7 is: " + anArray[7]);
		System.out.println("Element at index 8 is: " + anArray[8]);
		System.out.println("Element at index 9 is: " + anArray[9]);
		
		String[][] names = {{ "Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);
		System.out.println(names.length);
		
		char copyFrom[] = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		char copyTo[] = new char[7]; 
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		
		char copyFrom2[] = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		char copyTo2[] = java.util.Arrays.copyOfRange(copyFrom2, 2, 9);
		System.out.println(new String(copyTo2));
	}

}
