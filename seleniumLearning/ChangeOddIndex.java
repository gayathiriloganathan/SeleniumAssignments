package seleniumLearning;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		char[] oddindex = test.toCharArray();
		for (int i = 0; i < oddindex.length; i++) {
		if (i%2==0) {
			char chartest = Character.toUpperCase(oddindex[i]);
			System.out.print(chartest);
			
		} else {
			System.out.print(oddindex[i]);

		}
			
		}
			
		}


	}


