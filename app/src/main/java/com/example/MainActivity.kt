package com.example

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.LruCache
import android.view.View
import android.widget.Button
import com.example.glide.GlideActivity
import com.example.handler.HandlerAcitivity

/**
 * 1.AppCompatActivity()：表示显示的调用了父类的无参构造
 */
open class MainActivity : View.OnClickListener,AppCompatActivity() {


    private var mCache: LruCache<String, Bitmap>? = null

    var name:String? =null

    init {
        print("构造函数初始化")
        // 可以在构造函数中添加一些代码块。
    }

    override fun onClick(view: View?) {
        when (view!!.id) {
//            R.id.btn_skip_glide -> startActivity(Intent(this,GlideActivity::class.java))
            R.id.btn_skip_glide -> startActivity(Intent(this,HandlerAcitivity::class.java))
        }
    }



    private val mCacheSize: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.textview).setOnClickListener(this)

        findViewById<Button>(R.id.btn_skip_glide).setOnClickListener(this)


        mCache = object : LruCache<String,Bitmap>(mCacheSize){
            override fun sizeOf(key: String?, value: Bitmap?): Int {
                return value!!.byteCount
            }
        }
    }
}
