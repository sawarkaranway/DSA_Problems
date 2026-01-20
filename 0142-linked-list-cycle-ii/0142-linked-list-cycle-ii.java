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


 
 /*slow fast pointer approach exists*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> a = new HashMap<>();
        ListNode temp = head;
        int index = 0;
        while(temp!=null){
            
            if(a.containsKey(temp)){
                return temp;
            }
            else{
                a.put(temp,index);
                index++;
            }
            temp = temp.next;
        }
        return temp;
    }
}