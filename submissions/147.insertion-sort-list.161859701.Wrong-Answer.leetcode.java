public class Solution
{
    public ListNode insertionSortList(ListNode head)
    {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode nextNode = null;

        while (cur != null)
        {
            while (pre.next != null && pre.next.val < cur.val)
            {
                pre = pre.next;
            }

            nextNode = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = nextNode;
        }

        return dummy.next;
    }
}

