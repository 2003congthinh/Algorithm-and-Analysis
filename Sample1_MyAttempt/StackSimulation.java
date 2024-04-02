package Sample1_myattempt;

public class StackSimulation {
    private String[] stackArray;

    public StackSimulation(String[] stack) {
        this.stackArray = stack;
    }

    public String[] popAll(String[] stack) {
        String[] returnPop = new String[stack.length];
        for (int i = 0; i < stack.length; i++) {
            returnPop[i] = stack[stack.length - i - 1];
        }
        return returnPop;
    }

    // public int minOperations(String[] targetStack, String[] currentStack){

    // }

    public static void main(String[] args) {
        String[] letter = { "A", "B", "C", "D" };
        String[] empty = {};
        StackSimulation stack1 = new StackSimulation(letter);
        StackSimulation stack2 = new StackSimulation(empty);

        // Call popAll method to get the reversed array
        String[] reversedArray = stack1.popAll(letter);
        String[] emptyArray = stack2.popAll(empty);

        // Print each element of the reversed array
        for (String str : reversedArray) {
            System.out.print(str + "");
        }
        for (String str : emptyArray) {
            System.out.print(str + "");
        }
    }
}
