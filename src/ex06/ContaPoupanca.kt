package ex06

class ContaPoupanca: Tributos {
    override var taxa = 0.0
    override fun calcularTributo(): Double {
        taxa
        return taxa
    }
    override fun exibirTributo() {
        println(calcularTributo())
    }
}