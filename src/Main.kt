fun main() {

    val list = Layer()
    val ab = Point(1.55, 12.4)
    val ss = Square(ab, 4.15, "red", false)
    val an = Circle(ab, 1.0, "red", false)
    list.addShape(ss)
    list.addShape(an)
    list.addShape(ss)
    list.addShape(an)
    list.addShape(an)
    println(list.getInfo())
    list.removeDuplicates()
    //list.removeCircles();
    println(list.getInfo())
}
