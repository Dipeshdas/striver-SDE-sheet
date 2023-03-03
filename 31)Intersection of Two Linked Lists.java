//LEETCODE

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // public int length(ListNode head){
    //     ListNode temp=head;
    //     int l=0;
    //     while(temp!=null){
    //         temp=temp.next;
    //         l++;
    //     }
    //     return l;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //You can try this below code also----------

        // int l1=length(headA);
        // int l2=length(headB);
        // int dif=0;
        
        // ListNode ptr1;
        // ListNode ptr2;
        // if(l1>l2){
        //     dif=l1-l2;
        //     ptr2=headB;
        //     ptr1=headA;
        // }
        // else{
        //     dif=l2-l1;
        //     ptr1=headB;
        //     ptr2=headA;
        // }
        
        // while(dif>0){
        //     ptr1=ptr1.next;
        //     dif--;
        // }
        
        // while(ptr1!=null && ptr2!=null){
            
        //     if(ptr1==ptr2){
        //         return ptr1;
        //     }
            
        //     ptr1=ptr1.next;
        //     ptr2=ptr2.next;
        // }
        //return ptr1;

        //One pass Solution-------------------------

        if(headA==null && headB==null){
            return null;
        }

        ListNode ptr1=headA;
        ListNode ptr2=headB;

        while(ptr1!=ptr2){
            ptr1=ptr1==null?headB:ptr1.next;
            ptr2=ptr2==null?headA:ptr2.next;
        }
        return ptr1;
    }
}

//CODESTUDIO

import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		LinkedListNode<Integer>ptr1=firstHead;
		LinkedListNode<Integer>ptr2=secondHead;

		while(ptr1!=ptr2){
			ptr1=ptr1==null?secondHead:ptr1.next;
			ptr2=ptr2==null?firstHead:ptr2.next;
		}
		if(ptr1==null){
			return -1;
		}
		return ptr1.data;
	}
}
