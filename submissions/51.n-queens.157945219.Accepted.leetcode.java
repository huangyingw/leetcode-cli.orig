class Solution
{
    List<List<String>> solveNQueens(int n)
    {
        List<List<String>> result = new ArrayList<>();

        if (n <= 0)
        {
            return result;
        }

        int[] rows = new int[n];
        dfs(result, rows, n, 0);
        return result;
    }

    private void dfs(List<List<String>> result, int[] rows, int n, int rowIndex)
    {
        if (rowIndex == n)
        {
            result.add(translateString(rows));
            return;
        }

        for (int i = 0; i < n; i++)
        {
            if (isValid(rows, rowIndex, i))
            {
                rows[rowIndex] = i;
                dfs(result, rows, n, rowIndex + 1);
                rows[rowIndex] = 0;
            }
        }
    }

    private ArrayList<String> translateString(int[] rows)
    {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < rows.length; i++)
        {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < rows.length; j++)
            {
                if (j == rows[i])
                {
                    sb.append('Q');
                }
                else
                {
                    sb.append('.');
                }
            }

            result.add(sb.toString());
        }

        return result;
    }

    private boolean isValid(int[] rows, int rowNum, int columnNum)
    {
        for (int i = 0; i < rowNum; i++)
        {
            if (rows[i] == columnNum)
            {
                return false;
            }

            if (Math.abs(rows[i] - columnNum) == Math.abs(i - rowNum))
            {
                return false;
            }
        }

        return true;
    }

}

