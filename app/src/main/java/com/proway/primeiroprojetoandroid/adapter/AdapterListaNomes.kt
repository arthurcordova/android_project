package com.proway.primeiroprojetoandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.proway.primeiroprojetoandroid.R

class AdapterListaNomes(
    val arrayDeNomes: ArrayList<String>,
    val onClick: (String, Int) -> Unit
) :
    RecyclerView.Adapter<ViewHolderNomes>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderNomes {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_lista_nome, parent, false)
        return ViewHolderNomes(view)
    }

    override fun onBindViewHolder(holder: ViewHolderNomes, position: Int) {
        holder.textViewNome.text = arrayDeNomes[position]
        holder.itemView.setOnClickListener {
            onClick(arrayDeNomes[position], position)
        }
    }

    override fun getItemCount(): Int {
        return arrayDeNomes.size
    }

}

class ViewHolderNomes(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textViewNome: TextView = itemView.findViewById(R.id.nameTextView)


}