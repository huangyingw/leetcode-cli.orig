public class Solution
{
    public int maxProduct(int[] A)
    {
        int maxHere, minHere;
        int maxPre = A[0];
        int minPre = A[0];
        int maxNow = A[0];

        for (int i = 1; i < A.length; i++)
        {
            maxHere = Math.max(Math.max(maxPre * A[i], minPre * A[i]), A[i]);
            minHere = Math.min(Math.min(maxPre * A[i], minPre * A[i]), A[i]);
            maxPre = maxHere;
            minPre = minHere;
            maxNow = Math.max(maxNow, maxHere);
        }

        return maxNow;
    }
}

