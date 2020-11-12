package com.n.yubaba

import android.os.Bundle
import android.view.KeyEvent.ACTION_DOWN
import android.view.KeyEvent.KEYCODE_ENTER
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.text = "契約書だよ。そこに名前を書きな。"
        name.requestFocus()
        name.setOnKeyListener { _, i, keyEvent ->
            if (keyEvent.action == ACTION_DOWN && i == KEYCODE_ENTER) {
                text2.text = "フン。${name.text}というのかい。贅沢な名だねぇ。"
                val newName = name.text[Random.nextInt(name.text.length)].toString()
                text3.text = "今からお前の名前は${newName}だ。いいかい、${newName}だよ。分かったら返事をするんだ、${newName}!!"
                true
            } else {
                false
            }
        }
    }
}