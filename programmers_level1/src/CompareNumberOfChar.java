
public class CompareNumberOfChar {

	public static void main(String[] args) {
		String s = "pPoooyY";
		String s2 = "";
		boolean answer;
		//make lower case letter
		for (int i=0; i<s.length(); i++) {
			int temp = (int)s.charAt(i);
			if (temp>=65 && temp<=90) { //case of upper case. lower case is 97~122
				s2 += (char)(temp+32);
			}
			else {
				s2 += (char)temp;
			}
		}
		//find number of p
		int nP = 0;
		int nY = 0;
		for (int i=0; i<s2.length(); i++) {
			if(s2.charAt(i) == 'p') {
				nP++;
				continue;
			}
			else if(s2.charAt(i) == 'y') {
				nY++;
				continue;
			}
		}
		//print
		if (nP == nY) {
			answer = true;
		}
		else {
			answer = false;
		}
		System.out.println(answer);
	}

}
