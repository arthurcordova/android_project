package com.proway.primeiroprojetoandroid.classes

fun main() {

    val num = -1
    val retorno =
        if (num > 9) "Numero é maior que 9" else if (num > 6) "entre 7 e 9" else "menor que 6"

    println(retorno)


    val retornoWhen = when(num) {
        in 0..4 -> "regular"
        in 5..7 -> "bom"
        !in 8..10 -> "otimo"
        else -> "Nenhum número informado"
    }

    println(retornoWhen)



//
//    val cachorro = Cachorro()
//    val cobra = Cobra()
//    val veiculo = Veiculo()
//
//
//    println(cachorro.ruido())
//
//
//    val autoFalante = AutoFalante()
//
//    autoFalante.reproduzirSom(object : Som {
//        override fun ruido(): String {
//            return "Som aleatorio"
//        }
//
//        override fun silencio(): String {
//            TODO("Not yet implemented")
//        }
//    })
//    autoFalante.reproduzirSom(cobra)
//    autoFalante.reproduzirSom(veiculo)


}