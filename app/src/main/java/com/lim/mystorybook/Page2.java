package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    private TextView txtContents;
    private TextView txtLink;

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        // Initialize the TextViews
        txtContents = findViewById(R.id.txtContents);
        txtLink = findViewById(R.id.txtLink);

        // Initialize the CheckBox
        checkBox = findViewById(R.id.checkBox);

        // Set the terms and conditions
        String termsAndConditions = "By accessing and using this Personal Portfolio app, you agree to the following terms and conditions:\n\n" +
                "1. **Data Privacy:** This app contains personal information, and your use of the app acknowledges your understanding and consent.\n\n" +
                "2. **Use of Information:** The personal information shared in this app is for informational purposes only. It will not be shared, sold, or used for any commercial purposes.\n\n" +
                "3. **Accuracy of Information:** Every effort has been made to ensure the accuracy of the information provided. However, I am not liable for any errors or omissions.\n\n" +
                "4. **Respectful Use:** Please use this app respectfully and refrain from any inappropriate or malicious activities.\n\n" +
                "Additionally:\n" +
                "This app is not intended for professional use. Some information has been redacted/shortened for privacy.\n" +
                "\nThank you for your understanding.";
        txtContents.setText(termsAndConditions);

        txtLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use the ActivityHelper method to open a URI in the browser
                ActivityHelper.openUriInBrowser(Page2.this, "https://privacy.gov.ph/data-privacy-act/");
            }
        });

    }

    // onClick Handler to return to the home page
    public void goToHomePage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, MainActivity.class);
    }

    // onClick Handler for navigating to the next page
    public void goToThirdPage(View view) {
        // Check if the checkbox is checked
        if (checkBox.isChecked()) {
            // If checked, start a new activity (Page3) and finish the current activity
            ActivityHelper.startNewActivityAndFinish(this, Page3.class);
        }
        else {
            // If not checked, show a toast message indicating the need to agree to terms and conditions
            Toast.makeText(this, "Please agree to the terms and conditions.", Toast.LENGTH_SHORT).show();
        }
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, MainActivity.class);
    }
}