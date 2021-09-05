package com.example.mykotlincontectdata.adadpter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bett.com.kotlinlistview.dtos.UserDto

import com.example.mykotlincontectdata.R

import java.util.*
import kotlin.collections.ArrayList


class UsersAdapter(private var items: ArrayList<UserDto>):
    RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override
    fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var userDto = items[position]
        holder?.txtName?.text = userDto.name
        holder?.txtNumber?.text = userDto.Number
    }

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.row_layout, parent, false)

        return ViewHolder(itemView)
    }

    class ViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        var txtName: TextView? = null
        var txtNumber: TextView? = null

        init {
            this.txtName = row?.findViewById<TextView>(R.id.txtName)
            this.txtNumber = row?.findViewById<TextView>(R.id.txtNumber)
        }
    }
}