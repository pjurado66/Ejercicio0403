package com.pjurado.ejercicio0402

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.pjurado.ejercicio0402.databinding.ActivityMainBinding
import org.jetbrains.annotations.Nullable


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)

            val getResult =
                registerForActivityResult(
                    ActivityResultContracts.StartActivityForResult()) {
                        var num = it.data?.getIntExtra("num", 0)?.toInt()
                        when (it.data?.getIntExtra("boton", 0)) {
                            1 -> textView1.setText(num.toString())
                            2 -> textView2.setText(num.toString())
                            3 -> textView3.setText(num.toString())
                            4 -> textView4.setText(num.toString())
                        }
                        

                }
            button1.setOnClickListener(View.OnClickListener {
                val i = Intent(this@MainActivity, SecondActivity::class.java)
                i.putExtra("Valor", textView1.getText().toString().toInt())
                i.putExtra("boton", 1)
                getResult.launch(i)
            })

            button2.setOnClickListener(View.OnClickListener {
                val i = Intent(this@MainActivity, SecondActivity::class.java)
                i.putExtra("Valor", textView2.getText().toString().toInt())
                i.putExtra("boton", 2)
                getResult.launch(i)
            })

            button3.setOnClickListener(View.OnClickListener {
                val i = Intent(this@MainActivity, SecondActivity::class.java)
                i.putExtra("Valor", textView3.getText().toString().toInt())
                i.putExtra("boton", 3)
                getResult.launch(i)
            })

            button4.setOnClickListener(View.OnClickListener {
                val i = Intent(this@MainActivity, SecondActivity::class.java)
                i.putExtra("Valor", textView4.getText().toString().toInt())
                i.putExtra("boton", 4)
                getResult.launch(i)
            })
        }


    }


}