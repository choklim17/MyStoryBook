package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page8 extends AppCompatActivity {

    private TextView txtCaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        // Initialize TextView
        txtCaption = findViewById(R.id.txtCaption);

        // Sets the caption
        String caption = "Eat -> Dota -> Sleep -> Repeat";
        txtCaption.setText(caption);
    }

    // onClick Handler for navigating to the previous page
    public void goToSeventhPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page7.class);
    }

    // onClick Handler for navigating to the next page
    public void goToNinthPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page9.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page7.class);
    }
}