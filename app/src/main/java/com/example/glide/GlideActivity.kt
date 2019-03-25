package com.example.glide

import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.Priority
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.R

/**
 * @date:2019/3/21
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class GlideActivity : AppCompatActivity() {

    companion object {
        const val URL:String = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1553135678761&di=31d14e5c1888d075609d689c3071eee3&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2F00bc8151242c7d2460d0b7d4b913c6ed97f957cc158f9-SXd0Yk_fw658"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gldie_layout)

        val mImageView1 = findViewById<ImageView>(R.id.imageView1)
        val mImageView2 = findViewById<ImageView>(R.id.imageView2)

        var option1 = RequestOptions()
            .priority(Priority.LOW)
            .placeholder(R.drawable.abc_action_bar_item_background_material)
            .error(R.drawable.abc_ratingbar_material)
            .override(300,200)
            .diskCacheStrategy


        var option2 = RequestOptions()
            .priority(Priority.HIGH)


        GlideApp.with(this)
            .load(URL)
            .centerCrop()
            .transforms(CenterCrop(),RoundedCorners(50))
            .into(mImageView1)



//        Glide.with(this)
//            .applyDefaultRequestOptions(RequestOptions())
//            .load(URL)
//            .into(mImageView1)
//
//        Glide.with(this)
//            .load(MyGlideUrl(URL))
//            .apply(option2)
//            .into(mImageView2)

    }
}