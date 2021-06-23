package com.example.test3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test3.R
import com.example.test3.adapters.Adapter
import com.example.test3.models.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mList: ArrayList<News> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init_even()

    }

    private fun init_even(){
        generateData()
        var adapterNews = Adapter(this, mList)
        recycler_view.adapter = adapterNews
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

    private fun generateData() {


        for (i in 1..6) {


            if (i % 2 != 0){
                mList.add(R.drawable)

            } else {
                mList.add(News(" Title", "EVEN  $i"))

            }

        }
    }



}