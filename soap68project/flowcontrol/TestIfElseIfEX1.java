package tw.soap68.soap68project.flowcontrol;

public class TestIfElseIfEX1 {

	public static void main(String[] args) {
		int month = (int) (Math.random() * 12 + 1);
		int year = (int) (Math.random() * 5000 - 2100);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + " has 31 days.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + " has 30 days.");
		} else if (month == 2) {
			// lab:leap year
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println(month + " has 29 days.");
			} else {
				System.out.println(month + "has 28 days.");
			}
		} else {
			System.out.println("Invalid Month!");
		}
		System.out.println("finished.");
	}

}
