package seleniumLearning;

public class FindPalindrome {

	public static void main(String[] args) {
		String test1 = "mytesting";
		String palin1 = "";
		char[] character =test1.toCharArray();
		int length = test1.length();
		for (int i = length-1; i >=0; i--) {
			palin1 +=Character.toString(character[i]);
			
		}
		if (test1.equalsIgnoreCase(palin1)) {
			System.out.println(palin1);
			System.out.println("palidrome");
			
		} else {
			System.out.println("Not a palidrome");

		}

	}

}
