package com.example.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private val random = Random
    private val numbers = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num6 =findViewById<Button>(R.id.lottoNum6)
        val num5 =findViewById<Button>(R.id.lottoNum5)
        val num4 =findViewById<Button>(R.id.lottoNum4)
        val num3 =findViewById<Button>(R.id.lottoNum3)
        val num2 =findViewById<Button>(R.id.lottoNum2)
        val num1 =findViewById<Button>(R.id.lottoNum1)


        findViewById<FloatingActionButton>(R.id.runButton).setOnClickListener{
            numbers.clear()

            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)
        }
    }
    fun setLottoNum(lottoNum: Button){
        var num = 0

        while(true){
            num = random.nextInt(45)+1
            if(!numbers.contains(num)){
                numbers.add(num)
                break
            }
        }
        lottoNum.text = "${num}"
        //rgb를 랜덤하게 지정
        val r = random.nextInt(256)
        val g = random.nextInt(256)
        val b = random.nextInt(256)
        lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(r,g, b))
    }
}