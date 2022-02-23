package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val editPassword = findViewById<EditText>(R.id.password)
            val passwordTest = editPassword.text.toString()

            var passwordinst = findViewById<TextView>(R.id.inst)

            val intent = Intent(this, MemoActivity::class.java)


            if (passwordTest == "12345678") {
                startActivity(intent)
                this.finish()
            } else {
                passwordinst.text = "비밀번호가 틀렸어요 다시 입력해주세요"
            }
        }

    }
}