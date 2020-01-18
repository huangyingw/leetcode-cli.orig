class Solution(object):
    def preorderTraversal(self, root):
        result = []
        stack = [root]

        while stack and root:
            print('root 1 --> %s' % root)
            if root:
                print('root 2 --> %s' % root)
                result.append(root.val)
                stack.append(root)
                root = root.left
            else:
                root = stack.pop()
                print('root 3 --> %s' % root)
                root = root.right
        return result

