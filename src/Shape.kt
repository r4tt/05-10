abstract class Shape {

    var color: String? = null
    var filled = false

    constructor() {}
    constructor(color: String?, filled: Boolean) {
        this.color = color
        this.filled = filled
    }

    abstract val area: Double
    abstract val perimeter: Double

    override fun toString(): String {
        return ("Shape["
                + "color=" + color
                + ",filled=" + filled
                + ']')
    }

}