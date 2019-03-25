package com.example

import android.graphics.Bitmap
import android.util.LruCache

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * @date:2019/3/19
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class MyHandler : InvocationHandler {

    private var mCache: LruCache<String, Bitmap>? = null

    @Throws(Throwable::class)
    override fun invoke(o: Any, method: Method, objects: Array<Any>): Any? {

        mCache = object : LruCache<String, Bitmap>(5) {
            override fun sizeOf(key: String, value: Bitmap): Int {
                return super.sizeOf(key, value)
            }
        }

        return null
    }
}
