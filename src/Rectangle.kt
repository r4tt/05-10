import java.util.*

open class Rectangle : Shape {
    open var width = 0.0
    open var length = 0.0
    var topLeft: Point? = null

    constructor() {}
    constructor(color: String?, filled: Boolean) : super(color, filled) {}
    constructor(width: Double, length: Double) {
        this.width = width
        this.length = length
    }
    constructor(width: Double, length: Double, color: String?, filled: Boolean) : super(color, filled) {
        this.length = length
        this.width = width
    }
    constructor(p: Point, width: Double, length: Double, color: String?, filled: Boolean) : super(color, filled) {
        this.length = length
        this.width = width
        topLeft = Point(p.pointX, p.pointY)
    }


    override val area: Double
        get() = width * length

    override val perimeter: Double
        get() = 2.0 * (width + length)

    override fun toString(): String {
        return ("Rectangle["
                + "topLeft="
                + topLeft.toString()
                + ",width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled
                + ']')
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val rectangle = o as Rectangle
        return java.lang.Double.compare(rectangle.width, width) == 0 && java.lang.Double.compare(
            rectangle.length,
            length
        ) == 0 && topLeft == rectangle.topLeft
    }

}