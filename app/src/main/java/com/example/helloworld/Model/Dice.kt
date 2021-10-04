package com.example.helloworld.Model

class Dice (val numSides: Int, val color: String){

    fun roll() : Int{
        return (1..numSides).random()
    }



}