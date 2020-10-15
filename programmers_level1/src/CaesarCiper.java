
public class CaesarCiper {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
		System.out.println('a'+1);
		System.out.println((char)(s.charAt(2)+1));
		System.out.println((int)(' '));
		for(int i=0; i<s.length(); i++) {
			if((int)s.charAt(i)==32) {
				answer += s.charAt(i);
				continue;
			}
			
			else if(s.charAt(i)>=65 && s.charAt(i)<=90) { //Character.isUpperCase(ch)
				if(s.charAt(i)+n<=90) {
					answer += (char)(s.charAt(i)+n);
					continue;
				}
				else {
					answer += (char)(s.charAt(i)+n-26);
					continue;
				}
			}
			
			else if(s.charAt(i)>=97 && s.charAt(i)<=122) { // Character.isLowerCase(ch)
				if(s.charAt(i)+n<=122) {
					answer += (char)(s.charAt(i)+n);
					continue;
				}
				else {
					answer += (char)(s.charAt(i)+n-26);
					continue;
				}
			}				
			
		}
		System.out.println(answer.charAt(0));
		System.out.println(answer.charAt(1));
		System.out.println(answer.charAt(2));
		System.out.println(answer.charAt(3));
		System.out.println(answer.charAt(4));
		
	}	

}
