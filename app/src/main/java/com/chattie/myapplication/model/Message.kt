package com.chattie.myapplication.model

import android.content.IntentSender

data class Message(
    val sender : String,
    val time: String,
    val message: String,
    val receiver: String

    )

