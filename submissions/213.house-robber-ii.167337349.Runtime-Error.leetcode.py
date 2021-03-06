class Solution(object):
    def rob(self, nums):
        if len(nums) == 0:
            return 0

        if len(nums) == 1:
            return nums[0]

        if len(nums) == 2:
            return max(nums[0], nums[1])

        def rob1(left, right):
            dp = [nums[left]] * (right - left + 1)
            dp[1] = max(nums[left], nums[left + 1])

            for idx in range(left + 2, right + 1):
                dp[idx] = max(dp[idx - 2] + nums[idx], dp[idx - 1])

            return dp[-1]

        return max(rob1(0, len(nums) - 2), rob1(1, len(nums) - 1))

