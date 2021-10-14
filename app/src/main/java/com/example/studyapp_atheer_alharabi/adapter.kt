package com.example.studyapp_atheer_alharabi

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter.*
import kotlinx.android.synthetic.main.adapter.view.*

class adapter(val context: Context, val input:ArrayList<review>) : RecyclerView.Adapter<adapter.itemViewHolder>() {

    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        //take ont data and add it to textview up
        val message = input[position]

        holder.itemView.apply {

            tv1.text = message.title1
            tv2.text = message.title2

            cv.setOnClickListener {
                Dialog(context as Activity, message.title3, message.description)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        return itemViewHolder(

            LayoutInflater.from(context).inflate(
                R.layout.adapter,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = input.size


}
