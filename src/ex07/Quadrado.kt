package ex07

import kotlin.math.pow

class Quadrado(private val lado: Double): CalcularArea {
    override val forma: String = "quadrado"

    override fun calcularArea(): Double {
        return lado.pow(2)
    }
}