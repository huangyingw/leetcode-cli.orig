class Solution(object):
    def findMissingRanges(self, nums, lower, upper):
        ranges = []
        prev = lower - 1
        for i in range(len(nums) + 1):
            if i == len(nums):
                curr = upper + 1
            else:
                curr = nums[i]
            prev = curr
        return ranges

