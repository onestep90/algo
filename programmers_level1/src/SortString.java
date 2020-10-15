
public class SortString {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		char[] c = s.toCharArray();
		boolean[] idx = new boolean[s.length()];
//		for (int i=0; i<c.length-1; i++) {
//			if ((int)c[i]>=65 && (int)c[i]<=90) {
//				c[i] = (char)((int)c[i]+32);
//				idx[i] = true;
//				continue;
//			}
//			else {
//				idx[i] = false;
//			}
//		}
		
		char tmp;
		boolean tmp1;
		for (int i=0; i<c.length-1; i++) {
			for (int j=i+1; j<c.length; j++) {
				if ((int)c[i]<(int)c[j]){
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
					
					tmp1 = idx[i];
					idx[i] = idx[j];
					idx[j] = tmp1;
					continue;
				}
//				else if ((int)c[i]-(int)c[j] == 32) {
//					tmp = c[i];
//					c[i] = c[j];
//					c[j] = tmp;
//					
//					tmp1 = idx[i];
//					idx[i] = idx[j];
//					idx[j] = tmp1;
//					continue;
//				}
			}
		}
		
//		for (int i=0; i<c.length; i++) {
//			if (idx[i]==true) {
//				c[i] = (char)((int)c[i]-32);
//			}
//		}
		
		for (int i=0; i<c.length; i++) {
			answer += c[i];
		}
		
		System.out.println(c[0]);

	}

}
