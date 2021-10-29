package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var e1: EditText? = null
    var e2: EditText? = null
    var t1: TextView? = null
    var num1 = 0
    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }// converting string to int.

    // converting string to int.
// defining the edit text 1 to e1

    // defining the edit text 2 to e2

    // defining the text view to t1

    // taking input from text box 1

    // taking input from text box 2

    // condition to check if box is not empty
    // a public method to get the input numbers
    val numbers: Boolean
        get() {

            // defining the edit text 1 to e1
            e1 = findViewById<View>(R.id.num1) as EditText

            // defining the edit text 2 to e2
            e2 = findViewById<View>(R.id.num2) as EditText

            // defining the text view to t1
            t1 = findViewById<View>(R.id.result) as TextView

            // taking input from text box 1
            val s1 = e1!!.text.toString()

            // taking input from text box 2
            val s2 = e2!!.text.toString()

            // condition to check if box is not empty
            if (s1 == null && s2 == null
                || s1 == "" && s2 == ""
            ) {
                val result = "Please enter a value"
                t1!!.text = result
                return false
            } else {
                // converting string to int.
                num1 = s1.toInt()

                // converting string to int.
                num2 = s2.toInt()
            }
            return true
        }

    // a public method to perform addition
    fun doSum(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = num1 + num2
            t1!!.text = Integer.toString(sum)
        }
    }

    // a public method to perform power function
    fun doPow(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = Math.pow(num1.toDouble(), num2.toDouble())
            t1!!.text = java.lang.Double.toString(sum)
        }
    }

    // a public method to perform subtraction
    fun doSub(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = num1 - num2
            t1!!.text = Integer.toString(sum)
        }
    }

    // a public method to perform multiplication
    fun doMul(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = num1 * num2
            t1!!.text = Integer.toString(sum)
        }
    }

    // a public method to perform Division
    fun doDiv(v: View?) {

        // get the input numbers
        if (numbers) {

            // displaying the text in text view assigned as t1
            val sum = num1 / (num2 * 1.0)
            t1!!.text = java.lang.Double.toString(sum)
        }
    }

    // a public method to perform modulus function
    fun doMod(v: View?) {

        // get the input numbers
        if (numbers) {
            val sum = (num1 % num2).toDouble()
            t1!!.text = java.lang.Double.toString(sum)
        }
    }
}