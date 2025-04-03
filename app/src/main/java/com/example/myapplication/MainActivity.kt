package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView2)
        val fabIncrement: FloatingActionButton = findViewById(R.id.fab_increment)
        val fabDecrement: FloatingActionButton = findViewById(R.id.fab_decrement)

        textView.text = "Contador: $count"

        fabIncrement.setOnClickListener {
            count++
            textView.text = "Contador: $count"
        }

        fabDecrement.setOnClickListener {
            if (count > 0) { // Impede que o contador fique negativo
                count--
                textView.text = "Contador: $count"
            }
        }
    }
}



