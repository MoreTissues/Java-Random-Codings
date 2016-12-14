import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			int s = 0, s1 = 0;
			int s2 = 0;
			String str = sc.next();
			int[] ch = new int[9];
			for (int i = 0; i < str.length(); i++) {
				ch[i] = Character.getNumericValue(str.charAt(i));
				s += (ch[i] * (10 - i));
			}
			for (int i = 0; i < str.length(); i++) {
				s1 = s % 11;
			}
				for (int i = 0; i < str.length(); i++) {
					s2 = (11 - s1) % 11;
				}
				System.out.println("case#" + (k + 1) + ": " + s2);
			}
		}
	}

