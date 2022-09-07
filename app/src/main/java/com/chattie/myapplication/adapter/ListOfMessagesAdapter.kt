package com.chattie.myapplication.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chattie.myapplication.ChatActivity
import com.chattie.myapplication.R
import com.chattie.myapplication.SampleMessages
import com.chattie.myapplication.model.Message

class ListOfMessagesAdapter(val context: Context):RecyclerView.Adapter <ListOfMessagesAdapter.MsgViewHolder>() {
    private val sampleMessages = SampleMessages()
    private val listOfMessages: List<Message> = sampleMessages.LIST_OF_MESSAGES




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)

        return MsgViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
        holder.username.text = listOfMessages[position].sender
        holder.messages.text = listOfMessages[position].message

        holder.itemView.setOnClickListener(){
            val intent = Intent(context, ChatActivity::class.java)
            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int = listOfMessages.size

    class MsgViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val username: TextView = itemView.findViewById(R.id.userName)
        val messages: TextView = itemView.findViewById(R.id.status)
    }

}