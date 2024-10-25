class Circle(private var radius: Float, x: Int = 0, y: Int = 0) : Figure(0), Transforming {
    private var centerX: Int = x
    private var centerY: Int = y

    override fun area(): Float {
        return Math.PI.toFloat() * radius * radius
    }

    override fun resize(zoom: Int) {
        radius *= zoom.toFloat()
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        this.centerX = centerX
        this.centerY = centerY
    }
}