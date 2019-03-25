package com.example

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.bumptech.glide.load.model.GlideUrl

/**
 * @date:2019/3/20
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class Test(private val mUrl: String) : GlideUrl(mUrl) {

    override fun getCacheKey(): String {
        return mUrl.replace("", "")
    }
}
