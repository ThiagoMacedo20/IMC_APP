package com.example.imccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlin.math.roundToInt

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val peso =intent.getStringExtra("peso")
        val altura = intent.getStringExtra("altura")
        try {
            var conversaoPeso = peso.toDouble()
            var conversaoAltura = altura.toDouble()
            var imc = conversaoPeso /(conversaoAltura*conversaoAltura)
            var arrendodar= (imc * 1000.0).roundToInt() /1000.0
            if (arrendodar > 40 ){
                textResultado.text= "Seu IMC é $arrendodar "
            }
            else if ( arrendodar > 30 && arrendodar <= 39.9 ){
                textResultado.text = "Seu IMC é $arrendodar "
            }
            else if (arrendodar > 25 && arrendodar <=29.9 ){
                textResultado.text = "Seu IMC é $arrendodar "
            }
            else if (arrendodar > 20 && arrendodar <=24.9) {
                textResultado.text = "Seu IMC é $arrendodar "
            }
            else if (arrendodar <= 20) {
                textResultado.text = "Seu IMC é $arrendodar "
            }
        } catch (e: NumberFormatException) {
        textResultado.text = "Valor digitado inválido "}

        btVoltar.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
                finishAffinity()
            }
    }
}