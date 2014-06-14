package com.fly1tkg.wercker.app;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.fly1tkg.wercker.app.MainActivity;
import com.flytkg.wercker.app.R;

/**
 * Created by tkg on 2014/06/11.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.fly1tkg.wercker.app", MainActivity.class);
    }


    public void testWelcomeText() {
        MainActivity activity;
        activity = (MainActivity) getActivity();

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.introText);
        assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        assertNotNull(introText);

        assertTrue("Check intro text", introText.equals("Hello universe!"));
    }
}