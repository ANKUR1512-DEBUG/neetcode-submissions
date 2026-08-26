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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0;
        ListNode temp=head;
        
        while(temp !=null){
            k++;
            temp=temp.next;
        }
        
        if(head.next==null){
            return null;
        }
        int x=k-n;
        if(k==n){
            head=head.next;
            return head;
        }
        
        ListNode dummy=head;
        
        for(int i=1;i<x;i++){
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return head;


        
    }
}
