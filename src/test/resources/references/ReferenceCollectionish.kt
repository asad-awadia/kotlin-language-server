private class ReferenceCollectionish {
    operator fun iterator(): Iterator<Int> = TODO()
    operator fun contains(other: Int): Boolean = TODO()
    operator fun rangeTo(i: Int): Sequence<ReferenceCollectionish> = TODO()
}

private fun main() {
    val example = ReferenceCollectionish()
    for (i in example) { }
    1 in example
    for (i in example..10) { }
}