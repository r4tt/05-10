class Square : Rectangle {

    constructor() {}
    constructor(side: Double) : super(side, side) {}
    constructor(side: Double, color: String?, filled: Boolean) : super(side, side, color, filled) {}
    constructor(p: Point, side: Double, color: String?, filled: Boolean) : super(p, side, side, color, filled) {}


    var side: Double
        get() = this.length
        set(side) {
            this.width = side
            this.length = side
        }

    override fun equals(o: Any?): Boolean {
        return super.equals(o)
    }

    override fun toString(): String {
        return ("Square["
                + "topLeft="
                + topLeft.toString()
                + ",side=" + this.length
                + ",color=" + color
                + ",filled=" + filled
                + ']')
    }
}