fun main() {
    val rect = Rect(0, 0, 10, 10)
    val circle = Circle(2f)
    val square = Square(3f)

    val figures: Array<Figure> = arrayOf(rect, circle, square)

    for (figure in figures) {
        println("Initial Area of ${figure::class.simpleName}: ${figure.area()}")

        if (figure is Transforming) {
            figure.resize(2)
            println("Resized Area of ${figure::class.simpleName}: ${figure.area()}")
        }

        if (figure is Transforming) {
            figure.rotate(RotateDirection.Clockwise, 0, 0)
            println("${figure::class.simpleName} rotated clockwise.")
        }

        if (figure is Movable) {
            figure.move(5, 3)
            println("${figure::class.simpleName} moved to new position.")
        }
    }
}