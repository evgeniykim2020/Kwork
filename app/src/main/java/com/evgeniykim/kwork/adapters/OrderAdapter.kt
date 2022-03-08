package com.evgeniykim.kwork.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgeniykim.kwork.databinding.OrderItemBinding
import com.evgeniykim.kwork.models.OrdersModels
import java.util.*

class OrderAdapter(var orderList: ArrayList<OrdersModels>) : RecyclerView.Adapter<OrderAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderAdapter.MyViewHolder {
        val binding = OrderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderAdapter.MyViewHolder, position: Int) {
        val orders = orderList[position]

        holder.binding.loginText.text = orders.name
        holder.binding.dateText.text = orders.date.toString()
        holder.binding.orderDescription.text = orders.desc
        holder.binding.priceText.text = orders.price
        holder.itemView.setOnClickListener {
            val uri = Uri.parse("https://www.kwork.ru/")
            holder.itemView.context.startActivity(Intent(Intent.ACTION_VIEW, uri))
        }

    }

    override fun getItemCount(): Int = orderList.size

    inner class MyViewHolder(val binding: OrderItemBinding): RecyclerView.ViewHolder(binding.root)
}