import java.util.ArrayList;
public class PrimeNumber {
	public static void getPrime(int number, ArrayList<Integer> prime) {
		prime.add(2);
		
		for (int i=3; i<=number; i++) {
			for(int j=0; j<prime.size(); j++) {
				if (prime.get(j)>Math.sqrt(i)) {
					prime.add(i);
					break;
				}
				
				else if (i%prime.get(j)==0) break;
				
//				else if (j+1==prime.size()){
//					prime.add(i);
//					continue;
//				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int n = 10;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int answer = 0;
		getPrime(n ,prime);
		answer = prime.size();
		
		
		System.out.println(answer);
	}

}
