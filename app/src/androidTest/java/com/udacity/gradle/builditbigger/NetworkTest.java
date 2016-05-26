package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * @author Prateesh Goswami
 * @version 1.0
 * @date 5/25/2016
 */
public class NetworkTest extends AndroidTestCase {

    public void runNetworkTest(){
        String joke = null;
        EndPointAsyncTask endPointAsyncTask = new EndPointAsyncTask(getContext());
        endPointAsyncTask.execute();
        try {
            joke =endPointAsyncTask.get();
            Log.d("Test  :","Retrieve a non-empty string successfully" +joke);
        }catch (Exception e){
            e.printStackTrace();
        }
        assertNotNull(joke);
    }
}
