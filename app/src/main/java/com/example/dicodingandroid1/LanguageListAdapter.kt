package com.example.dicodingandroid1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingandroid1.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*


class LanguageListAdapter(private val langList: ArrayList<Language>): RecyclerView.Adapter<LanguageListAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.row_view, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return langList.size

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val lang = langList[position]
        Glide.with(holder.itemView.context)
            .load(lang.logo)
            .apply(RequestOptions().override(55,55))
            .into(holder.langLogo)

        val author = "Author: ${lang.author}"
        val year = "Realease year: ${lang.year}"
        holder.langName.text = lang.name
        holder.langAuthor.text = author
        holder.langYear.text = year

        val classContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val detailIntent = Intent(classContext, LanguageDetail::class.java)
            detailIntent.putExtra(LanguageDetail.LANG_LOGO, lang.logo.toString())
            detailIntent.putExtra(LanguageDetail.LANG_NAME, lang.name)
            detailIntent.putExtra(LanguageDetail.LANG_AUTHOR, lang.author)
            detailIntent.putExtra(LanguageDetail.LANG_YEAR, lang.year)
            detailIntent.putExtra(LanguageDetail.LANG_DESC, lang.desc)
            classContext.startActivity(detailIntent)

        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var langLogo: ImageView = itemView.findViewById(R.id.lang_logo)
        var langName: TextView = itemView.findViewById(R.id.lang_name)
        var langAuthor: TextView = itemView.findViewById(R.id.lang_author)
        var langYear: TextView = itemView.findViewById(R.id.lang_year)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Language)
    }

}
