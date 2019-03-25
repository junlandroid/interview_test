package com.example.handler;

import android.os.*;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.MainActivity;
import com.example.R;
import com.example.async.MyAsyncTask;

/**
 * @date:2019/3/25
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
public class HandlerAcitivity extends AppCompatActivity {

    public static final int MSG_WHAT = 0x0001;
    private static final int ARG1 = 11;
    private static final int ARG2 = 22;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);


        MyAsyncTask task = new MyAsyncTask();
        task.execute("Hello");



        sendMsg2MainThread();
    }

    private void sendMsg2MainThread() {
//        new Thread(){
//            @Override
//            public void run() {
//                Message m = mHandler.obtainMessage(MSG_WHAT, ARG1, ARG2, new Student());
//                mHandler.sendMessage(m);
//            }
//        }.start();

        Thread thread = new Thread() {
            @Override
            public void run() {

                Looper.prepare();

                MyHandler handler = new MyHandler(HandlerAcitivity.this);
                try {
                    Thread.sleep(10*1000);
                    Message message = new Message();
                    message.what = MSG_WHAT;
                    message.obj = "hello world";
                    handler.sendMessage(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Looper.loop();
            }
        };

        try {
            thread.join();
            thread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
