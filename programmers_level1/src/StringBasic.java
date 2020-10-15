
public class StringBasic {

	public static void main(String[] args) {
		String s = "1234";
		boolean answer = true;
		
		if (s.length()!=4 && s.length()!=6) {
			answer = false;
		}
		
		else {
			for (int i=0; i<s.length(); i++) {
				int temp = (int)s.charAt(i);
				if (temp>=65 && temp<=90) {
					answer = false;
					break;
				}
				else if(temp>=97 && temp<=122) {
					answer = false;
					break;
				}
			}
		}
			
		
		
		
		System.out.println(answer);
		
		
	}

}
