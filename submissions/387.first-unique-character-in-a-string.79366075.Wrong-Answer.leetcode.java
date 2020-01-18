public class Solution
{
    public int firstUniqChar(String s)
    {
        Set<Character> m = new HashSet<Character>();
        
        for (char c : s.toCharArray())
        {
            m.add(c);
        }
        
        for (int i = 0; i < s.length(); ++i)
        {
            if (!m.contains(s.charAt(i)))
                return i;
        }

        return -1;
    }
}
