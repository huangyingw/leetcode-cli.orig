/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution
{
    public TreeNode buildTree(int[] inorder, int[] postorder)
    {
        HashMap inMap = new HashMap();

        for (int i = 0; i < inorder.length; i++)
        {
            inMap.put(inorder[i], i);
        }

        TreeNode root = buildTree(inMap, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        return root;
    }

    public TreeNode buildTree(HashMap inMap, int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd)
    {
        if (inStart > inEnd | postStart > postEnd)
        {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postEnd]);
        int mid = (int)inMap.get(postorder[postEnd]);
        root.left = buildTree(inMap, inorder, inStart, mid - 1, postorder, postStart, postStart + mid - 1 - inStart);
        root.right = buildTree(inMap, inorder, mid + 1, inEnd, postorder, postEnd - inEnd + mid, postEnd - 1);
        return root;
    }
}

