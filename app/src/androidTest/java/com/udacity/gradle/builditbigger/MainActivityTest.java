package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Akın DEMİR on 24.07.2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends ApplicationTestCase<Application>{

    private Context mContext = null;
    private String mJokeText= null;
    private Exception mError = null;
    private CountDownLatch mSignal = null;

    public MainActivityTest(){
        super(Application.class);
    }

    @Before
    public void setup() {
        mContext = InstrumentationRegistry.getContext();
        // countDown() gets called only 1(param)
        mSignal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        mSignal.countDown();
    }

    @Test
    public void testAsyncTaskWorks() throws Throwable{

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setListener(new EndpointsAsyncTask.EndpointsTaskListener() {
            @Override
            public void onDone(String result, Exception e) {
                mJokeText = result;
                mError = e;
            }
        }).execute(mContext);

        mSignal.await(5, TimeUnit.SECONDS);

        assertNull(mError);
        assertFalse(TextUtils.isEmpty(mJokeText));
    }

}