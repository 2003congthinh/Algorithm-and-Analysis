public class Week2 {
    public static void unique() {
        int[] list = new int[] { 6, 8, 10, 11, 6, 10 };
        boolean isUnique;
        for (int i = 0; i < list.length; i++) {
            isUnique = true; // Assume current element is unique initially
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    // If there is another occurrence of the same element
                    // then it's not unique
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                // If the element is unique, print its index
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello world!");
        unique();
    }
}
