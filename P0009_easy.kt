class P0009_easy {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        } else {
            var forward = x
            var reverse = 0
            while (forward != 0) {
                reverse = (reverse * 10) + (forward % 10)
                forward /= 10
            }
            return x == reverse
        }
    }
}
