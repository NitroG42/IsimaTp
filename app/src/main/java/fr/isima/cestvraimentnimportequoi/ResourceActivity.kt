package fr.isima.cestvraimentnimportequoi

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ResourceActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(this, R.string.string_toast, Toast.LENGTH_SHORT).show()
        }
    }
}