package ex07

class Triangulo(private val base: Double, private val altura: Double): CalcularArea {
    override val forma: String = "triângulo"

    override fun calcularArea(): Double {
        return base * altura / 2
    }
}