class Solution(object):
    def postorderTraversal(self, root):
        if root is None:
            return []
        res = []
        stack = [root]
        while len(stack) > 0:
            curr = stack.pop()
            if not isinstance(curr, TreeNode):
                res.append(curr)
                continue
            stack.append(curr.val)
            if curr.right:
                stack.append(curr.right)
            if curr.left:
                stack.append(curr.left)
        return res

