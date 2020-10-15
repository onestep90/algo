
public class replaceStrByIndex {
	public static String myReplace(String s) {
		String result = "";
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)==32){
                result += s.charAt(i);
                continue;
            }
            
            else{
                if(i%2==1){
                    if((int)(s.charAt(i))>=65 && (int)(s.charAt(i))<=90){
                        result += (char)(s.charAt(i)+32);
                        continue;
                     }
                    else{
                        result += s.charAt(i);
                        continue; 
                    }
                }
                else{
                    if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                        result += (char)(s.charAt(i)-32);
                        continue;
                    }
                    else{
                        result += s.charAt(i);
                        continue;
                    }
                }   
            }       
        }
        return result;
	}

	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		int beginIndex = 0;
		int endIndex = 0;
		
		for (int i=0; i<s.length(); i++) {
			
			if((int)s.charAt(i)==32) {
				endIndex = i+1;
				answer += myReplace(s.substring(beginIndex, endIndex));
				beginIndex = i+1;
				continue;
			}
			
			else if(i==s.length()-1) {
				endIndex = i+1;
				answer += myReplace(s.substring(beginIndex, endIndex));
				break;
			}
			else {
				continue;
			}
		}
        System.out.println(answer);

	}

}
