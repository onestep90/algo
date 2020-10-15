
public class Str2Int {

	public static void main(String[] args) {
		String s1 = "-"; // 45
		String s2 = "+"; // 43
		String s3 = "0123456789"; // 48~57
		String s = "-1234";
		int answer = 0;
		
		if(s.charAt(0)==45) {
			for(int i=s.length()-1; i>0; i--) {
				answer -= ((int)s.charAt(i)-'0')*(int)Math.pow(10,((s.length()-1)-i));
			}
		}
		
		else if(s.charAt(0)==43) {
			for(int i=s.length()-1; i>0; i--) {
				answer += ((int)s.charAt(i)-'0')*(int)Math.pow(10,((s.length()-1)-i));
			}
		}
		
		else {
			for(int i=s.length()-1; i>=0; i--) {
				answer += ((int)s.charAt(i)-'0')*(int)Math.pow(10,((s.length()-1)-i));
			}
			
		}
		System.out.println(answer);
		System.out.println((int)Math.pow(10, 0));
	}

}
