package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.BasicRecyclerViewAdapter
import com.example.myapplication.models.Student

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        //Data
        val data: MutableList<Student> = initList()
        //View Components

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        //Use this when you are sure that every view ITEM has fixed width and height
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Adapters

        val recyclerViewAdapter = BasicRecyclerViewAdapter(this, data)
        recyclerView.adapter = recyclerViewAdapter

    }

    private fun initList(): MutableList<Student> {
        return mutableListOf(
            Student("Kosta","Kostic", 188085),
            Student("Milutin","Milicevic", 182098),
            Student("Dragan","Zoran", 186001),
            Student("Bratislav","Ilic", 189021),
            Student("Stance","Milanov", 185099),
            Student("Zorica","Strika", 187213),
            Student("Elon","Musk", 185656),
            Student("Elon","Tusk", 183092),
            Student("Rick","Sanchez", 185666)

        )
    }
}