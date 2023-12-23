package com.example.defaultlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val listArray = arrayOf(
            "Rakib",
            "Sakib",
            "Jhony",
            "Tahmid",
            "Tajul",
            "Aminul",
            "Meraj",
            "Parvej",
            "Rayhan",
            "Nazmul",
            "Saiful",
            "Sojib",
            "Siam",
            "Silrag",
            "Adnan",
            "Akon",
            "Digonto",
            "Yeakub",
            "Hasib",
            "Raisul",
            "Turjo",
            "Sheba",
            "Sanjida",
            "Maliha",
            "Mahfuza",
            "Farzana",
            "Sumaiya",
        )
        val arrayAdapter = ArrayAdapter<Any>(this,android.R.layout.simple_list_item_1,listArray)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,listArray[i],Toast.LENGTH_LONG).show()
        }
    }
}