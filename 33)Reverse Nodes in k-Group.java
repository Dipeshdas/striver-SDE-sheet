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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null || k==1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode cur=dummy;
        ListNode temp=dummy;
        ListNode prev=dummy;

        int count=0;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        //System.out.println(count);

        while(count>=k){
            cur=prev.next;
            temp=cur.next;

           for(int i=1;i<k;i++){
                cur.next=temp.next;
                temp.next=prev.next;
                prev.next=temp;
                temp=cur.next;
            }
            prev=cur;
            count-=k;
        }
        return dummy.next;
        
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		//if(head==null || k==1) return head;
		Node dummy=new Node(0);
		dummy.next=head;

		Node cur=dummy;
		Node temp=dummy;
		Node prev=dummy;

		int len=0;
		while(cur.next!=null){
			len++;
			cur=cur.next;
		}
		for(int j=0;j<n;j++){
			int k=b[j];
			if(k==0 ){
				continue;
			}
			if(len<k){
				k=len;
			}
			if(k>0){
				cur=prev.next;
				temp=cur.next;

				for(int i=1;i<k;i++){
					cur.next=temp.next;
					temp.next=prev.next;
					prev.next=temp;
					temp=cur.next;
				}
				prev=cur;
				len-=k;
			}
		}
		return dummy.next;
	}
}
