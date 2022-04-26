import java.util.ArrayList;

public class Passwords {
	public static ArrayList<String> stored = new ArrayList<String>();

	public static void main(String[] args) {

	}

	public static boolean addPassword(String password) {
		boolean allTrue = false;
		int count = 0;

		if (!stored.contains(password)) {
			if (password.length() > 7 && password.length() < 12) {
				if (password.matches("(.*[0-9].*)")) {
					if (password.contains("6") || password.contains(" ")) {
						allTrue = false;
					} else {
						for (int i = 0; i < password.length(); i++) {
							if (password.charAt(i) == 'A' || password.charAt(i) == 'E' || password.charAt(i) == 'I' || password.charAt(i) == 'O' || password.charAt(i) == 'U' || password.charAt(i) == 'Y') {
								count++;
							}
						}
						if (count >= 2) {
							stored.add(password);
							allTrue = true;
						}
					}
				}
			}
			if (password.equalsIgnoreCase("admin") || password.equalsIgnoreCase("mod")) {
				stored.add(password);
				allTrue = true;
			}
		}

		return allTrue;
	}

}
