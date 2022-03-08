package com.evgeniykim.kwork.utils.buttons

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.evgeniykim.kwork.R

class BuyerSellerButtons {

    private var clicked = false

    fun click(view1 : View, view2: View, imageView: ImageView, check1: ImageView,
              check2: ImageView, buyer: TextView, seller: TextView, buyerSellerText: TextView
    ) {
        view1.setOnClickListener {
            if (!clicked) {
                view2.visibility = View.VISIBLE
                imageView.setImageResource(R.drawable.arrow_up)
                clicked = true
            } else {
                view2.visibility = View.GONE
                imageView.setImageResource(R.drawable.arrow_down)
                clicked = false
            }
        }

        buyer.setOnClickListener {
            check1.visibility = View.VISIBLE
            check2.visibility = View.INVISIBLE
            buyerSellerText.text = "Я покупатель"
            view2.visibility = View.GONE
            imageView.setImageResource(R.drawable.arrow_down)
        }

        seller.setOnClickListener {
            check1.visibility = View.INVISIBLE
            check2.visibility = View.VISIBLE
            buyerSellerText.text = "Я продавец"
            view2.visibility = View.GONE
            imageView.setImageResource(R.drawable.arrow_down)
        }
    }
}