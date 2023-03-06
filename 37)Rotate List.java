/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null ||k==0) return head;
        
        ListNode cur=head;
        int len=1;
        while(cur.next!=null){
            len++;
            cur=cur.next;
        }

        cur.next=head;
        k=k%len;
        k=len-k;
        while(k!=0){
            cur=cur.next;
            k--;
        } 

        head=cur.next;
        cur.next=null;
        return head;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        if(head ==null || head.next==null|| k==0) return head;

        Node cur=head;
        int len=1;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }

        cur.next=head;
        k=k%len;
        k=len-k;
        while(k!=0){
            cur=cur.next;
            k--;
        }
        head=cur.next;
        cur.next=null;
        return head;
    }
}
