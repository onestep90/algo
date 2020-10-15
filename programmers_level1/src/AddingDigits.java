
public class AddingDigits {

	public static void main(String[] args) {
		// convert int to string
		int n = 123;
		int answer = 0;
		String n2 = Integer.toString(n);
		for(int i=0; i<n2.length(); i++) {
			answer += Character.getNumericValue(n2.charAt(i));
		}
		System.out.println(answer);
		
	}

}
