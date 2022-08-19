/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start

 // Definition for singly-linked list.
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 

class Solution {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //先声明一个链表
    ListNode head =  new ListNode(0,null);
    ListNode point = head;
    ListNode p1 = list1;
    ListNode p2 =list2;
    while(p1!=null&&p2!=null){
        if(p1.val>p2.val){
            point.next = new ListNode(p2.val,null);
            p2 = p2.next;
            
        }else {
            point.next = new ListNode(p1.val,null);
            p1 = p1.next;
           

        }
        point = point.next;}
        if(p1==null){
        point.next = p2;
        }
        if(p2==null)
        {point.next = p1;}
    
    return head.next;
    


    }
}
// @lc code=end

