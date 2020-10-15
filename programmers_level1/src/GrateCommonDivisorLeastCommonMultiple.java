
public class GrateCommonDivisorLeastCommonMultiple {

	public static void main(String[] args) {
		
		int n = 12;
		int m = 3;
		int tmp;
		if (n>m) {
			tmp = n;
			n = m;
			m = tmp;
		}
		int[] answer = {1, 0};
		
		for (int i=2; i<=n; i++) {
			if(n%i==0 && m%i==0) {
				answer[0] = i;
				answer[1] = i*(n/i)*(m/i);
			}
		}
		
		if (answer[0] == 1){
            answer[1] = n*m;
        }
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
