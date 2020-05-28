package com.example.ccc_practice

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = MainAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN)


        dataGenerate()
        hDataGenerate()
        gDataGenerate()
        adapter.updateList(mainList)
        r_view.adapter = adapter
        r_view.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()

    }



//    fun switchLayout(mode:Int){
//        when(mode){
//            1-> r_view.layoutManager = GridLayoutManager(this,2)
//            2-> {
//                val linearLayout = LinearLayoutManager(this)
//                linearLayout.orientation = RecyclerView.HORIZONTAL
//                r_view.layoutManager = linearLayout
//
//            }
//        }
//    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus && Build.VERSION.SDK_INT >=19) {
            getWindow().setStatusBarColor(Color.TRANSPARENT)

            val decorView = getWindow().getDecorView()
            decorView.setSystemUiVisibility(
                //隱藏、收起status bar
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        //收起navigation bar
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        //起初會有沉浸式效果，不過一旦拉了status bar或navigation bar，就回不去了。加了下面這行可以避免此問題，可以無限次自動收起上下兩個bar
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY )
        }
    }
}
