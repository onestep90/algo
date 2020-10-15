
public class Collatz {

	public static void main(String[] args) {
		int num = 626331;
		int cnt = 0;
		
		while(num != 1) {
			if (cnt==500) {
				num = -1;
				break;
			}
			else {
				num = cal(num);
				cnt++;
				continue;
			}
		}
		
		System.out.println(num);
		System.out.println(cnt);

	}

	private static int cal(int number) {
		
		if (number%2 == 0) {
			number = number/2;
		}
		else {
			number = number*3+1;
		}
		return number;
			
	}

}
