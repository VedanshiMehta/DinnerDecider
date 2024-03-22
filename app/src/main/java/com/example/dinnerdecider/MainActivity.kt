package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonald","Dominoz")
    private lateinit var _buttonDecider:Button
    private lateinit var _textViewFood: TextView
    private lateinit var _buttonAddFood:Button
    private lateinit var _editTextAddFood: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _buttonDecider = findViewById<Button>(R.id.decideButton)
        _textViewFood = findViewById<TextView>(R.id.textViewFood)
        _buttonAddFood = findViewById<Button>(R.id.buttonAddFood)
        _editTextAddFood = findViewById<EditText>(R.id.editTextFood)


        _buttonDecider.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            _textViewFood.text= foodList[randomFood]
        }

        _buttonAddFood.setOnClickListener {
            val newFood = _editTextAddFood.text.toString()
            if(newFood.isNotEmpty())
            {
                foodList.add(newFood)
                _editTextAddFood.text.clear()
            }
        }


    }
}