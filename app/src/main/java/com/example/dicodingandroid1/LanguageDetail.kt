package com.example.dicodingandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.dicodingandroid1.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LanguageDetail : AppCompatActivity() {

    companion object {
        const val LANG_LOGO = "lang_logo"
        const val LANG_NAME = "lang_name"
        const val LANG_AUTHOR = "lang_author"
        const val LANG_YEAR = "lang_year"
        const val LANG_DESC = "lang_desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_detail)

        val actionBar = supportActionBar
        actionBar?.title = "Detail Page"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val langLogoView: ImageView = findViewById(R.id.lang_logo)
        Glide.with(this)
                .load(intent.getStringExtra(LANG_LOGO)?.toInt())
                .apply(RequestOptions())
                .into(langLogoView)

        val langNameView: TextView = findViewById(R.id.lang_name)
        langNameView.text = intent.getStringExtra(LANG_NAME)

        val langAuthorView: TextView = findViewById(R.id.lang_author)
        val authorData = "Author: ${intent.getStringExtra(LANG_AUTHOR)}"
        langAuthorView.text = authorData

        val langYearView: TextView = findViewById(R.id.lang_year)
        val yearData = "Release year: ${intent.getStringExtra(LANG_YEAR)}"
        langYearView.text = yearData

        val langDescView: TextView = findViewById(R.id.lang_desc)
        langDescView.text = intent.getStringExtra(LANG_DESC)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}