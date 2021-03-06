package section5

abstract class IntSet {
    def incl(x: Int): IntSet

    def contains(x: Int): Boolean

    def isEmpty: Boolean

    def toString: String
}

object Empty extends IntSet {
    def contains(x: Int): Boolean = false

    def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

    def isEmpty: Boolean = true

    override def toString: String = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    def contains(x: Int): Boolean = {
        if (x < elem) left contains x
        else if (x > elem) right contains x
        else true
    }

    def incl(x: Int): IntSet = {
        if (x < elem) new NonEmpty(elem, left incl x, right)
        else if (x > elem) new NonEmpty(elem, left, right incl x)
        else this
    }

    def isEmpty: Boolean = false

    override def toString: String = {
        "(" + left + elem + right + ")"
    }
}
