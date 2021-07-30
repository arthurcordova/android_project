package com.proway.primeiroprojetoandroid.classes

import java.util.*
import kotlin.collections.ArrayList


fun main() {

    val arrayDeAnimais = arrayListOf<Animal?>()
    arrayDeAnimais.add(Cachorro("bud")) // position 0
    arrayDeAnimais.add(Cobra(true))// position 1
    arrayDeAnimais.add(Cobra(false))// position 2
    arrayDeAnimais.add(null)// position 3

    arrayDeAnimais.size // 4 positions


    arrayDeAnimais.forEach { animal ->

        animal?.apply {
            if (this is Cobra) {
                println("Cobra com veneno? $veneno")
            } else if (this is Cachorro) {
                println("Nome do cachorro é: $nome")
            }
        }
    }

    val arrayDeNumeros = arrayOf(5, 2, 10, 20, 17, 13, 25)
    arrayDeNumeros.forEach {
        println(it)
    }

    println("Números filtrados")

    arrayDeNumeros.filter { it > 10 }.sortedDescending().forEach {
        println(it)
    }


    val num = -1
    val retorno =
        if (num > 9) "Numero é maior que 9" else if (num > 6) "entre 7 e 9" else "menor que 6"


    val retornoWhen = when (num) {
        in 0..4 -> "regular"
        in 5..7 -> "bom"
        !in 8..10 -> "otimo"
        else -> "Nenhum número informado"
    }


//
    val cachorro = Cachorro("bud")
    val cachorro2 = Cachorro("bud")
//    val cobra = Cobra()


    val veiculo = Veiculo(combustivel = "diesel", motor = "2.0", tipoVeiculo = TipoVeiculo.CAMINHAO)


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

fun printTipoVeiculo(tipo: TipoVeiculo) {


    when (tipo) {
        TipoVeiculo.CARRO -> println("Selecionado ${TipoVeiculo.CARRO}")
        TipoVeiculo.CAMINHAO -> println("Selecionado ${TipoVeiculo.CAMINHAO}")
        TipoVeiculo.MOTO -> println("Selecionado ${TipoVeiculo.MOTO.id} -- ${TipoVeiculo.MOTO.key}")
    }

}
