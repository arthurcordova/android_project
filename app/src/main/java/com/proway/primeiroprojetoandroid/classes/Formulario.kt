package com.proway.primeiroprojetoandroid.classes

class Formulario(
    var email: String?,
    var name: String?,
    var password: String?
) {

    constructor() : this(null, null, null)

    fun checkAllFields(): Boolean {
        return checkEmail() && checkName() && checkPassword()
    }

    private fun checkEmail(): Boolean {
        return !email.isNullOrEmpty()
    }

    private fun checkName(): Boolean {
        return !name.isNullOrEmpty()
    }

    private fun checkPassword(): Boolean {
        return !password.isNullOrEmpty()
    }

}