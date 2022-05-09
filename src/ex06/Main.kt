package ex06

fun main() {
    val conta1 = ContaCorrente()
    conta1.calcularTributo()
    conta1.exibirTributo()

    val conta2 = ContaPoupanca()
    conta2.calcularTributo()
    conta2.exibirTributo()

    val seguro = SeguroDeVida()
    seguro.calcularTributo()
    seguro.exibirTributo()
}


