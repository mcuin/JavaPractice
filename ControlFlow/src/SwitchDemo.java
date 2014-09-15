
public class SwitchDemo {

	public static void main(String[] args) {
		int month = 8;
		String monthString;
		switch (month) {
			case 1: monthString = "January";
					break;
			case 2: monthString = "February";
					break;
			case 3: monthString = "March";
					break;
			case 4: monthString = "April";
					break;
			case 5: monthString = "May";
					break;
			case 6: monthString = "June";
					break;
			case 7: monthString = "July";
					break;
			case 8: monthString = "August";
					break;
			case 9: monthString = "September";
					break;
			default: monthString = "Not a valid number";
					break;
		}
		System.out.println(monthString);
		java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
		
		switch (month) {
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("Arpil");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		}
		
		if(futureMonths.isEmpty()) {
			System.out.println("No valid months");
		} else {
			for(String monthName : futureMonths) {
				System.out.println(monthName);
			}
		}
	}

}
