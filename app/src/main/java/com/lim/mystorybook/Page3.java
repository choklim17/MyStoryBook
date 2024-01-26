package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    private TextView txtPersonalStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Initialize TextView
        txtPersonalStory = findViewById(R.id.txtPersonalStory);

        // Sets Personal Information Story
        String personalInfromationStory = "Hey there! I'm Christopher Angelo Lim, but most people call me Chok—it's got a nice ring to it! \uD83C\uDF1F " +
                "I made my debut into this world on November 25, right in the heart of San Juan City, Philippines. Yep, that's where I've been soaking in the city " +
                "vibes ever since. I'm proudly Filipino, even if my last name might suggest otherwise—trust me, it happens a lot! \uD83D\uDE04 Now, about my educational " +
                "journey... well, let's save that tale for another day! Stay tuned! \uD83D\uDCDA\uD83D\uDE80";

        txtPersonalStory.setText(personalInfromationStory);
    }

    // onClick Handler for navigating to the previous page
    public void goToSecondPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page2.class);
    }

    // onClick Handler for navigating to the next page
    public void goToFourthPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page4.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page2.class);
    }
}