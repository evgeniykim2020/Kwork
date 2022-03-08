package com.evgeniykim.kwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.evgeniykim.kwork.adapters.OrderAdapter
import com.evgeniykim.kwork.databinding.FragmentFirstBinding
import com.evgeniykim.kwork.models.OrdersModels
import com.evgeniykim.kwork.mvvm.OrdersFactory
import com.evgeniykim.kwork.mvvm.OrdersViewModel
import com.evgeniykim.kwork.utils.buttons.BottomButtons
import com.evgeniykim.kwork.utils.buttons.BuyerSellerButtons
import com.evgeniykim.kwork.utils.buttons.ProcessButtons
import com.evgeniykim.kwork.utils.innerorders.ComingOrders
import kotlinx.android.synthetic.main.bottom_bar.*
import kotlinx.android.synthetic.main.filter.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.upper_bar.*
import kotlinx.android.synthetic.main.upper_bar_2.*
import java.util.*

class FirstFragment : Fragment() {

    private lateinit var RV: RecyclerView
    private lateinit var adapter: OrderAdapter
    private var ordersList = ArrayList<OrdersModels>()
    private lateinit var viewModel: OrdersViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentFirstBinding.inflate(inflater, container, false)
        RV = binding.ordersRecyclerview
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewModel()
        activateButtons()
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProvider(this, OrdersFactory()).get(OrdersViewModel::class.java)
        viewModel.orders.observe(viewLifecycleOwner, {
            ordersList = viewModel.orders.value!!
            setUpAdapter()
        })
    }

    private fun setUpAdapter() {
        RV.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        adapter = OrderAdapter(ordersList)
        RV.adapter = adapter
    }

    private fun activateButtons() {

        val buyerSellerButton = BuyerSellerButtons()
        buyerSellerButton.click(upper_bar, upper_bar_2, arrow_up_down,
            check_1, check_2, i_buyer, i_seller, buyer_seller_text)

        val bottomButtons = BottomButtons(requireContext())
        bottomButtons.click(bottom_button_1, bottom_button_2, bottom_button_3, bottom_button_4, bottom_button_5,
            bottom_image_1, bottom_text_1, bottom_image_2, bottom_text_2, bottom_image_3, bottom_text_3, bottom_image_4,
            bottom_text_4, bottom_image_5, bottom_text_5,)

        val processButtons = ProcessButtons(requireContext())
        processButtons.click(filter_button_1, filter_button_2, filter_button_3)
    }
}