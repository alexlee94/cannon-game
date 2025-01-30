// MainActivity.java
// MainActivity displays the MainActivityFragment
// "On my honor, I have neither received nor given any unauthorized assistance on this assignment."
// Alex Lee

package com.alexlee.cannongame_lee;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // called when the app first launches
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}