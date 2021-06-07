package com.vaibhavmojidra.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val studentList= listOf(
        Student("Vaibhav 1", 1),
        Student("Vaibhav 2", 2),
        Student("Vaibhav 3", 3),
        Student("Vaibhav 4", 4),
        Student("Vaibhav 5", 5),
        Student("Vaibhav 6", 6),
        Student("Vaibhav 7", 7),
        Student("Vaibhav 8", 8),
        Student("Vaibhav 9", 9),
        Student("Vaibhav 10", 10),
        Student("Vaibhav 11", 11),
        Student("Vaibhav 12", 12)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val my_recyle_view=findViewById<RecyclerView>(R.id.my_recycler_view)
        my_recyle_view.layoutManager = LinearLayoutManager(this)
        my_recyle_view.adapter=MyRecyclerViewAdapter(studentList,{selectedItem:Student->onClickItem(selectedItem)})
    }

    private fun onClickItem(student:Student){
        Toast.makeText(this@MainActivity,"Roll No: "+student.rolNo,Toast.LENGTH_LONG).show()
    }
}