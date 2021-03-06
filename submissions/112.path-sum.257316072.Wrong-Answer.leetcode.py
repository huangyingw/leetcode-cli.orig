class Solution(object):
    def hasPathSum(self, root, sum):
        if not root:
            return sum == 0
        return self.hasPathSum(root.left, sum - root.val) or self.hasPathSum(root.right, sum - root.val)

