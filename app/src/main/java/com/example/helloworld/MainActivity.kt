package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.helloworld.Model.Dice

class MainActivity : AppCompatActivity() {
    /*
    * Encontrando o botão  a textView que estão no layout
    * */



    //Criando nova instância da classe Dice
    val dice = Dice(6, "blue")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton);

        /*
        * Botão executando o método de rolar o dado ao ser clicado
        * */
        rollButton.setOnClickListener {
            rollDice()
        }
        // Inicializando o dado ao iniciar o app:
        rollDice()

    }
    /*
    * Método para "rolar" o dado e mostrar o resultado em tela:
    * */
    private fun rollDice() {
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageDice)
        val drawableResouse = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResouse)
    }
}
