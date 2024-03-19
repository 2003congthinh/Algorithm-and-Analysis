import java.util.Stack;

public class StackSimulation {
    private String[] stackArray;

    public StackSimulation(String[] stack) {
        this.stackArray = stack;
    }

    // popAll complexity = O(N)
    public String[] popAll(String[] stack) {
        Stack<String> tempStack = new Stack<>();
        for (String item : stack) {
            tempStack.push(item);
        }

        String[] result = new String[tempStack.size()];
        int index = 0;
        while (!tempStack.isEmpty()) {
            result[index++] = tempStack.pop();
        }

        return result;
    }

    // minOperations complexity = O(N)
    public int minOperations(String[] targetStack, String[] currentStack) {
        Stack<String> target = arrayToStack(targetStack);
        Stack<String> current = arrayToStack(currentStack);

        int operations = 0;
        while (!target.isEmpty()) {
            if (current.isEmpty() || !target.peek().equals(current.peek())) {
                current.push(target.pop());
                operations++;
            } else {
                target.pop();
                current.pop();
            }
        }

        return operations;
    }

    // Private method to convert String array to Stack
    private Stack<String> arrayToStack(String[] array) {
        Stack<String> stack = new Stack<>();
        for (String item : array) {
            stack.push(item);
        }
        return stack;
    }

    public static void main(String[] args) {
        // Sample usage
        String[] targetStack = {"A", "B", "C"};
        String[] currentStack = {"A", "B", "D"};
        
        StackSimulation stackSim = new StackSimulation(targetStack);
        
        // Testing popAll method
        String[] poppedOrder = stackSim.popAll(currentStack);
        System.out.print("Popped Order: ");
        for (String s : poppedOrder) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        // Testing minOperations method
        int minOps = stackSim.minOperations(targetStack, currentStack);
        System.out.println("Minimum Operations: " + minOps);
    }
}
