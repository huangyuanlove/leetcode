//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 
// 👍 1431 👎 0


package leetcode.editor.cn;


public class RemoveNthNodeFromEndOfList_19 {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList_19().new Solution();

        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        c.next = d;
        b.next = c;
//        a.next = b;
//        head.next = a;


        ListNode result = solution.removeNthFromEnd(head, 1);
        while (result != null) {
            System.out.print(result.val + "\t");
            result = result.next;
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode pre = dummy;
            ListNode slow = head;
            ListNode fast = head;
            for(int i=0;i<n;i++){
                fast = fast.next;
            }
            while(fast!=null){
                pre = pre.next;
                slow = slow.next;
                fast = fast.next;
            }
            pre.next = slow.next;
            return dummy.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}