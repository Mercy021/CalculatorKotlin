package com.example.calculatorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etfirstnumber = findViewById<EditText>(R.id.etfirstnumber)
        var etsecondnumber = findViewById<EditText>(R.id.etsecondnumber)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnModulus = findViewById<Button>(R.id.btnModulus)
        var tvresult = findViewById<TextView>(R.id.tvresult)


        btnAdd.setOnClickListener {
            if (etfirstnumber.text.toString() == "") {
                Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()

            } else if (etsecondnumber.text.toString() == "") {
                Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()

            } else {

                var a = etfirstnumber.text.toString().toInt()
                var b = etsecondnumber.text.toString().toInt()
                var Add = a + b
                tvresult.text = "result ${Add}"
            }
        }


                btnSubtract.setOnClickListener {
                    if (etfirstnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()

                    } else if (etsecondnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()
                        }else {

                        var a = etfirstnumber.text.toString().toInt()
                        var b = etsecondnumber.text.toString().toInt()
                        var Subtract = a - b
                        tvresult.text = "result ${Subtract}"
                    }
                }
                btnMultiply.setOnClickListener {
                    if (etfirstnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()

                    } else if (etsecondnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()
                    } else {


                        var a = etfirstnumber.text.toString().toInt()
                        var b = etsecondnumber.text.toString().toInt()
                        var Multiply = a * b
                        tvresult.text = "result ${Multiply}"
                    }


                }
                btnModulus.setOnClickListener {
                    if (etfirstnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()

                    } else if (etsecondnumber.text.toString() == "") {
                        Toast.makeText(baseContext, "enter", Toast.LENGTH_SHORT).show()
                    }else {

                        var a = etfirstnumber.text.toString().toInt()
                        var b = etsecondnumber.text.toString().toInt()
                        var Modulus = a % b
                        tvresult.text = "result ${Modulus}"
                    }


                }


    }
}


