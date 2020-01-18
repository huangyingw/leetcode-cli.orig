public class Solution
{
    public int firstUniqChar(String s)
    {
        char[] chs = s.toCharArray();
        Set<Character> m = new HashSet<Character>();

        for (char c : chs)
        {
            m.add(c);
        }

        for (int i = 0; i < chs.length; ++i)
        {
            if (!m.contains(chs[i]))
            {
                return i;
            }
        }

        return 0;
    }
}
