import java.util.ArrayList;
import java.util.Arrays;

public class DeleteSmallestValue {

	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 1};
		if (arr.length == 1){
            int[] answer = new int[arr.length];
            answer[0] = -1;
            
        }
        int[] answer = new int[arr.length-1];
//		int[] arr = {10};
		
//		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			arrList.add(arr[i]);
		}
		int smallestValue = arrList.get(0);
		
		for(int i=0; i<arrList.size(); i++) {
			if(smallestValue> arrList.get(i)) {
				smallestValue = arrList.get(i);
			}
		}
		
		for(int i=0; i<arrList.size(); i++) {
			if(smallestValue == arrList.get(i)) {
				arrList.remove(i);
				break;
			}
		}
		
		for(int i=0; i<arrList.size(); i++) {
			answer[i] = arrList.get(i);
		}
        
		System.out.println(answer.length);
	}

}
