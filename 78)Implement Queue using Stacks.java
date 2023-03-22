//LEETCODE
class MyQueue {
    Stack<Integer>s1;
    Stack<Integer>s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }
    
    public boolean empty() {
        if(s2.isEmpty() && s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//CODE STUDIO

import java.util.*;
public class Queue {
    // Define the data members(if any) here.
    Stack<Integer>s1;
    Stack<Integer>s2;

    Queue() {
        // Initialize your data structure here.
       s1=new Stack<>();
        s2=new Stack<>();

    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        s1.push(val);
    }

    int deQueue() {
        if(s2.isEmpty() && s1.isEmpty()) return -1;
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }

    int peek() {
        if(s2.isEmpty() && s1.isEmpty()) return -1;
        // Implement the peek() function here.
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        if(s2.isEmpty() && s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
