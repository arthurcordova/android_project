package com.proway.primeiroprojetoandroid.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.proway.primeiroprojetoandroid.R
import com.proway.primeiroprojetoandroid.adapter.AdapterListaNomes

class PrimeiraListaActivity : AppCompatActivity() {

    lateinit var recyclerViewNomes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_lista)


        val arrayNomes = arrayListOf(
            "Arthur",
            "Aline",
            "Joaquim",
            "Pedro",
            "Arthur",
            "Aline",
            "Joaquim",
            "Pedro"
        )

        recyclerViewNomes = findViewById(R.id.recyclerViewNomes)
        recyclerViewNomes.adapter = AdapterListaNomes(arrayNomes) { nome, position ->
            Snackbar.make(recyclerViewNomes, "Item clickado é $nome posiçao: $position", Snackbar.LENGTH_LONG)
                .show()
        }
        recyclerViewNomes.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}