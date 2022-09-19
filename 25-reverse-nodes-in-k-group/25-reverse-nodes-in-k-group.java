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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        return recur(head,k,size/k);
    }
    
     ListNode recur(ListNode head,int k,int t){
        if(t==0) return head;
        ListNode prev=null;
        ListNode temp=head;
        int p=k;
        while(k--!=0){
            ListNode nex=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }
        head.next=recur(temp,p,t-1);
        return prev;
    }
}