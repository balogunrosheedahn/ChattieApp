package com.chattie.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chattie.myapplication.adapter.ListOfFriendsAdapter

class NewGroupActivity: AppCompatActivity() {
    private lateinit var toolbar: Toolbar

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar = findViewById(R.id.toolbar)

        initRecyclerview()

        //Set up recyclerview and show it on screen
    }

    private fun initRecyclerview() {
        recyclerView = findViewById(R.id.list_of_friends)
        recyclerView.adapter = ListOfFriendsAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}