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
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = Findmid(head);
        ListNode second =reverseList(mid);
        
        while(head != null && second != null){
            
            if(head.val != second.val){
                return false;
            }
            head = head.next;
            second = second.next;
        }
        
        return true;
        
    }
    
      
    public ListNode Findmid(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    
 
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
}