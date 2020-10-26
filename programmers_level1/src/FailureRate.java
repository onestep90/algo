import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FailureRate {
    public static boolean isZero(double[] arr) {
        boolean answer = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != -2) {
                return answer;
            }
            else {
                continue;
            }
        }

        answer = true;
        return answer;
    }
    public static void main(String[] arg) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


        double[] failureRate = new double[N];

        for(int i=0; i<N; i++) {
            int cntStagePlayer = 0;
            int cntStageUnclear = 0;
            for(int j=0; j<stages.length; j++) {
                if(stages[j] > i+1) {
                    cntStagePlayer++;
                    continue;
                }
                else if(stages[j] == i+1) {
                    cntStagePlayer++;
                    cntStageUnclear++;
                    continue;
                }
                else {
                    continue;
                }
            }
            failureRate[i] = (double)cntStageUnclear/(double)cntStagePlayer;
        }
        System.out.println(failureRate[2]);


//        int index = 0;
        ArrayList<Integer> idx = new ArrayList<Integer>();
        ArrayList<Integer> idxRow = new ArrayList<Integer>();
        while(!isZero(failureRate)){
            double max = -1;
            for(int i=0; i<failureRate.length; i++) {
                if(max < failureRate[i]) {
                    idxRow.clear();
                    max = failureRate[i];
                    idxRow.add(i);
                }
                else if(max == failureRate[i]) {
                    idxRow.add(i);
                }
                else {
                    continue;
                }
            }

            for(int i=0; i<idxRow.size(); i++) {
                failureRate[idxRow.get(i)] = -2;
                idx.add(idxRow.get(i)+1);
            }

        }
        Integer[] answer1 = idx.toArray(new Integer[idx.size()]);
        int[] answer = new int[answer1.length];
        for(int i=0; i<answer1.length; i++) {
            answer[i] = answer1[i].intValue();
        }

        System.out.println(failureRate[1]);
        System.out.println(idx.get(2));
        System.out.println(answer[0]);
        System.out.println(idx);

    }

}
