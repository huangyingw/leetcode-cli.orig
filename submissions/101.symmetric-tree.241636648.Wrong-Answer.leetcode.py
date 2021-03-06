class Solution(object):
    def isSymmetric(self, root):
        if not root:
            return True
        lqueue = [root.left]
        rqueue = [root.right]
        while lqueue and rqueue:
            lroot = lqueue.pop()
            rroot = rqueue.pop()
            if not lroot and not rroot:
                print('return True --> 1 ')
                return True
            if not lroot or not rroot:
                return False
            if lroot.val != rroot.val:
                return False
            lqueue.append(lroot.left)
            lqueue.append(lroot.right)
            rqueue.append(rroot.right)
            rqueue.append(rroot.left)
        print('return True --> 2 ')
        return lroot == rroot

