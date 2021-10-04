package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.Model.Dice

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener{
            Toast.makeText(this, "DiceRolled", Toast.LENGTH_SHORT).show()
        }

        val myFirstDice = Dice(6, "blue")
        myFirstDice.roll();

    }
}
