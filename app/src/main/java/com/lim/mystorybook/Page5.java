package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page5 extends AppCompatActivity {

    private TextView txtWorkExpStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        // Initialize TextViews
        txtWorkExpStory = findViewById(R.id.txtWorkExpStory);

        // Set Work Experience Story
        String workExpStory = "\n" +
                "Embark on a stroll through my diverse work experiences—it's been a blend of learning, growing, and sprinkles of joy! \uD83C\uDF1F\uD83D\uDC54 First up, " +
                "imagine me as the upbeat Customer Service Representative in the bustling streets of Pasig City—handling inquiries and spreading positivity like confetti! " +
                "\uD83C\uDF06\uD83D\uDCAC\n" +
                "\n" +
                "Then, hop over to Quezon City, where I traded words for lines as an AutoCAD Operator. Picture me in a symphony of blueprints, turning visions into " +
                "tangible wonders! \uD83D\uDEE0\uFE0F\uD83D\uDCD0 Finally, we land in the vibrant heart of Makati City, where I embraced the art of salesmanship. " +
                "Amidst the skyscrapers, I weaved through pitches and deals with a sprinkle of charm. ✨\uD83D\uDCBC\n" +
                "\n" +
                "Now, a little secret—I've decided to keep the dates under wraps. After all, who says we can't bring a dash of mystery to our professional tales? " +
                "\uD83D\uDE09\uD83D\uDD75\uFE0F\u200D♂\uFE0F";
        txtWorkExpStory.setText(workExpStory);
    }

    // onClick Handler for navigating to the previous page
    public void goToFourthPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page4.class);
    }

    // onClick Handler for navigating to the next page
    public void goToSixthPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page6.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page4.class);
    }
}