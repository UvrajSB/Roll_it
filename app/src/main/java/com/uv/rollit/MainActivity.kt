package com.uv.rollit

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //instantiating global object of toast
        var toast: Toast? = null


        //Creating the reference for the UI elements (aka views) present in activity_main.xml
        val rollButton = findViewById<Button>(R.id.roll_btn_main)
        val diceImage = findViewById<ImageView>(R.id.dice_img_view_main)

        //The code inside the setOnClickListener will be executed when the roll button is clicked
        rollButton.setOnClickListener {
            //storing the random number obtained by roll function in currentNum variable
            val currentNum = roll()
            /*Using the when statement to get the image resource corresponding to the value
             passed in form of *currentNum* variable, and storing that value in *imageSource* variable
             */
            val imageSource = when(currentNum){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.roll_dice_logo_with_text
            }
            // set the image source
            diceImage.setImageResource(imageSource)
            // toast is a simple message displayed on the screen when you click the roll button
            toast?.cancel() //to cancel the previous toast
            toast = Toast.makeText(this, "You got the number ${currentNum} !!", Toast.LENGTH_SHORT)
            toast?.show()

        }
    }

    // roll function returns a random number between 1 to 6 everytime it is called
    private fun roll():Int{
        return (1..6).random()
    }
}