package com.example.async;

import android.os.AsyncTask;
import com.example.Student;

/**
 * @date:2019/3/25
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */
public class MyAsyncTask extends AsyncTask<String,Integer, Student> {
    @Override
    protected Student doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Student student) {
        super.onPostExecute(student);
    }

}
