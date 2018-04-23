package com.subieta.preferencesbuilder.test;

import android.support.v7.app.AppCompatActivity;

import com.subieta.preferencesbuilder.builder.PreferencesBuilder;

/**
 * Created by Kevin Subieta on 4/23/18.
 */

public class MainTestActivity extends AppCompatActivity{


    public void howReadFromPreferences(){
        String valueReadFromPreferences = PreferencesBuilder.build(this, "NAME_PREFERENCES")
                .getString("KEY", "VALUE");
    }

    public void howWriteToPreferences(){
        PreferencesBuilder.build(this, "NAME_PREFERENCES")
                .putString("KEY", "VALUE");
    }

}
