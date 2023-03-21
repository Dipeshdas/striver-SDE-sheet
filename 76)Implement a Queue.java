import java.util.* ;
import java.io.*; 
public class Queue {
    int rear,front,size;
    int []a;
    Queue() {
        rear = 0;
        front = 0;
        size = 0;
        a = new int[100010];

    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        if(size==0) return true;
        return false;
    }

    void enqueue(int data) {
        int n=a.length;
        if(size==n) return;
        a[rear%n]=data;
        rear++;
        size++;
    }

    int dequeue() {
        int n=a.length;
        if(size==0) return -1;
        int ans=a[front%n];
        front++;
        size--;
        return ans;
    }

    int front() {
        if(size==0) return -1;
        return a[front];
    }

}
