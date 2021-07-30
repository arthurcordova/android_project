package com.proway.primeiroprojetoandroid.classes

class Cachorro(
    val nome : String
) : Animal("mamifero") {

    override fun movimentar() {
        super.movimentar()
        println("Cachorro caminha em quatro patas")
    }

    override fun ruido(): String {
        return "au au..."
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