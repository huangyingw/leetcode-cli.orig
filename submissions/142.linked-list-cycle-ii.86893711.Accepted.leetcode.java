public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        ListNode fast = head;
        ListNode slow = head;

        do 
        {
            if (fast == null || fast.next == null)
            {
                return null;    
            }
            
            fast = fast.next.next;
            slow = slow.next;
        }
        while (fast != slow);

        if (fast == slow) 
        {
            while (fast != null && fast != head) 
            {
                fast = fast.next;
                head = head.next;
            }

            return fast;
        }

        return null;
    }
}
