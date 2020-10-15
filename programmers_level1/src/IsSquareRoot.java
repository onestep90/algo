
public class IsSquareRoot {

	public static void main(String[] args) {
		long n = 121;
		double target = Math.sqrt(n);
		int intTarget = (int)target;
		long answer = 0;
        
		if(target%intTarget == 0) {
			answer = (long)Math.pow(intTarget+1, 2);
		}
		else {
			answer = -1;
		}
        
//        return answer;
		System.out.println(answer);

	}

}
