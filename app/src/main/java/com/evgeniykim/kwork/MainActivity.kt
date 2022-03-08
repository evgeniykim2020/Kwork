package com.evgeniykim.kwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

private val fragmentFirst = FirstFragment()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) setupFragment(fragmentFirst)

    }

    private fun setupFragment(fragment: Fragment) {
        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.frag_container, fragment)
        frag.commit()
    }
}