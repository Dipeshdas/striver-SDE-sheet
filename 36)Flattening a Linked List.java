//CODE STUDIO
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
/****************************************************************

       Following is the class structure of the Node class:

       class Node {
	int data;
	Node next;
	Node child;

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

*****************************************************************/
public class Solution {
	public static Node merge(Node a,Node b){
		Node temp=new Node(0);
		Node cur=temp;

		while(a!=null && b!=null){
			if(a.data<b.data){
				temp.child=a;
				temp=temp.child;
				a=a.child;
			}
			else{
				temp.child=b;
				temp=temp.child;
				b=b.child;
			}
		}

		if(a!=null) temp.child=a;
		else temp.child=b;
		return cur.child;
	}
	public static Node flattenLinkedList(Node start) {
		 if(start==null || start.next==null) return start;
		 start.next=flattenLinkedList(start.next);
		 start=merge(start,start.next);
		 return start;
	}
}

//GFG

//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    
    Node merge(Node a,Node b){
        Node temp=new Node(0);
        Node cur=temp;
        
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.bottom=a;
                temp=temp.bottom;
                a=a.bottom;
            }
            else{
                temp.bottom=b;
                temp=temp.bottom;
                b=b.bottom;
            }
        }
        
        if(a!=null) temp.bottom=a;
        else temp.bottom=b;
        return cur.bottom;
    }
    Node flatten(Node root)
    {
	    if(root==null || root.next==null) return root;
	    
	    root.next=flatten(root.next);
	    root=merge(root,root.next);
	    return root;
    }
}
