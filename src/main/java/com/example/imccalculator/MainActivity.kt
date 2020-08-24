package com.example.imccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btCalcular.setOnClickListener{
            val peso = edtPeso.text.toString();
            val altura = edtAltura.text.toString();
            if (peso.isEmpty() || altura.isEmpty()){
                textToast.text=""
                Toast.makeText(this,"Todos os campos são obrigatórios",Toast.LENGTH_LONG).show()
            }else{
                startActivity(Intent(this,ResultadoActivity::class.java).apply {
                    putExtra("peso",peso);
                    putExtra("altura",altura)
                })
            }
        }


    }
}