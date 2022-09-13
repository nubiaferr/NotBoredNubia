package com.example.notbored_nubia

import android.content.Context
import android.content.SharedPreferences

class SharedInfos(context: Context) {
    private val infos: SharedPreferences =
        context.getSharedPreferences("Participants", Context.MODE_PRIVATE)

    fun storeParticipants(key: String, numberOfParticipants: String) {
        infos.edit().putString(key, numberOfParticipants).apply()
    }

    fun getParticipants(key: String): String {
        return infos.getString(key, "") ?: "1"
    }

}