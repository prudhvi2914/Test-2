package com.example.screamitus_android;

import android.support.test.espresso.action.ViewActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    public void testforTestBox(){

        @Rule
        ActivityTestRule<MainActivityTest> mActivityRule =
                new ActivityTestRule<>(MainActivityTest.class);

        @Test
        public void ensureButtonDisableAfterOneClick() {
            onView(withId(R.id.username)).perform(ViewActions.clearText())
                    .perform(ViewActions.typeText(“My Name”),closeSoftKeyboard());
            onView(withId(R.id.login_button)).perform(click());
            onView(withId(R.id.login_button)).check(matches(not(isEnabled())));
        }
    }

}



}