"""
Problem Link: https://leetcode.com/problems/diameter-of-binary-tree/

Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the 
length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
Note: The length of path between two nodes is represented by the number of edges between them.
"""
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.d = 1
        def depth(node):
            if not node: return 0
            l, r = depth(node.left), depth(node.right)
            self.d = max(self.d, l+r+1)
            return max(l,r) + 1
        depth(root)
        return self.d - 1
