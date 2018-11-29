package com.example.jyo05.tdd;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> test = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void init() {
    }

    @Test
    public void AndroidTestCase1() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("clicked")));
    }

    @Test
    public void AndroidTestCase2() {
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")));
    }
}
