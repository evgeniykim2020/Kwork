package com.evgeniykim.kwork.utils.buttons

import android.content.Context
import com.evgeniykim.kwork.R
import com.google.android.material.button.MaterialButton

class ProcessButtons(val context: Context) {
    fun click (button1: MaterialButton, button2: MaterialButton, button3: MaterialButton) {
        button1.setOnClickListener {
            buttonClicked(button1)

            buttonNotClicked(button2)
            buttonNotClicked(button3)
        }

        button2.setOnClickListener {
            buttonClicked(button2)

            buttonNotClicked(button1)
            buttonNotClicked(button3)
        }

        button3.setOnClickListener {
            buttonClicked(button3)

            buttonNotClicked(button2)
            buttonNotClicked(button1)
        }
    }

    private fun buttonClicked (button: MaterialButton) {
        button.setTextColor(context.resources.getColor(R.color.white))
        button.setBackgroundColor(context.resources.getColor(R.color.green))
        button.setStrokeColorResource(R.color.green)
    }

    private fun buttonNotClicked (button: MaterialButton) {
        button.setTextColor(context.resources.getColor(R.color.mid_grey))
        button.setBackgroundColor(context.resources.getColor(R.color.white))
        button.setStrokeColorResource(R.color.mid_grey)
    }
}