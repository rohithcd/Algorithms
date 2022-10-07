    def maxSubArray(self, nums: List[int]) -> int:
        
        cur_sum = 0
        best_sum = 0
        
        
        if len(nums) == 1:
            return nums[0]
        for n in nums:
            cur_sum+=n
            if cur_sum >= best_sum:
                best_sum = cur_sum
            if cur_sum < 0 :
                cur_sum =0
        return best_sum
