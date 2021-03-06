package com.proway.primeiroprojetoandroid.classes

import android.text.TextUtils
import android.util.Patterns


class Veiculo(
    var motor: String,
    var combustivel: String,
    var tipoVeiculo: TipoVeiculo?
) : Som {
    constructor() : this("", "",null)

    constructor(motor: String) : this(motor, "", null)

    fun verificarMotor(): Boolean {


        return motor.isNotEmpty() && motor.length >= 2
    }

    fun verificarCombustivel() {
        println("$motor $combustivel")
    }

    fun isValidEmail(target: CharSequence?): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }


    override fun ruido(): String {
        return "Ligando um motor....."
    }

    override fun silencio(): String {
        TODO("Not yet implemented")
    }

}