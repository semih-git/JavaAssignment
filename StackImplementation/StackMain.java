package Leetcode;

public class StackMain {
    public static void main(String[] args) {
        GenericSolution<String> stack1 = new GenericSolution<>();
        stack1.push("elma");
        stack1.push("armut");
        stack1.push("muz");

        System.out.println(stack1.toString());
        System.out.println("stack1 size: "+stack1.getSize());
        System.out.println("stack1 peek: "+stack1.peek());
        stack1.pop();

        System.out.println(stack1.toString());
        System.out.println("is stack1 empty?: "+stack1.isEmpty());

        GenericSolution<Integer> stack2 = new GenericSolution<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println(stack2.toString());
    }
}
