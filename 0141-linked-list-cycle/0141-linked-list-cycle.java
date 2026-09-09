/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }
        if(head.next == head){
            return true;
        }

        if(head.next.next == null){
            return false;
        }

        // if(head.next.next == head || head.next.next == head.next){
        //     return true;
        // }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while(slow != null && fast != null){  
            // if(slow == null || fast == null)
            //     return false;

            if(slow == fast )
                return true; 

            if(slow.next == null || fast.next == null)
                return false;

            // if(){
                // return false;
            // }


            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

    }
}