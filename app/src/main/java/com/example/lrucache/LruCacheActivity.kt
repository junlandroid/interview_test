package com.example.lrucache

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.LruCache
import com.example.R

/**
 * @date:2019/3/20
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class LruCacheActivity :AppCompatActivity(){
    private val mCacheSize: Int = 0

    private var mCache: LruCache<String,Bitmap>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lrucache_activity_layout)


    }
}