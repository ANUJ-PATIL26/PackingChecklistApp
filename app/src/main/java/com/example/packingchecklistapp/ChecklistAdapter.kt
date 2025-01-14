package com.example.packingchecklistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChecklistAdapter : RecyclerView.Adapter<ChecklistAdapter.ChecklistViewHolder>() {
    private val checklists = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChecklistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ChecklistViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChecklistViewHolder, position: Int) {
        holder.bind(checklists[position])
    }

    override fun getItemCount(): Int = checklists.size

    fun addChecklist(name: String) {
        checklists.add(name)
        notifyDataSetChanged()
    }

    class ChecklistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(android.R.id.text1)
        fun bind(name: String) {
            textView.text = name
        }
    }
}
