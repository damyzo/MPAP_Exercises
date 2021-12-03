package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.adapters.BasicListViewAdapter
import com.example.myapplication.models.Student

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        //data
        val data: MutableList<Student> = initList()
        //View components
        val listViewComponent: ListView = findViewById(R.id.basicListView)
        //adapters

        val basicAdapter = BasicListViewAdapter(this, data)

        listViewComponent.adapter = basicAdapter



    }

    private fun initList(): MutableList<Student> {
        return mutableListOf(
            Student("Kosta","Kostic", 188085),
            Student("Milutin","Milicevic", 182098),
            Student("Dragan","Zoran", 186001)

        )
    }
}