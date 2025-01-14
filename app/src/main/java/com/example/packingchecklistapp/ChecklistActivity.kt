package com.example.packingchecklistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class ChecklistActivity : AppCompatActivity() {
    private lateinit var editTextItem: EditText
    private lateinit var buttonAddItem: Button
    private lateinit var recyclerViewItems: RecyclerView
    private val itemsAdapter = ItemsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)

        editTextItem = findViewById(R.id.editTextItem)
        buttonAddItem = findViewById(R.id.buttonAddItem)
        recyclerViewItems = findViewById(R.id.recyclerViewItems)

        recyclerViewItems.layoutManager = LinearLayoutManager(this)
        recyclerViewItems.adapter = itemsAdapter

        buttonAddItem.setOnClickListener {
            val newItem = editTextItem.text.toString()
            if (newItem.isNotEmpty()) {
                itemsAdapter.addItem(newItem)
                editTextItem.text.clear()
            }
        }
    }
}
