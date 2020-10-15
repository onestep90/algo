
public class HarshadNumber {

	public static void main(String[] args) {
		
		int x = 10;
		boolean answer = true;
		String xStr = Integer.toString(x);
		int sum = 0;
		for (int i=0; i<xStr.length(); i++) {
			sum += xStr.charAt(i)-'0';
			
		}
		if (x%sum == 0) {
			answer = true;
		}
		else {
			answer = false;
		}
		System.out.println(answer);

	}

}
