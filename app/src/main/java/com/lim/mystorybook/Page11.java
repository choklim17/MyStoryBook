package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page11 extends AppCompatActivity {

    private TextView txtCredits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);

        // Initialize TextViews
        txtCredits = findViewById(R.id.txtCredits);

        // Set the credit message
        String creditMessage = "In creating this Personal Portfolio app, I would like to give credit to the sources that have contributed to its visual appeal. " +
                "Special thanks to the creators of the images used in this app, sourced from the internet. Additionally, links to certain websites have been included " +
                "for reference. It's important to note that this app is developed for educational purposes as part of an assignment, and no copyright infringement is " +
                "intended. All credits are given to the original creators, and this app is not intended for professional use.";
        txtCredits.setText(creditMessage);
    }

    // onClick Handler for navigating to the previous page
    public void goToTenthPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page10.class);
    }

    // onClick Handler for navigating to the next page
    public void exitApp(View view) {
        finish();
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page10.class);
    }
}