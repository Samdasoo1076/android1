package com.example.myword

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myword.ui.theme.AndKotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = getWord()
    }


    private fun getWord(): String {
            val list = listOf (
                "나까지 나설 필요는 없다",
                "헌신하면 헌신짝 된다",
                "참고 참고 또 참으면 참나무가 된다",
                "포기하면 편하다",
                "왕관을 쓰려는 자, 그 무게를 견뎌라",
                "아니면 말고",
                "나도 나지만 너도 너다",
                "목숨을 버리면 무기만은 살려 주겠다",
                "가는 말이 고우면 사람을 얕본다",
            )

        return "MY WORD!"
    }
}
