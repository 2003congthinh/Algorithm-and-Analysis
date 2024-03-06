import java.lang.reflect.Array;

class Week1 {
    public static int[] numbers = { 7, 6, 9, 3, 2, 5, 10, 1, 23, 45, 12, 19, 23 };

    public static int Largest() {
        int a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a) {
                a = numbers[i];
            }
        }
        return a;
    }

    public static int Largest_2nd() {
        int a = numbers[0];
        int[] b = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a) {
                a = numbers[i];
                b[i] = a;
            }
        }
        return b[numbers.length - 1];
    }

    public static void main(String[] args) {
        // temp t = new temp();
        System.err.println(Largest());
        System.err.println(Largest_2nd());
    }
}