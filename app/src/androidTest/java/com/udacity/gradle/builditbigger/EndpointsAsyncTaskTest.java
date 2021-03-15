package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest  {
    @Test
    public void testAsyncTask () throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask =new EndpointsAsyncTask(new EndpointsAsyncTask.Callback(){
            @Override
            public void onCallFinished(String result) {

            }
        });
        endpointsAsyncTask.execute();
        assertNotNull(endpointsAsyncTask.get());
    }
}
