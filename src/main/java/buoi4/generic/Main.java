package buoi4.generic;

public class Main {
    public static void main(String[] args) {
        // wrapper class Java
        Stack<Integer> integerStack = new Stack<>(100);
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack);

        Stack<Double> doubleStack = new Stack<>(10);
        doubleStack.push(10.5);
        doubleStack.push(20.5);
        System.out.println(doubleStack);


        Stack<Student> studentStack = new Stack<>(100);
        studentStack.push(new Student(1, "Student 1"));
        studentStack.push(new Student(2, "Student 2"));
        studentStack.push(new Student(3, "Student 3"));
        System.out.println(studentStack);

        System.out.println("-----Stack stack-----");
        Stack<Stack> stackStack = new Stack<>(10);
        stackStack.push(doubleStack);
        stackStack.push(studentStack);
        System.out.println(stackStack);
    }
}
