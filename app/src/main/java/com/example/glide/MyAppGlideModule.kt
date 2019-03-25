package com.example.glide

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

/**
 * @date:2019/3/22
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
@GlideModule
class MyAppGlideModule :AppGlideModule() {
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        // 配置Glide

        // Glide v4 默认的 DecodeFormat 改回 DecodeFormat.PREFER_RGB_565
        builder.setDefaultRequestOptions(RequestOptions().format(DecodeFormat.PREFER_RGB_565))
        var calculator = MemorySizeCalculator.Builder(context)
            .setMemoryCacheScreens(2F)
            .build()
        builder.setMemoryCache(LruResourceCache(calculator.memoryCacheSize.toLong()))
    }
}