package ex07

class Losango(private val base: Double, private val altura: Double): CalcularArea {
    override val forma: String = "losango"

    override fun calcularArea(): Double {
        return base * altura
    }
}