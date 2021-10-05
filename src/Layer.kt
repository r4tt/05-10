class Layer {

    private var shapes: MutableList<Shape>
    constructor() {
        shapes = ArrayList()
    }
    constructor(shapes: MutableList<Shape>) {
        this.shapes = shapes
    }

    fun getShapes(): List<Shape> {
        return shapes
    }

    fun setShapes(shapes: MutableList<Shape>) {
        this.shapes = shapes
    }

    fun addShape(a: Shape) {
        shapes.add(a)
    }

    fun removeCircles() {
        for (i in shapes.indices.reversed()) {
            if (shapes[i] is Circle) {
                shapes.removeAt(i)
            }
        }
    }

    fun removeDuplicates() {
        for (i in 0 until shapes.size - 1) {
            for (j in shapes.size - 1 downTo i + 1) {
                if (shapes[i] == shapes[j]) {
                    shapes.removeAt(j)
                }
            }
        }
    }

    fun getInfo(): String{
            val res = StringBuilder()
            res.append("Layer of crazy shapes: \n")
            for (i in shapes.indices) {
                res.append(shapes[i].toString())
                res.append("\n")
            }
            return res.toString()
        }
}