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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ArrayList<ListNode> a=new ArrayList<>();
        while(temp!=null){
            a.add(temp);
            temp=temp.next;

        }
        int left=0,right=a.size()-1;
        while(left<right){
            a.get(left).next=a.get(right);
            left++;
            if(left==right){
                break;
            }
            a.get(right).next=a.get(left);
            right--;
        }
        a.get(left).next=null;
        
    }
}
