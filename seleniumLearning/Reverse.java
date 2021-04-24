package seleniumLearning;

public class Reverse {

	public static void main(String[] args) {
		String a1 = "iam Software tester";
		String[] b1 = a1.split(" ");
		for (int i = 0; i < b1.length-1; i++) {
			if (i%2==0) {
				System.out.print(" "+b1[i]);
				System.out.print(" ");
				
			} else {
				char[] ch = b1[i].toCharArray();
				for (int j = ch.length-1; j >=0; j--) {
					System.out.print(""+ch[j]);
					
				}

			}
			
		}

	}

}
