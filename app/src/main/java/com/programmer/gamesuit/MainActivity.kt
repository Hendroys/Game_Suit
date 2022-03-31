package com.programmer.gamesuit

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun main(args: Array<String>) {
        var lanjutkan = true

        while(lanjutkan){
            println("\n==========================")
            println("GAME SUIT TERMINAL VERSION")
            println("==========================")

            print("1. Masukan pemain 1 : ")
            //Reference type data = String
            val input1 = readLine()
            print("2. Masukan pemain 2 : ")
            val input2 = readLine()

            //Object controller dari class Controller
            val controller = Controller(showHasil)
            controller.hitung(input1!!,input2!!)

            lanjutkan = controller.yesNo()
        }
        println("\nProgram Selesai :)")
    }

    private val showHasil = object: CallBack{
        override fun showResult(msg: String){
            println(msg)
        }
    }
}