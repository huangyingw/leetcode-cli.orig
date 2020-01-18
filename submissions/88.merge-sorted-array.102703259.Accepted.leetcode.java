public class Solution
{
    public void merge(int A[], int m, int B[], int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        for (; k >= 0; k--)
        {
            if (j < 0 || (i >= 0 && A[i] >= B[j]))
            {
                A[k] = A[i--];
            }
            else
            {
                A[k] = B[j--];
            }
        }
    }
}
