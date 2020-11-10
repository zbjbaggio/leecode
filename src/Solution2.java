/**
 *2.两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */


public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, listNode = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Value = l1 == null ? 0 : l1.val;
            int l2Value = l2 == null ? 0 : l2.val;
            int solutionResult = l1Value + l2Value + carry;
            int result = 0;
            if (solutionResult > 10) {
                carry = solutionResult / 10;
                result = solutionResult % 10;
            } else {
                carry = 0;
                result = solutionResult;
            }
            if (listNode == null) {
                head = listNode = new ListNode(result);
            } else {
                listNode.next = new ListNode(result);
                listNode = listNode.next;
            }
        }
        if (carry > 0) {
            listNode.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
