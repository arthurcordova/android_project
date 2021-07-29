package com.proway.primeiroprojetoandroid.classes

class Cobra : Animal("reptil"), Som {

    override fun movimentar() {
        println("Cobra rastejando")
        super.movimentar()
    }

    override fun ruido(): String {
        return "shshshs....."
    }

    override fun silencio(): String {
        TODO("Not yet implemented")
    }

    override fun frente(x: Int): String {
        TODO("Not yet implemented")
    }

    override fun lado() {
        TODO("Not yet implemented")
    }

    override fun randon(): String {
        TODO("Not yet implemented")
    }

}