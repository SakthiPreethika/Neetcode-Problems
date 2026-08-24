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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a=new ArrayList<>();
        for(ListNode c:lists){
            ListNode temp=c;
            while(temp!=null){
                a.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(a);
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        for(int x:a){
            prev.next=new ListNode(x);
            prev=prev.next;
        }
        return dummy.next;

    }
}
