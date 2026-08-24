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
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;

        }
        
        for(int i=0;i<size-n;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        prev.next=curr.next;
        curr=null;
        return dummy.next;

    }
}
