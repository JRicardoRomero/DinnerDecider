package com.rommultimedia.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonald's","Mexican")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            var currentFood = selectedFoodTxt.text.toString()

            var random= Random()
            var randomFood = random.nextInt(foodList.count())
            if (currentFood == foodList[randomFood]){
                randomFood = random.nextInt(foodList.count())
                selectedFoodTxt.text = foodList[randomFood]
            } else {
                selectedFoodTxt.text = foodList[randomFood]
            }

        }
        addFoodBtn.setOnClickListener {
            if(addFoodTxt.text.toString()==""){
                Toast.makeText(this,"Please enter a new food",Toast.LENGTH_SHORT).show()
            } else {
                var newFood = addFoodTxt.text.toString()
                foodList.add(newFood)
                addFoodTxt.text.clear()
                println(foodList)
            }

        }
    }
}
