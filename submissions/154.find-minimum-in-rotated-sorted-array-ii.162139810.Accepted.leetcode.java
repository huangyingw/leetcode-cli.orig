public class Solution
{
    public int findMin(int[] num)
    {
        int start = 0;
        int end = num.length - 1;

        while (start + 1 < end)
        {
            int mid = (start + end) / 2;

            if (num[start] < num[end])
            {
                return num[start];
            }

            if (num[mid] > num[start])
            {
                start = mid;
            }
            else if (num[mid] < num[start])
            {
                end = mid;
            }
            else
            {
                start++;
            }
        }

        return Math.min(num[start], num[end]);
    }
}

