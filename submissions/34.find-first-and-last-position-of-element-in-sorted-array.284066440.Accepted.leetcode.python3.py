class Solution:
    def searchRange(self, nums, target):
        if not nums:
            return [-1, -1]

        def findGreater(t):
            l, r = 0, len(nums) - 1
            while l <= r:
                m = l + (r - l) // 2
                if nums[m] < t:
                    l = m + 1
                else:
                    r = m - 1
            return l
        left = findGreater(target)
        right = findGreater(target + 1) - 1
        return [left, right] if right >= left else [-1, -1]

