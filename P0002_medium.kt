class P0002_medium {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var c = 0
        var l1Prev = ListNode(c)
        var l1Curr = l1
        var l2Curr = l2

        while (!(l1Curr == null && l2Curr == null)) {
            if (l1Curr == null) {
                l1Curr = l2Curr
                l1Prev.next = l1Curr
                l2Curr = null
            }

            l1Curr!!.`val` += ((l2Curr?.`val` ?: 0) + c)

            if (l1Curr!!.`val` >= 10) {
                l1Curr!!.`val` -= 10
                c = 1
            } else {
                c = 0
            }

            l1Prev = l1Curr
            l1Curr = l1Curr.next
            l2Curr = l2Curr?.next
        }

        if (c != 0) {
            l1Prev.next = ListNode(c)
        }

        return l1
    }
}
