package com.drovo.thequizchamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drovo.thequizchampsdk.QuizChampSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        QuizChampSDK.openQuizChampSDK(this)
        finish()
    }
}