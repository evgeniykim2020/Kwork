package com.evgeniykim.kwork.utils.buttons

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.evgeniykim.kwork.R

class BottomButtons(private val context: Context) {

    private val TAG = "BottomButtons"

    fun click(
        layout1: LinearLayout,
        layout2: LinearLayout,
        layout3: LinearLayout,
        layout4: LinearLayout,
        layout5: LinearLayout,
        icon1: ImageView,
        text1: TextView,
        icon2: ImageView,
        text2: TextView,
        icon3: ImageView,
        text3: TextView,
        icon4: ImageView,
        text4: TextView,
        icon5: ImageView,
        text5: TextView,
    ) {

        layout1.setOnClickListener {
            Log.e(TAG, "1st button clicked")
            clickedColors(icon1, text1)
            unClickedColors(icon2, text2)
            unClickedColors(icon3, text3)
            unClickedColors(icon4, text4)
            unClickedColors(icon5, text5)
        }
        layout2.setOnClickListener {
            clickedColors(icon2, text2)
            unClickedColors(icon1, text1)
            unClickedColors(icon5, text5)
            unClickedColors(icon3, text3)
            unClickedColors(icon4, text4)
        }
        layout3.setOnClickListener {
            clickedColors(icon3, text3)
            unClickedColors(icon1, text1)
            unClickedColors(icon2, text2)
            unClickedColors(icon5, text5)
            unClickedColors(icon4, text4)
        }
        layout4.setOnClickListener {
            clickedColors(icon4, text4)
            unClickedColors(icon1, text1)
            unClickedColors(icon2, text2)
            unClickedColors(icon3, text3)
            unClickedColors(icon5, text5)
        }
        layout5.setOnClickListener {
            clickedColors(icon5, text5)
            unClickedColors(icon1, text1)
            unClickedColors(icon2, text2)
            unClickedColors(icon3, text3)
            unClickedColors(icon4, text4)
        }

    }


    private fun clickedColors(imageView: ImageView, textView: TextView) {
        imageView.setColorFilter(context.resources.getColor(R.color.dark_grey))
        textView.setTextColor(context.resources.getColor(R.color.dark_grey))
    }

    private fun unClickedColors(imageView: ImageView, textView: TextView) {
        imageView.setColorFilter(context.resources.getColor(R.color.mid_grey))
        textView.setTextColor(context.resources.getColor(R.color.mid_grey))
    }

}