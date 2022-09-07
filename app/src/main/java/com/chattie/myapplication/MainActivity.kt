package com.chattie.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

import androidx.viewpager2.widget.ViewPager2
import com.chattie.myapplication.adapter.MainPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        initTabLayout()
    }



    private fun initTabLayout() {
    tabLayout = findViewById(R.id.tab)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter =
            MainPageAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            when(position){
                0 -> tab.icon = getDrawable(R.drawable.ic_baseline_camera_alt_24)
                1 -> tab.text ="Chat"
                2 -> tab.text ="Status"
                3 -> tab.text ="Calls"
            }
        }.attach()

        viewPager.currentItem = 1
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.new_broadcast ->{
                goToNewBroadcastActivity()
                Toast.makeText(this, "New Broadcast Click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.new_group ->{
                Toast.makeText(this, "New Group Click", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.settings ->{
                Toast.makeText(this, "Settings Click", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.linked_devices ->{
                Toast.makeText(this, "Linked Click", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.search ->{
                Toast.makeText(this, "Search Click", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                return false
            }
        }
    }

    private fun goToNewGroupActivity(){
        val i = Intent(this, NewGroupActivity::class.java)
        startActivity(i)
    }

    private fun goToNewBroadcastActivity(){
        val i = Intent(this, NewBroadcastActivity::class.java)
        startActivity(i)
    }


}



