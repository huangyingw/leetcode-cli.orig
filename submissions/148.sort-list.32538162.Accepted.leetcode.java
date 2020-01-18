  public class Solution
  {
    public ListNode sortList(ListNode head)
    {
      if (head == null || head.next == null)
      {
        return head;
      }

      ListNode list1 = null, list2 = null;
      int level = 0, len = 0, listLen = 1 << 0;
      ListNode run = head;

      while (run != null)
      {
        run = run.next;
        len++ ;
      }

      while (listLen < len)
      {
        int count = 0;
        int coup = 0;
        run = head;
        ListNode pre = new ListNode(-1);
        pre.next = head;

        while (2 * coup * listLen < len - listLen)
        {
          list1 = run;
          count = 0;

          while (run != null && count < listLen)
          {
            run = run.next;
            count++ ;
          }

          list2 = run;
          count = 0;

          while (run != null && count < listLen)
          {
            run = run.next;
            count++ ;
          }

          ListNode pretmp = merge(list1, list2, pre, run, listLen);

          if (coup == 0)
          {
            head = pre.next;
          }

          pre = pretmp;
          coup++ ;
        }

        level++ ;
        listLen = 1 << level;
      }

      return head;
    }

    public ListNode merge(ListNode l1, ListNode l2, ListNode pre,
                          ListNode tail, int len)
    {
      int c1 = 0, c2 = 0;
      ListNode head = new ListNode(-1);
      ListNode run = head;

      while (c1 < len && c2 < len && l1 != null && l2 != null)
      {
        if (l1.val <= l2.val)
        {
          run.next = l1;
          l1 = l1.next;
          c1++ ;
        }
        else
        {
          run.next = l2;
          l2 = l2.next;
          c2++ ;
        }

        run = run.next;
        run.next = null;
      }

      while (c1 < len && l1 != null)
      {
        run.next = l1;
        l1 = l1.next;
        c1++ ;
        run = run.next;
      }

      while (c2 < len && l2 != null)
      {
        run.next = l2;
        l2 = l2.next;
        c2++ ;
        run = run.next;
      }

      pre.next = head.next;
      run.next = tail;
      return run;
    }
  }

