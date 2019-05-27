class P0028_easy {
    fun strStr(haystack: String, needle: String): Int {
        if (haystack.length < needle.length) {
            return -1
        } else if (needle == "") {
            return 0
        } else {
            for (i in 0 .. haystack.length - needle.length) {
                if (haystack.substring(i, i + needle.length) == needle) {
                    return i
                }
            }
        }
        return -1
    }
}
