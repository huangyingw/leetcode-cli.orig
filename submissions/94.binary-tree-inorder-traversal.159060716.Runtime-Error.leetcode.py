class Solution(object):
    def inorderTraversal(self, root):
        result = []
        stack = [root]

        while stack or root:
            root = stack.pop()
            if root.left:
                root = root.left
                stack.append(root)
            else:
                result.append(root.val)
                root = root.right
        return result

