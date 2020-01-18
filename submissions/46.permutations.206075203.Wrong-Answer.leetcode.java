public class Solution
{
    public List<List<Integer>> permute(int[] num)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(num, new ArrayList<Integer>(), result);
        return result;
    }

    public void dfs(int[] num, List<Integer> current, List<List<Integer>> result)
    {
        for (int i = 0; i < num.length; i++)
        {
            if (current.contains(num[i]))
            {
                continue;
            }

            current.add(num[i]);
            dfs(num, current, result);
            current.remove(current.size() - 1);
        }
    }
}

