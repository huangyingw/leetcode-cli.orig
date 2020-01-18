public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null)
        {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;
        ListNode tailA = null;
        ListNode tailB = null;

        while (true)
        {
            if (pA == null)
            {
                pA = headB;
                System.out.printf("pA --> %s\n", pA.val);
            }
            else if (pB == null)
            {
                pB = headA;
                System.out.printf("pB --> %s\n", pB.val);
            }
            else if (pA.next == null)
            {
                tailA = pA;
            }
            else if (pB.next == null)
            {
                tailB = pB;
            }
            else if (tailA != null && tailB != null && tailA != tailB)
            {
                return null;
            }
            else if (pA == pB)
            {
                return pA;
            }
            else
            {
                pA = pA.next;
                System.out.printf("pA --> %s\n", pA.val);
                pB = pB.next;
                System.out.printf("pB --> %s\n", pB.val);
            }
        }
    }

}

