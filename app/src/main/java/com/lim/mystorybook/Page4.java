package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Page4 extends AppCompatActivity {

    private TextView txtEducationStory;
    private ImageView imgDonBosco, imgNationalU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        // Initialize TextView
        txtEducationStory = findViewById(R.id.txtEducationStory);

        // Initialize ImageViews
        imgDonBosco = findViewById(R.id.imgDonBosco);
        imgNationalU = findViewById(R.id.imgNationalU);

        // Sets Education Background Story
        String educationStory = "Let me take you on a quick tour of my educational journey—it's been quite the adventure! \uD83C\uDF93 Back in the good ol' days of " +
                "elementary and high school, I called Don Bosco Technical College in Mandaluyong City my second home. The twist? Our high school was a dual curriculum " +
                "wonderland, juggling both general education and technical subjects. Picture this: I dived into the intricacies of Mechanical Technology during my later " +
                "years, which led to not one, but two diplomas at graduation—talk about a double win! \uD83C\uDFC6✨\n" +
                "\n" +
                "Fast forward to college, and I initially embraced the world of Civil Engineering at National University Manila. Now, here's where the plot thickens: " +
                "after three years of equations and structures, I made a math-savvy pivot. The result? A shift to BS IT with a cool twist—specializing in " +
                "Mobile and Web Applications. It's been a ride, and I'm loving every bit of this tech-infused journey! \uD83D\uDCBB\uD83D\uDE80 The reason behind " +
                "the shift? Let's just say, the math in Civil Engineering was a formidable opponent!";
        txtEducationStory.setText(educationStory);

        // Sets onClick Listener for the ImageView
        imgDonBosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use the ActivityHelper method to open a URI in the browser
                ActivityHelper.openUriInBrowser(Page4.this, "https://dbmanda.one-bosco.org/");
            }
        });

        imgNationalU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityHelper.openUriInBrowser(Page4.this, "https://national-u.edu.ph/nu-manila/");
            }
        });
    }

    // onClick Handler for navigating to the previous page
    public void goToThirdPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page3.class);
    }

    // onClick Handler for navigating to the next page
    public void goToFifthPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page5.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page3.class);
    }

}