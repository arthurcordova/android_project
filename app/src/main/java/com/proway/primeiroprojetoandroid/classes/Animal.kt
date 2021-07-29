package com.proway.primeiroprojetoandroid.classes

abstract class Animal(
    val categoria: String
) : Som, Movimentacao {

    protected open fun movimentar() {
        println("animal se movimentando")

    }

}