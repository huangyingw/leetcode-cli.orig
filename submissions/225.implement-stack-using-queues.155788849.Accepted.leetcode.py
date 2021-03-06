class MyStack(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.queue1 = []
        self.queue2 = []

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        if self.empty():
            self.queue1.append(x)
        elif self.queue1:
            self.queue2.append(x)
            while self.queue1:
                self.queue2.append(self.queue1.pop(0))
        else:
            self.queue1.append(x)
            while self.queue2:
                self.queue1.append(self.queue2.pop(0))

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        if self.queue1:
            return self.queue1.pop(0)
        else:
            return self.queue2.pop(0)

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        if self.queue1:
            return self.queue1[0]
        else:
            return self.queue2[0]

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return not self.queue1 and not self.queue2

