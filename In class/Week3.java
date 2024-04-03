import java.util.*;

public class Week3 {
    public static int[] prob1 = new int[1000000];
    public static Random rng = new Random();

    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            int jesus = rng.nextInt(1000);
            prob1[i] = jesus;
        }
        int[] outputArray = countSort(prob1);

        for (int i = 0; i < prob1.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }
}