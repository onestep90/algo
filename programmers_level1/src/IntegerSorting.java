import java.util.Arrays;

public class IntegerSorting {

	public static void main(String[] args) {
		long n = 99239;
		long answer = 0;
		
		String s = String.valueOf(n);
		int[] nArray = new int[s.length()];
		for(int i=0; i<nArray.length; i++) {
			nArray[i] = Character.getNumericValue(s.charAt(i));
		}
		
		// sorting desc
		Arrays.sort(nArray);
		
		String tempS = "";
		for(int i=nArray.length-1; i>=0; i--) {
			tempS += nArray[i];
		}
		answer = Integer.parseInt(tempS);
		System.out.println(answer);
		
		

	}

}
