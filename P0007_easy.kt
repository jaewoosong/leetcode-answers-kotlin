class P0007_easy {
    fun reverse(x: Int): Int {
        var xAbs = if (x >= 0) x else -x
        var y: Long = 0
        while (xAbs >= 10) {
            y = (y * 10) + (xAbs % 10)
            xAbs /= 10
        }
        if (xAbs > 0) {
            y = (y * 10) + xAbs
        }
        return if (y > Int.MAX_VALUE || y < Int.MIN_VALUE) 0
               else if (x >= 0) y.toInt() else (-y).toInt()
    }
}
