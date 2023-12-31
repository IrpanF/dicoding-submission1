package com.example.dicodingandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.dicodingandroid1.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val actionbar = supportActionBar
        actionbar?.title = "About"
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val profilePicView: ImageView = findViewById(R.id.student_picture)
        Glide.with(this)
                .load(R.drawable.irfan)
                .apply(RequestOptions())
                .into(profilePicView)

        val studentNameView: TextView = findViewById(R.id.student_name)
        val myName = "Irfan Fauzi"
        studentNameView.text = myName

        val studentEmailView: TextView = findViewById(R.id.student_email)
        val myEmail = "irfanfauzi@bangkit.academy"
        studentEmailView.text = myEmail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}