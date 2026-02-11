package com.example.myapplication56

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var firstnumberTxt: EditText
    private lateinit var secondnumberTxt: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


         firstnumberTxt  = findViewById( R.id.etFirstNumber)
         secondnumberTxt = findViewById( R.id.etSecondNumber)
        val topla : Button = findViewById(  R.id.btnAdd)
        val cix : Button = findViewById(  R.id.btnSubtract)
        val vur : Button = findViewById(  R.id.btnmultipilication)
        val bol : Button = findViewById(  R.id.btndivision)
        val cavab : TextView = findViewById(  R.id.tvResult)

        topla.setOnClickListener {
            val firstNumberTxt = firstnumberTxt.text.toString().toDouble()
            val secondNumberTxt = secondnumberTxt.text.toString().toDouble()

            val cem = firstNumberTxt+secondNumberTxt
            cavab.text = cem.toString()
        }

        cix.setOnClickListener {
            val firstNumberTxt = firstnumberTxt.text.toString().toDouble()
            val secondNumberTxt = secondnumberTxt.text.toString().toDouble()

            val cix = firstNumberTxt-secondNumberTxt
            cavab.text = cix.toString()
        }
        vur.setOnClickListener {
            val firstNumberTxt = firstnumberTxt.text.toString().toDouble()
            val secondNumberTxt = secondnumberTxt.text.toString().toDouble()

            val vur = firstNumberTxt*secondNumberTxt
            cavab.text = vur.toString()
        }
        bol.setOnClickListener {
            val firstNumberTxt = firstnumberTxt.text.toString().toDouble()
            val secondNumberTxt = secondnumberTxt.text.toString().toDouble()

            val bol = firstNumberTxt/secondNumberTxt
            cavab.text = bol.toString()
        }



    }

//    fun cem(operator: String){
//        val firstNumber = firstnumberTxt.text.toString().toDoubleOrNull() ?: 0.0
//        val secondNumber = secondnumberTxt.text.toString().toDoubleOrNull() ?: 0.0
//
//            when (operator){
//
//
//                "+" -> firstNumber + secondNumber
//                "-" -> firstNumber - secondNumber
//                else -> 0.0
//            }
//
//    }




    }
