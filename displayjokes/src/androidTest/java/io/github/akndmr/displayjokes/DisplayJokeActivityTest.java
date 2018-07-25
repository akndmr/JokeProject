package io.github.akndmr.displayjokes;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

/**
 * Created by Akın DEMİR on 24.07.2018.
 */
@RunWith(AndroidJUnit4.class)
public class DisplayJokeActivityTest {

    @Rule
    public ActivityTestRule<DisplayJokeActivity> mActivityTestRule =
            new ActivityTestRule<>(DisplayJokeActivity.class);

    @Test
    public void testIfNonEmptyStringRetrievedFromAsyncTask() {
        onView(withId(R.id.tv_joke_display)).check(matches(not(withText(""))));
    }
}