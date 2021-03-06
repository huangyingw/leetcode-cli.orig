class Solution(object):
    def preorderTraversal(self, root):
        result = []
        stack = [root]

        while stack:
            root = stack.pop()
            result.append(root.val)
            if root.right:
                stack.append(root.right)
            if root.left:
                stack.append(root.left)
        return result

