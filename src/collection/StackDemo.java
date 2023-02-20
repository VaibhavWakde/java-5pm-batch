package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10); // element will add to top of the stack
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        System.out.println(stack.pop()); // remove top element

        System.out.println(stack);

        System.out.println(stack.peek()); // returns top element

        System.out.println(stack.search(20)); // returns the distance from the top of the stack

    }
}
