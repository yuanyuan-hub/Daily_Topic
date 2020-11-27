import java.util.Stack;
//用栈实现队列操作
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()) {
            while (stack1.size() > 0) {
                int node = stack1.pop();
                stack2.push(node);
            }
        }
        int pop_element = stack2.pop();
        return pop_element;
    }
}