package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the TextView
        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);

        // Set the welcome message
        String welcomeMessage = "Hey there, I'm Christopher, and I'm thrilled to welcome you to my Personal Portfolio! \uD83C\uDF1F Currently on the road to " +
                "a Bachelor's degree in Information Technology, specializing in the exciting realms of Mobile and Web Applications. \uD83C\uDF93 " +
                "Aspiring to be a Software Developer, I'm all about weaving together creative and innovative solutions. Ready to dive in and get to know me better? " +
                "The next page is all yours to explore! \uD83D\uDE80✨";
        txtWelcomeMessage.setText(welcomeMessage);
    }

    // onClick Handler for exit button
    public void exitApp(View view) {
        // Finish the current activity to exit the app
        finish();
    }

    // onClick Handler for navigating to the next page
    public void goToSecondPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page2.class);
    }

    // Implement a double-back-press exit behavior
    int j = 1;
    public void onBackPressed() {
        if (j == 1) {
            j++;
            Toast.makeText(this, "Press the back button again to exit.", Toast.LENGTH_SHORT).show();
        }
        else if (j == 2) {
            finish();
        }
    }
}