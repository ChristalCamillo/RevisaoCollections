package ex02

// com o SET não podemos adicionar valores repetidos
fun main() {

    val vazio = mutableSetOf<Int>()
    vazio.run {
        add(1)
        add(5)
        add(5)
        add(6)
        add(7)
        add(8)
        add(8)
        add(8)
        println(this)
    }
}