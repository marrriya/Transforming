class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Figure(0), Transforming {
    var color: Int = -1
    lateinit var name: String
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun area(): Float {
        return (width * height).toFloat()
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val cenX = x + width / 2
        val cenY = y + height / 2

        when (direction) {
            RotateDirection.Clockwise -> {
                val tempX = x
                x = cenX - (y - cenY) + height / 2
                y = cenY + (tempX - cenX) - width / 2
            }
            RotateDirection.CounterClockwise -> {
                val tempX = x
                x = cenX + (y - cenY) - height / 2
                y = cenY - (tempX - cenX) + width / 2
            }
        }
    }
}