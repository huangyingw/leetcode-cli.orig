public class Solution
{
    public int trap(int[] heights) 
    {
        if (heights == null || heights.length == 0)
        {
            return 0;
        }
        
        int[] leftMax = new int[heights.length];
        leftMax[0] = heights[0];
        
        for (int i = 1; i < heights.length; i++) 
        {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i - 1]);
        }
        
        int rightMax = heights[heights.length - 1], result = 0;
        
        for (int i = heights.length - 2; i >= 0; i--) 
        {
            rightMax = Math.max(rightMax, heights[i + 1]);
            result += Math.min(rightMax, leftMax[i]) > heights[i]
                    ? Math.min(rightMax, leftMax[i]) - heights[i]
                    : 0;
        }
        
        return result;
    }
}
