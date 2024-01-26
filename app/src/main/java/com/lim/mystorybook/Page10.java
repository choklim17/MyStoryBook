package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Page10 extends AppCompatActivity {

    private ImageView imgGHProfile, imgLinkedIn, imgGmail, imgSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);

        // Initialize ImageViews
        imgGHProfile = findViewById(R.id.imgGHProfile);
        imgLinkedIn = findViewById(R.id.imgLinkedIn);
        imgGmail = findViewById(R.id.imgGmail);
        imgSMS = findViewById(R.id.imgSMS);

        // Sets onClick Listener for GitHub image
        imgGHProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use the ActivityHelper method to open a URI in the browser
                ActivityHelper.openUriInBrowser(Page10.this, "https://github.com/choklim17");
            }
        });

        // Sets onClick Listener for LinkedIn image
        imgLinkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityHelper.openUriInBrowser(Page10.this, "https://www.linkedin.com/in/christopher-angelo-lim-1697681b8/");
            }
        });

        // Sets onClick Listener for Gmail image
        imgGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("mailto:limchok14@gmail.com");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);
            }
        });

        // Sets onClick Listener for SMS image
        imgSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:0967182782");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
    }

    // onClick Handler for navigating to the previous page
    public void goToNinthPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page9.class);
    }

    // onClick Handler for navigating to the next page
    public void goToEleventhPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page11.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page9.class);
    }
}