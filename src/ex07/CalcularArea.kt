package ex07

interface CalcularArea {
    val forma: String

    fun calcularArea(): Double

    fun mostrarInformacoes(){
        println("A área do $forma é de ${calcularArea()}")
    }
}