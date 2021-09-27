package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Pizza","Tikka","Burger","Roll","Shawarma","Chowmin","Jalferazi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DecideButton.setOnClickListener {
            val random = Random()
            val randomfood = random.nextInt(foodList.count())
            Selectedfood.text = foodList[randomfood]
        }

        AddFoodBtn.setOnClickListener {
            val newfood = addfoodtxt.text.toString()
            foodList.add(newfood)
            addfoodtxt.text.clear()
            println(foodList)

        }

    }
}
