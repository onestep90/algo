import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class FuncDev {
    public static boolean check(int[] array) {
        for(int i=0; i<array.length; i++) {
            if(array[i] < 100) {
                return false;
            }
            else {
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};


        int[] days = new int[progresses.length];
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int cnt = 0;
        while(!check(progresses)) {
            for(int i=0; i<progresses.length; i++) {
                if(progresses[i] >= 100) {
                    continue;
                }
                else {
                    progresses[i] += speeds[i];
                    days[i]++;
                }
            }
            cnt++;
        }

        for(int i=0; i<days.length; i++) {
            if(queue.size() == 0) {
                queue.add(days[i]);
            }
            else if(queue.peek() >= days[i]) {
                queue.add(days[i]);
                if(i == days.length-1) {
                    stack.push(queue.size());
                }
            }
            else if(queue.peek() < days[i] ) {
                stack.push(queue.size());
                for (int j=0; j<stack.peek(); j++) {
                    System.out.println(queue.poll());
                }
                queue.add(days[i]);
                if (i == days.length-1) {
                    stack.push(queue.size());
                }
            }
        }
        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        System.out.println(cnt);
        System.out.println(days[1]);
        System.out.println(stack);
        System.out.println(queue);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
