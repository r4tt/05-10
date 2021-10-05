class Point {
    var pointX: Double = 0.0
    var pointY: Double = 0.0

    constructor() {}
    constructor(pointX: Double, pointY: Double) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    constructor(p :Point) {
        this.pointX = p.pointX;
        this.pointY = p.pointY;
    }

    fun distance(a: Point): Double {
        val ss = ((pointX - a.pointX) * (pointX - a.pointX)
                + (pointY - a.pointY) * (pointY - a.pointY))
        return Math.sqrt(ss)
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o !is Point) {
            return false
        }
        val point = o
        return if (java.lang.Double.compare(point.pointX, pointX) != 0) {
            false
        } else java.lang.Double.compare(point.pointY, pointY) == 0
    }

    override fun toString(): String {
        return ("("
                + pointX
                + "," + pointY
                + ')')
    }
}