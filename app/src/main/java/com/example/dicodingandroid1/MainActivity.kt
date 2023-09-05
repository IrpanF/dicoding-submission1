package com.example.dicodingandroid1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingandroid1.R

class MainActivity : AppCompatActivity() {

    private lateinit var languages: RecyclerView
    private val langList: ArrayList<Language> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.title = "Homepage"

        languages = findViewById(R.id.rv_lang)
        languages.setHasFixedSize(true)

        langList.addAll(LanguagesData.languagesData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        languages.layoutManager = LinearLayoutManager(this)
        val langListAdapter = LanguageListAdapter(langList)
        languages.adapter = langListAdapter
    }


    // Attach option menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        processOption(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun processOption(selectedOption: Int) {
        when (selectedOption) {
            R.id.about_me -> {
                val aboutIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(aboutIntent)
            }
        }
    }

}