package com.chattie.myapplication

import com.chattie.myapplication.model.Message

class SampleData {
    val LIST_OF_FRIENDS: List<com.chattie.myapplication.model.User> = listOf(
        com.chattie.myapplication.model.User("Jones Paul", "Hi i am grateful"),
        com.chattie.myapplication.model.User("Ada Okereke", "Hey nice to have you on my whatsapp"),
        com.chattie.myapplication.model.User("Miracle Chukwu", "Programming vibes"),
        com.chattie.myapplication.model.User("Nene Rosheedah", "I love coding"),
        com.chattie.myapplication.model.User("Ruth Okeniyi", "Hey i am using whatsapp"),
    )
}

class SampleMessages {
    val LIST_OF_MESSAGES: List<Message> = listOf(
        Message("Ossy Okereke", "16:00", "I want to see Dr. Uche tomorrow", "Rosheedah"),
        Message("Dessy", "17:00", "I want to travel on Tuesday", "Rosheedah"),
        Message("Joke", "16:30", "I like the new series", "Rosheeah"),
        Message("Me", "21:00", "Thank you for your constant patronage", "Rosheedah"),
        Message("Me", "16:00", "I want to see Dr. Uche tomorrow", "Rosheedah"),
        Message("Me", "16:00", "I want to see Dr. Uche tomorrow", "Rosheedah"),
    )


}