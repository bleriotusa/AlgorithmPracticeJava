package MinStack;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * https://leetcode.com/problems/min-stack/
 */
public class MinStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2);
//        System.out.println(stack.getMin());
        stack.push(0);
//        System.out.println(stack.getMin());
        stack.push(3);
//        System.out.println(stack.getMin());
        stack.push(0);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

    }
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /**
     * Minstack works by keeping a separate stack of all the minimum values as they are introduced.
     * Add: if it is a new or current (to support duplicate mins) min, add to min stack
     * Pop: if value popped is equal to min, pop it from min stack as well
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.size() == 0 || x <= getMin())
            minStack.push(x);
    }

    public void pop() {
        if(top() == minStack.peek()) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
