package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.Student

class BasicRecyclerViewAdapter(val context: Context, val allStudents: MutableList<Student>):
    RecyclerView.Adapter<BasicRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val index: TextView = view.findViewById(R.id.indexRecTextView)
        val name: TextView = view.findViewById(R.id.nameRecTextView)
        val lastName: TextView = view.findViewById(R.id.lastnameRecTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentStudent = allStudents[position]

        holder.name.text = currentStudent.name
        holder.lastName.text = currentStudent.lastname
        holder.index.text = currentStudent.index.toString()
    }

    override fun getItemCount(): Int {
        return allStudents.size
    }
}