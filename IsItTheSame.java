import java.util.Scanner;

public class IsItTheSame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			String str = sc.next();
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = reverse.charAt(j);
				char ch2 = str.charAt(j);
				if (ch == ch2)
					count++;
			}
			System.out.print("Case #" + (k + 1) + ":" + " ");
			if (count == str.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
