// package Sample1;

// public class CThinhStudentBST {

//     public static void main(String[] args) {
//         // Sample usage
//         StudentBST studentBST = new StudentBST();
        
//         // Adding students
//         studentBST.addStudent(new Student(1, "A", 70.0));
//         studentBST.addStudent(new Student(2, "B", 65.0));
//         studentBST.addStudent(new Student(3, "C", 80.0));
//         studentBST.addStudent(new Student(4, "D", 78.0));
//         studentBST.addStudent(new Student(5, "E", 68.0));
        
//         // Example usage of nextStudent method
//         Student s1 = new Student(1, "A", 70.0);
//         Student s2 = new Student(2, "B", 65.0);
//         Student s3 = new Student(3, "C", 80.0);
//         Student s4 = new Student(4, "D", 78.0);
//         Student s5 = new Student(5, "E", 68.0);
        
//         System.out.println("Next student after s1: " + studentBST.nextStudent(s1));
//         System.out.println("Next student after s2: " + studentBST.nextStudent(s2));
//         System.out.println("Next student after s3: " + studentBST.nextStudent(s3));
//         System.out.println("Next student after s4: " + studentBST.nextStudent(s4));
//         System.out.println("Next student after s5: " + studentBST.nextStudent(s5));
//     }
// }

// class Student {
//     private int id;
//     private String name;
//     private double gpa;

//     public Student(int id, String name, double gpa) {
//         this.id = id;
//         this.name = name;
//         this.gpa = gpa;
//     }

//     public double getGpa() {
//         return gpa;
//     }

//     @Override
//     public String toString() {
//         return "Student{" +
//                 "id=" + id +
//                 ", name='" + name + '\'' +
//                 ", gpa=" + gpa +
//                 '}';
//     }
// }

// class StudentBST {
//     private class TreeNode {
//         private Student student;
//         private TreeNode leftChild;
//         private TreeNode rightChild;

//         public TreeNode(Student student) {
//             this.student = student;
//         }
//     }

//     private TreeNode root;

//     // addStudent complexity = O(log N) in the worst case for balanced BST
//     public void addStudent(Student student) {
//         root = addStudent(root, student);
//     }

//     private TreeNode addStudent(TreeNode node, Student student) {
//         if (node == null) {
//             return new TreeNode(student);
//         }

//         if (student.getGpa() < node.student.getGpa()) {
//             node.leftChild = addStudent(node.leftChild, student);
//         } else {
//             node.rightChild = addStudent(node.rightChild, student);
//         }

//         return node;
//     }

//     // nextStudent complexity = O(log N) in the worst case for balanced BST
//     public Student nextStudent(Student student) {
//         TreeNode next = nextStudent(root, student.getGpa());
//         return (next != null) ? next.student : null;
//     }

//     private TreeNode nextStudent(TreeNode node, double gpa) {
//         if (node == null) {
//             return null;
//         }

//         if (node.student.getGpa() <= gpa) {
//             return nextStudent(node.rightChild, gpa);
//         } else {
//             TreeNode temp = nextStudent(node.leftChild, gpa);
//             return (temp != null) ? temp : node;
//         }
//     }
// }
