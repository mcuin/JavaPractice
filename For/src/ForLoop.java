
public class ForLoop {

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			System.out.println("Count is: " + i);
		}
		
		int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int item : numbers) {
			System.out.println("Count is: " + item);
		}
	}

}
