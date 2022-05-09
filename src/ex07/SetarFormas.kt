package ex07

import kotlin.system.exitProcess

class SetarFormas {
    private val formas: ArrayList<CalcularArea> = ArrayList()

    fun calcularEMostrarArea(){
        while (true){
            println("Qual forma deseja calcular?\n" +
                    "Quadrado, Retângulo, Triângulo ou Losango:")
            println("Para mostrar as áreas calculadas, digite 'mostrar':")
            println("Para sair, digite 'sair':")
            val opcao = readLine()
            when(opcao){
                "mostrar" -> {
                    if(formas.isEmpty()) {
                        println("Sem formas cadastradas!")
                        println()
                    }else {
                        mostrarTodasAsAreas()
                    }
                }
                "quadrado" -> {
                    println("Digite o valor da base do quadrado:")
                    val base = readLine()?.toDouble()
                    base?.let { Quadrado(it) }?.let { formas.add(it) }
                    println()
                }
                "retângulo", "retangulo" -> {
                    println("Digite o valor da base do retângulo:")
                    val base = readLine()?.toDouble()
                    println("Digite o valor da altura do retângulo:")
                    val altura = readLine()?.toDouble()
                    base?.let {
                        if (altura != null) {
                            Retangulo(it, altura)
                        }
                    }?.let { formas.add(it) }
                    println()
                }
                "triângulo", "triangulo" -> {
                    println("Digite o valor da base do triângulo:")
                    val base = readLine()?.toDouble()
                    println("Digite o valor da altura do triângulo:")
                    val altura = readLine()?.toDouble()
                    base?.let {
                        if (altura != null) {
                            Triangulo(it, altura)
                        }
                    }?.let { formas.add(it) }
                    println()
                }
                "losango" -> {
                    println("Digite o valor da base do losango:")
                    val base = readLine()?.toDouble()
                    println("Digite o valor da altura do losango:")
                    val altura = readLine()?.toDouble()
                    base?.let {
                        if (altura != null) {
                            Losango(it, altura)
                        }
                    }?.let { formas.add(it) }
                    println()
                }
                "sair" -> {
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida.\n" +
                            " Digite novamente:")
                    println()
                }
            }
        }
    }

    private fun mostrarTodasAsAreas(){
        println("Área das formas:")
        formas.forEach { it.mostrarInformacoes() }
    }
}

private fun <E> ArrayList<E>.add(element: Unit) {

}