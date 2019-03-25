package com.example

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * @date:2019/3/20
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
class MapService :Service() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}