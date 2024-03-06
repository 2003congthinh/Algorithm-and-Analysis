import java.util.Arrays;

class Week1 {
    // Problem 1:
    /* 1.1/ Using pseudocode or Java, describe an algorithm to find the largest number in an array - without sorting the array
    Example:
    A = [7, 6, 9, 3, 2, 5] => return 9

    1.2/ Using pseudocode or Java, describe an algorithm to find the second largest number in an array - without sorting the array
    Example:
    A = [7, 6, 9, 3, 2, 5] => return 7 */

    public static int[] numbers = { 7, 6, 93, 3, 2, 10, 1, 21, 12, 19, 23, 45, 50 };

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
        int largest = Largest();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a && numbers[i] != largest) {
                a = numbers[i];
            }
        }
        return a;
    }

    // Problem 2:
    /* An array A of length N contains unique integers between zero and N. 
    Because there are (N + 1) different values but only N elements, there is one value missing.
    Implement an algorithm using pseudocode or Java to find the missing value.
    Examples (N = 5 in the below examples):

    1/ A = [0, 3, 2, 4, 1] => return 5
    2/ A = [1, 5, 2, 4, 3] => return 0
    3/ A = [4, 0, 1, 5, 2] => return 3 */

    public static int[] A = new int[]{6, 3, 2, 4, 1, 5};

    public static int missing_no(){
        int a = 0;
        boolean found;
        for (int i = 0; i < A.length + 1; i++) {
            final int index = i; // Declare index variable outside lambda
            if (found = Arrays.stream(A).anyMatch(x -> x == index) == false){
                a = i;
            }
        }
        return a;
    }

    // Problem 3:
    /*You have two ADTs: Set and Sequence. The Set ADT supports the following operations: add, remove, and size (which returns the number of elements in a set). 
    The Sequence ADT supports the following operations: next (which returns the first, second, etc. elements in a sequence until the last one on each subsequent call; then, if it is called again, it will return false).
    You have two sequences, each containing only unique elements. Describe an algorithm to check whether the two sequences are permutations of the same set.
    Examples:

    1/ Seq1 = [1, 2, 3, 4], Seq2 = [4, 3, 2, 1] => YES
    2/ Seq1 = [1, 2, 3, 4], Seq2 = [1, 2, 3, 4] => YES
    3/ Seq1 = [1, 2, 3], Seq2 = [1, 2, 4] => NO */

    // Problem 4:
    /*Describe an efficient algorithm to answer range queries, but we need the sum of a range this time. More specifically, given an array A[0..N-1], 
    implement an algorithm to return the sum of the sub-array A[L, R], L >= 0 and R <= N-1.
    Example:

    A = [6, 2, 9, 8, 5, 4, 3] 
    rangeSum(0, 0) => 6
    rangeSum(6, 6) => 3
    rangeSum(0, 6) => 37
    rangeSum(3, 4) => 13

    Assumption: the input array is static. */
    public static void main(String[] args) {
        // temp t = new temp();
        // Problem 1:
        System.err.println(Largest());
        System.err.println(Largest_2nd());

        // Problem 2:
        System.err.println(missing_no());
    }
}