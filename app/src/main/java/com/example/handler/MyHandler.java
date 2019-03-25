package com.example.handler;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import static com.example.handler.HandlerAcitivity.MSG_WHAT;

/**
 * @date:2019/3/25
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
public class MyHandler extends Handler {

    private Context mContext;

    public MyHandler(Context context) {
        mContext = context;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);

        switch (msg.what) {
            case MSG_WHAT:
                Toast.makeText(mContext, (String)msg.obj, Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
