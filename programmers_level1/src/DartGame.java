import java.util.ArrayList;

public class DartGame {
    public static void main(String[] arg) {
        String dartResult = "1D2S#10S";

        System.out.println((int)dartResult.charAt(1));
        System.out.println((int)dartResult.charAt(3));
        System.out.println((int)dartResult.charAt(6));

        System.out.println((int)'*');
        System.out.println((int)'#');

        System.out.println((int)'0');
        System.out.println((int)'9');

        int x = '9';
        int y = x - '0';
        System.out.println(y);

        int answer = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> powIndex = new ArrayList<Integer>();
        ArrayList<Integer> additionalIndex = new ArrayList<Integer>();

        for(int i=0; i<dartResult.length(); i++) {
            // get dart score
            if((int)dartResult.charAt(i) >= 48 && (int)dartResult.charAt(i) <= 57 ) {

                if (i >= 1 && (int)dartResult.charAt(i-1) == 49) {
                    num.remove(num.size()-1);
                    num.add(10);
                    continue;
                }
                else {
                    num.add(dartResult.charAt(i) - '0');
                    continue;
                }
            }
            // get pow index
            else if((int)dartResult.charAt(i) == 83) {
                powIndex.add(1);
                if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 42) {
                    additionalIndex.add(2);
                    continue;
                }
                else if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 35) {
                    additionalIndex.add(-1);
                    continue;
                }
                else {
                    additionalIndex.add(1);
                    continue;
                }
            }

            else if((int)dartResult.charAt(i) == 68) {
                powIndex.add(2);
                if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 42) {
                    additionalIndex.add(2);
                    continue;
                }
                else if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 35) {
                    additionalIndex.add(-1);
                    continue;
                }
                else {
                    additionalIndex.add(1);
                    continue;
                }
            }

            else if((int)dartResult.charAt(i) == 84) {
                powIndex.add(3);
                if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 42) {
                    additionalIndex.add(2);
                    continue;
                }
                else if(i < dartResult.length()-1 && (int)dartResult.charAt(i+1) == 35) {
                    additionalIndex.add(-1);
                    continue;
                }
                else {
                    additionalIndex.add(1);
                    continue;
                }
            }
            // get additional score index
        }

        System.out.println(num);
        System.out.println(powIndex);
        System.out.println(additionalIndex);

        // Calculation
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<3; i++) {
            if(i == 0) {
                result.add((int)(Math.pow(num.get(i), powIndex.get(i))*additionalIndex.get(i)));
                continue;
            }
            else if(additionalIndex.get(i) == 2) {
                result.set(i-1, result.get(i-1)*2);
                result.add((int)(Math.pow(num.get(i), powIndex.get(i))*additionalIndex.get(i)));
                continue;
            }
            else {
                result.add((int)(Math.pow(num.get(i), powIndex.get(i))*additionalIndex.get(i)));
                continue;
            }
        }
        for(int i=0; i<result.size(); i++) {
            answer += result.get(i);
        }

        System.out.println(result);
        System.out.println(answer);

    }
}
