package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.jokeactivity.JokeActivity;
import com.udacity.gradle.builditibigger.backend.myApi.MyApi;
import com.udacity.gradle.builditibigger.backend.myApi.model.MyBean;

import java.io.IOException;

/**
 * @author Prateesh Goswami
 * @version 1.0
 * @date 5/25/2016
 */
public class EndPointAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi myApiService = null;
    private Context context;

    public EndPointAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if (myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                                        new AndroidJsonFactory(), null)
                                        .setRootUrl("https://tactile-anthem-132323.appspot.com/_ah/api/");
                        myApiService = builder.build();
                    }
                try {
                        return myApiService.sendJoke(new MyBean()).execute().getJoke();
                    } catch (IOException e) {
                        return e.getMessage();
                    }
            }

                @Override
        protected void onPostExecute(String result) {
                    Log.d("Test jokes :",result);
                Intent intent = new Intent(context, JokeActivity.class);
                intent.putExtra("joke", result);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
    }