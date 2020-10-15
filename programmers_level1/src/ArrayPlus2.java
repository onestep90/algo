public class ArrayPlus2 {
    public static void main(String[] arg){
        int x = 2;
        int n = 5;
        long[] answer = new long[n];
        int temp = x;
        for(int i=0; i<n; i++){

            answer[i] = temp;
            temp += x;
        }

    }
}
