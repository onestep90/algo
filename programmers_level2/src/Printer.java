import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class Printer {

    public static void isPrintable(int[] priorities, int location) {

    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<priorities.length; i++) {
            if(priorities[i] > priorities[location]) {
                answer++;
            }
            else if(priorities[i] == priorities[location]) {
                stack.push(i);
            }
        }

        if(stack.size() == 1) {
            return answer;
        }

        System.out.println(answer);
        System.out.println(stack);

        int ROOP_SIZE = stack.size();
        int index;
        for(int i=0; i<ROOP_SIZE; i++) {
            index = stack.pop();
            if(index == location) {
                break;
            }
            else if(index != location) {
                answer++;
                continue;
            }
        }


        return answer;
    }



    public static void main(String args[]) {
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        isPrintable(priorities, location);
        System.out.println(solution(priorities, location));
    }
}
