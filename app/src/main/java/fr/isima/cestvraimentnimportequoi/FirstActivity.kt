package fr.isima.cestvraimentnimportequoi

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val editText: TextView = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            textView.text = editText.text
        }
    }
}