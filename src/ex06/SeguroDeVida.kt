package ex06

class SeguroDeVida: Tributos {
    override var taxa = 42.0
    override fun calcularTributo(): Double {
        taxa
        return taxa
    }
    override fun exibirTributo() {
        println(calcularTributo())
    }
}