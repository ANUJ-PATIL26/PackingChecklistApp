package com.example.packingchecklistapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fabAddChecklist: FloatingActionButton
    private val checklistAdapter = ChecklistAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewChecklists)
        fabAddChecklist = findViewById(R.id.fabAddChecklist)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = checklistAdapter

        fabAddChecklist.setOnClickListener {
            val intent = Intent(this, ChecklistActivity::class.java)
            startActivity(intent)
        }
    }
}
