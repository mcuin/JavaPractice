
public class SwitchDemo {
	
	public static int getMonthNumber(String month3) {
		int monthNumber = 0;
		
		if (month3 == null) {
			return monthNumber;
		}
		
		switch (month3.toLowerCase()) {
			case "january":
				monthNumber = 1;
				break;
			case "february": 
				monthNumber = 2;
				break;
			case "march": 
				monthNumber = 3;
				break;
			case "april": 
				monthNumber = 4;
				break;
			case "may":
				monthNumber = 5;
				break;
			case "june":
				monthNumber = 6;
				break;
			case "july":
				monthNumber = 7;
				break;
			case "august":
				monthNumber = 8;
				break;
			case "september":
				monthNumber = 9;
				break;
			case "october":
				monthNumber = 10;
				break;
			case "november":
				monthNumber = 11;
				break;
			case "december":
				monthNumber = 12;
				break;
		}
		
		return monthNumber;
	}

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
		
		int month2 = 2;
		int year2 = 2000;
		int numDays = 0;
		
		switch (month2) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				numDays = 31;
				break;
			case 4: case 6: case 9: case 11: 
				numDays = 30;
				break;
			case 2:
				if (((year2 % 4 == 0) && !(year2 % 100 == 0) || (year2 % 400 == 0))) {
					numDays = 29;
				} else {
					numDays = 28;
				}
				break;
			default: 
				System.out.println("Invalid month.");
				break;		
		}
		System.out.println("Number of days " + numDays);
		
		String month3 = "August";
		
		int returnedMonthNumber = SwitchDemo.getMonthNumber(month3);
		
		if (returnedMonthNumber == 0) {
			System.out.println("Invalid month.");
		} else {
			System.out.println(returnedMonthNumber);
		}
	}

}
