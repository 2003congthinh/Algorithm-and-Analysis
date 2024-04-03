package Sample1_myattempt;

import org.w3c.dom.Node;

public class StudentBST {
    private StudentNode root;

    public StudentBST() {
        this.root = null;
    }

    public void insert(Student student) {
        root = insertRecursive(root, student);
    }

    private StudentNode insertRecursive(StudentNode root, Student student) {
        if (root == null) {
            return new StudentNode(student);
        }
        if (student.id < root.data.id) {
            root.left = insertRecursive(root.left, student);
            root.left.parent = root;
        } else if (student.id > root.data.id) {
            root.right = insertRecursive(root.right, student);
            root.right.parent = root;
        }
        return root;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(1, "John", 4.0);
        Student stu2 = new Student(2, "Joe", 3.0);
        Student stu3 = new Student(3, "Jill", 2.0);
        Student stu4 = new Student(4, "Jack", 1.0);
        Student stu5 = new Student(5, "Jake", 0.0);

        StudentBST bst = new StudentBST();
        bst.insert(stu1);
        bst.insert(stu2);
        bst.insert(stu3);
        bst.insert(stu4);
        bst.insert(stu5);

    }

}

class StudentNode{
    Student data;
    StudentNode parent, left, right;
  
    public StudentNode(Student student) {
        data = student;
        parent = left = right = null;
    }
}

class Student {
    int id;
    String name;
    double GPA;

    public Student(int id, String name, double gPA) {
        this.id = id;
        this.name = name;
        GPA = gPA;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", GPA=" + GPA + "]";
    }
}

