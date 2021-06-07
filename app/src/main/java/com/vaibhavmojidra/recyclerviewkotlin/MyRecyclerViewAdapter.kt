package com.vaibhavmojidra.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val studentList: List<Student>,private val clickListener:(student:Student)->Unit) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var name:TextView = itemView.findViewById(R.id.name_text_view)
        fun bind(student:Student,clickListener:(student:Student)->Unit) {
            name.text=student.name
            itemView.setOnClickListener{
                clickListener(student)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
       return MyViewHolder(myView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val student=studentList[position]
        holder.bind(student,clickListener)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

}