package com.example.glide

import com.bumptech.glide.load.model.GlideUrl

/**
 * @date:2019/3/22
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class MyGlideUrl(private val mUrl:String) : GlideUrl(mUrl) {
    override fun getCacheKey(): String {
        return mUrl.replace("","")
    }
}