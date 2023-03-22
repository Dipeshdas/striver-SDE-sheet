//LEETCODE
class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack() {
        q1=new ArrayDeque<>();
        q2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
            
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.
    Queue<Integer>q;


    public Stack() {
        // Implement the Constructor.
        q=new ArrayDeque<>();

    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return (q.size()==0);
    }

    public void push(int element) {
        // Implement the push(element) function.
        q.add(element);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        // Implement the pop() function.
        if(!q.isEmpty()){
            return q.poll();
        }
        return -1;
    }

    public int top() {
        // Implement the top() function.
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }
}









