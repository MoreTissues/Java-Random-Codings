import java.util.Scanner;

public class B2D {

	public static String getMonthName(int month) {
		int months = 0;
		String Months = null;

		if (month == 1)
			Months = "Jan";
		else if (month == 2)
			Months = "Feb";
		else if (month == 3)
			Months = "March";
		else if (month == 4)
			Months = "April";
		else if (month == 5)
			Months = "May";
		else if (month == 6)
			Months = "June";
		else if (month == 7)
			Months = "July";
		else if (month == 8)
			Months = "August";
		else if (month == 9)
			Months = "Sept";
		else if (month == 10)
			Months = "Oct";
		else if (month == 11)
			Months = "Nov";
		else if (month == 12)
			Months = "Dec";

		return Months;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int mm = sc.nextInt();

			String Pro = getMonthName(mm);

			System.out.println(Pro);

		}
	}
}
