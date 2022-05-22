package com.example.recyclerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val recyclerView get() = main_recycler_view

    private val adapter = ItemAdapter { item ->
        onItemClick(item)
    }
    private val dataFactory = FakeDataFactory()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter

        adapter.submitList(dataFactory.getItems())
    }

    private fun onItemClick(item: ItemData) {

    }
}