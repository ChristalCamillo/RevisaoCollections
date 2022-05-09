package ex06

class ContaCorrente: Tributos {
    private val saldoConta = 100
    override var taxa: Double = ((1*saldoConta)/100).toDouble()
    override fun calcularTributo(): Double {
        var tributo = taxa*saldoConta
        return tributo.toDouble()
    }

    override fun exibirTributo() {
        println(calcularTributo())
    }
}