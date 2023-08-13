package com.drovo.thequizchampsdk

import android.content.Context
import android.content.Intent
import com.drovo.thequizchampsdk.view.BaseActivity

object QuizChampSDK {
    fun openQuizChampSDK(
        context: Context
    ){
        val intent = Intent(context, BaseActivity::class.java)
        context.startActivity(intent)
    }
}