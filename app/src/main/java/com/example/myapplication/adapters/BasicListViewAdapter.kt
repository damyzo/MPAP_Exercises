package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.models.Student

class BasicListViewAdapter(private val context: Context, private val allStudents: MutableList<Student>): BaseAdapter() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return allStudents.size
    }

    override fun getItem(position: Int): Any {
        return allStudents[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val newView: View?
        if(convertView == null){
            newView = layoutInflater.inflate(R.layout.list_view_row, parent, false)
            val currentStudent = allStudents[position]
            val index = newView.findViewById<TextView>(R.id.indexTextRow)
            val fullName = newView.findViewById<TextView>(R.id.nameTextRow)

            index.text = currentStudent.index.toString()

            fullName.text = String.format("%s %s",currentStudent.name,currentStudent.lastname)


        }else{
            newView = convertView
        }






        return newView
    }
}