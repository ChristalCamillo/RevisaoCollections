package ex05

fun main() {
    val leitura = Dicionario()
    leitura.dicionario.forEach {
        println("A chave ${it.key} corresponde ao valor ${it.value}")
    }
}