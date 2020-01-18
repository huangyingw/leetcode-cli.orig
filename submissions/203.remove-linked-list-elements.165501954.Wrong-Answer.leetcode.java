public class Solution
{
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;

        while (p != null)
        {
            if (p.next != null && p.next.val == val)
            {
                p.next = p.next.next;
            }

            p = p.next;
            System.out.printf("p --> %s\n", p != null ? p.val : "null");
        }

        return dummy.next;
    }
}

