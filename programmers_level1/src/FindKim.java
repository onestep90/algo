
public class FindKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
        int index = 0;
        for (int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                index = i;
                break;
            }
            else{
                continue;
            }
        }
        answer = "김서방은 "+String.valueOf(index)+"에 있다";
//        return answer;
		System.out.println(answer);
		
		
	}

}
