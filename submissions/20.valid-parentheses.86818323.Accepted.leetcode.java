public class Solution
{
    public boolean isValid(String s)
    {
        char[] charArray = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();

        for (char c : charArray)
        {
            if (map.containsKey(c))
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty() || c != map.get(stack.pop()))
                {
                    return false;                        
                }
            }
        }
        
        return stack.isEmpty();
    }
}
