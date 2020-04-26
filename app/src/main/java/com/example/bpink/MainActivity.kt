package com.example.bpink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_view.setOnItemClickListener { _, _, index, _->
            val id = when (index){
                0 -> R.drawable.jisoo
                1 -> R.drawable.rose
                2 -> R.drawable.lisa
                else -> R.drawable.jennie
            }
            iv_image.setImageResource(id)
        }
    }

    fun radioButtonClick(view: View){

        val id = when (view) {
            rb_jisoo    -> R.drawable.jisoo
            rb_jennie   -> R.drawable.jennie
            rb_lisa     -> R.drawable.lisa
            else        -> R.drawable.rose
        }



        iv_image.setImageResource(id)
    }






}
