package ex07

class Retangulo(private val base: Double, private val altura: Double): CalcularArea {
    override val forma: String = "retângulo"

    override fun calcularArea(): Double {
        return base * altura
    }
}