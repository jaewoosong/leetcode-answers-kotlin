class P0001_easy {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val prev = nums[i]
            for (j in (i+1) .. (nums.size-1)) {
                val curr = nums[j]
                if (prev + curr == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return nums
    }
}
