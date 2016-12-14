import java.util.Scanner;

public class SecretMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = 0;
		while (true) {
			String str = sc.nextLine();
			if (str.equals("#"))
				break;
			i1++;
			int count = 0;
			System.out.print("Case #" + i1 + ":" + " ");
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (Character.isDigit(ch))
					ch += 1;
				if (ch > 64 && ch < 91)
					ch += 1;
				if (ch > 96 && ch < 123)
					ch += 1;
				if (ch == 123)
					ch = 97;
				if (ch == 91)
					ch = 65;

				System.out.print(ch);

			}
			System.out.println();

		}
	}
}
