class Solution:
    def searchRange(self, nums, target):
        if not nums or len(nums) == 0:
            return [-1, -1]

        left, right = 0, len(nums) - 1
        while left + 1 < right:
            mid = (left + right) // 2
            if nums[mid] < target:
                left = mid
            else:
                right = mid
        if nums[left] == target:
            return_left = left
        else:
            return_left = right

        left, right = 0, len(nums) - 1
        while left + 1 < right:
            mid = (left + right) // 2
            if nums[mid] <= target:
                left = mid
            else:
                right = mid
        if nums[left] == target:
            return_right = left
        else:
            return_right = right

        return [return_left, return_right] if return_right >= return_left else [-1, -1]

