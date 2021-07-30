package com.proway.primeiroprojetoandroid.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.snackbar.Snackbar
import com.proway.primeiroprojetoandroid.R
import com.proway.primeiroprojetoandroid.classes.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        /**  Click utilizando interface View.OnClickListener
         *   Classe MainActivity implementa o click do button
         *   ps* caso exista mais eventos de click e componentes diferentes,
         *   deve-se tratar por ID dentro da função de click
         *
         * */
        val button = findViewById<Button>(R.id.buttonSave)
        val buttonTest = findViewById<Button>(R.id.buttonTest)
        button.setOnClickListener(this)
        buttonTest.setOnClickListener(this)


            SingletonTest.uid


        /**      Click mais simples utilizando lambda */
//        findViewById<Button>(R.id.buttonSave).apply {
//            setOnClickListener {
//                checkFields(it)
//            }
//        }

        /**      Click mais simples utilizando apply + referencia do this@MainActivity
         *  pq o this dentro do apply muda de escopo
         * */
//        findViewById<Button>(R.id.buttonSave).apply {
//            setOnClickListener(this@MainActivity)
//        }

    }


    /**
     * Função de click - Disparada quando usuário clica no componente
     * em que add o evento de onClickListener
     */
    override fun onClick(v: View?) {




        /**
         * Utilizando WHEN
         */
        v?.let {
            when (it.id) {
                R.id.buttonSave -> {
                    checkFields(it)
                }
                R.id.buttonTest -> {
                    Snackbar.make(it, getString(R.string.message_test), Snackbar.LENGTH_LONG)
                        .show()
                }

            }
        }
    }

    private fun checkFields(view: View) {
        val form = Formulario()

        findViewById<EditText>(R.id.emailEditText).apply {
            form.email = text.toString()
        }

        findViewById<EditText>(R.id.nameEditText).apply {
            form.name = text.toString()
        }

        findViewById<EditText>(R.id.passwordEditText).apply {
            form.password = text.toString()
        }

        if (form.checkAllFields()) {

            SingletonTest.uid = "777777777"


            val intent = Intent(this, ApplicationActivity::class.java)
            startActivity(intent)
            finish()


//            Snackbar.make(
//                view,
//                "${form.name} - ${form.email} - ${form.password}",
//                Snackbar.LENGTH_LONG
//            ).show()
        } else {
            Snackbar.make(view, getString(R.string.message_error), Snackbar.LENGTH_LONG).show()
        }


    }


}