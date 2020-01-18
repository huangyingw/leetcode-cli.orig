public class Solution extends VersionControl
{
    public int firstBadVersion(int n)
    {
        // write your code here
        if (n == 1)
        {
            return 1;
        }

        int left = 1;
        int right = n - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid))
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return left;
    }
}

