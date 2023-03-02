//LEETCODE

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
    // public ListNode removeNthFromEnd(ListNode head, int n) {

    //     int size=len(head);

    //     ListNode ans=new ListNode();
    //     ListNode prev=ans;
    //     ListNode cur=head;

    //     for(int i=0;i<size-n;i++){
    //         prev.next=cur;
    //         cur=cur.next;
    //         prev=prev.next;
    //     }
    //     prev.next=cur.next;
    //     return ans.next;
        
    // }

    // public int len(ListNode head){
    //     ListNode temp=head;
    //     int count=0;
    //     while(temp!=null){
    //         count++;
    //         temp=temp.next;

    //     }
    //     return count;
    // }

    //One pass solution
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode ans=new ListNode();
        ans.next=head;
        ListNode fast=ans;
        ListNode slow=ans;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return ans.next;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		LinkedListNode ans=new LinkedListNode(0);
        ans.next=head;
        LinkedListNode<Integer> fast=ans;
        LinkedListNode<Integer> slow=ans;

        for(int i=1;i<=K;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return ans.next;
	}
}
