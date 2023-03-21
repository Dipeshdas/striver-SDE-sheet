import java.util.* ;
import java.io.*; 

public class Stack {
    int a[];
    int top;
    Stack(int n){
        a=new int[n];
        top=-1;
    }
    void push(int num) {
        int n=a.length;
        if(top==n) return;
        top++;
        a[top]=num;
    }
    int pop() {
        if(top==-1) return -1;
        int ans=a[top];
        top--;
        return ans;
    }
    int top() {
        if(top==-1){
            return -1;
        }
        return a[top];
    }
    int isEmpty() {
        if(top==-1) return 1;
        return 0;
    }
    int isFull() {
        int n=a.length;
        if(top==n) return 1;
        return 0;
        // Write your code here.
    }
}
