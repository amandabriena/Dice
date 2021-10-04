package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.helloworld.Model.Dice

class MainActivity : AppCompatActivity() {
    /*
    * Encontrando o botão  a textView que estão no layout
    * */
    val rollButton: Button = findViewById(R.id.button)
    val textResult: TextView = findViewById(R.id.numDice)
    //Criando nova instância da classe Dice
    val dice = Dice(6, "blue")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Botão executando o método de rolar o dado ao ser clicado
        * */
        rollButton.setOnClickListener {
            rollDice()
        }

    }
    /*
    * Método para "rolar" o dado e mostrar o resultado em tela:
    * */
    private fun rollDice() {
        val diceRoll = dice.roll()
        textResult.text = diceRoll.toString()
    }
}
