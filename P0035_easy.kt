class P0035_easy {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in 0 until nums.size) {
            if (nums[i] >= target) {
                return i
            }
        }
        return nums.size
    }
}
