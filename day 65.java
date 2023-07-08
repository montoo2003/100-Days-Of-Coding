//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/988951679/
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
    public ListNode deleteDuplicates(ListNode head) {
   if(head==null||head.next==null){ return head;}
   HashMap<Integer,Integer> map=new HashMap<>();
   ListNode node=new ListNode(-1);
   ListNode prev=node;
   ListNode curr=head;
   while(curr!=null){
       if(map.containsKey(curr.val)){
           map.put(curr.val,map.get(curr.val)+1);
       }else{
           map.put(curr.val,0);
       }
       curr=curr.next;
   }
curr=head;
while(curr!=null){
    if(map.get(curr.val)==0){
        prev.next=curr;
        prev=curr;
    }
curr=curr.next;}
if(prev.next!=null){
    prev.next=null;

    }
    return node.next;
    }
}
