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

    public static void main(String[] args) {
        String[] letter = { "A", "B", "C", "D" };
        StackSimulation stack = new StackSimulation(letter);

        // Call popAll method to get the reversed array
        String[] reversedArray = stack.popAll(letter);

        // Print each element of the reversed array
        for (String str : reversedArray) {
            System.out.print(str + "");
        }
    }
}
