package com.example.secretmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            val editPassword = findViewById<EditText>(R.id.password)
            val passwordTest = editPassword.text.toString()

            val editEmail = findViewById<EditText>(R.id.email)
            val emailTest = editEmail.text.toString()

            if( emailTest == "jadob@naver.com"){
                if( passwordTest == "12345678"){
                    Log.d("D", "통과")
                } else{
                    Log.d("D", "비밀번호가 틀렸어요")
                }
            } else{
                Log.d("D", "이메일이 틀렸어요")
            }
        }

    }
}