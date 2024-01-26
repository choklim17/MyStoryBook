package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
    }

    // onClick Handler for navigating to the previous page
    public void goToFifthPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page5.class);
    }

    // onClick Handler for navigating to the next page
    public void goToSeventhPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page7.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page5.class);
    }
}