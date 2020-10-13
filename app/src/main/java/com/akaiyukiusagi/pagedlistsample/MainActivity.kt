package com.akaiyukiusagi.pagedlistsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val adapter = SampleAdapter()
    private val viewModel: SampleViewModel = ViewModelProvider(this).get(SampleViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recyclerViewにlayoutManagerを設定
        recycler_view.layoutManager = LinearLayoutManager(this)

        viewModel.sampleList.observe(this, Observer { adapter.submitList(it) })


    }
}

// 出典：https://developer.android.com/topic/libraries/architecture/paging/ui?hl=ja