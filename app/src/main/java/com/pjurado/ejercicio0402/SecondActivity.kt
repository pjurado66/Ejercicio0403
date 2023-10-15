package com.pjurado.ejercicio0402

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pjurado.ejercicio0402.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater).apply {
            setContentView(root)
            var num = intent.getIntExtra("Valor", 0) + 1
            val boton = intent.getIntExtra("boton", 0)
            textView.setText(num.toString())
            button.setOnClickListener {
                setResult(boton, intent.putExtra("num", num))
                finish()
            }

        }
    }
}