import java.util.*

class Circle : Shape {
    var radius = 0.0
    protected var center: Point? = null

    constructor() {}
    constructor(radius: Double) {
        this.radius = radius
    }

    constructor(radius: Double, color: String?, filled: Boolean) : super(color, filled) {
        this.radius = radius
    }

    constructor(x: Double, y: Double, radius: Double, color: String?, filled: Boolean) : super(color, filled) {
        this.radius = radius
        center = Point(x, y)
    }

    constructor(x: Point, radius: Double, color: String?, filled: Boolean) : super(color, filled) {
        this.radius = radius
        center = Point(x.pointX, x.pointY)
    }


    override val area: Double
        get() = Math.PI * radius * radius
    override val perimeter: Double
        get() = Math.PI * radius * 2

    override fun toString(): String {
        return ("Circle["
                + "center="
                + center.toString()
                + ",radius=" + radius
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
        val circle = o as Circle
        return (java.lang.Double.compare(circle.radius, radius) == 0
                && center == circle.center)
    }

}