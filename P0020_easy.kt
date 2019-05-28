class P0020_easy {
    fun isValid(s: String): Boolean {
        val openClose = java.util.Stack<Int>()
        try {
            s.forEach { c ->
                if (c == '(') {
                    openClose.push(1)
                } else if (c == '{') {
                    openClose.push(2)
                } else if (c == '[') {
                    openClose.push(3)
                } else if (c == ')') {
                    if (openClose.pop() != 1) {
                        return false
                    }
                } else if (c == '}') {
                    if (openClose.pop() != 2) {
                        return false
                    }
                } else if (c == ']') {
                    if (openClose.pop() != 3) {
                        return false
                    }
                } else {
                    return false
                }
            }
        } catch (e: java.util.EmptyStackException) {
            return false
        }
        return openClose.isEmpty()
    }
}
