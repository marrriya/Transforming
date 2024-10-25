class Square(private var sideLength: Float, x: Int = 0, y: Int = 0) : Figure(0), Transforming {
    private var positionX: Int = x
    private var positionY: Int = y

    override fun area(): Float {
        return sideLength * sideLength
    }

    override fun resize(zoom: Int) {
        sideLength *= zoom.toFloat()
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        this.positionX = centerX
        this.positionY = centerY
    }
}