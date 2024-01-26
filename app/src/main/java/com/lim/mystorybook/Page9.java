package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page9 extends AppCompatActivity {

    private TextView txtDegreeDet, txtWebAppDet, txtMobileAppDet, txtSoftwareDevDet, txtContLearningDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);

        // Initialize TextViews
        txtDegreeDet = findViewById(R.id.txtDegreeDet);
        txtWebAppDet = findViewById(R.id.txtWebAppDet);
        txtMobileAppDet = findViewById(R.id.txtMobileAppDet);
        txtSoftwareDevDet = findViewById(R.id.txtSoftwareDevDet);
        txtContLearningDet = findViewById(R.id.txtContLearningDet);

        // Sets the text for Goal-Degree
        String degreeGoal = "I am dedicated to acquiring a strong foundation in computer science and technology, focusing on Mobile and Web App development, " +
                "throughout my academic journey in the BSIT program.";
        txtDegreeDet.setText(degreeGoal);

        // Sets the text for Goal-Web Application
        String webAppGoal = "I aim to create a comprehensive web application, showcasing my proficiency in both front-end and back-end development.";
        txtWebAppDet.setText(webAppGoal);

        // Sets the text for Goal-Mobile Application
        String mobileAppGoal = "I aspire to design and implement a feature-rich mobile application, demonstrating my skills in mobile app development.";
        txtMobileAppDet.setText(mobileAppGoal);

        // Sets the text for Goal-Land a Software Dev Job
        String softwareDevGoal = "My ultimate goal is to contribute to the tech industry by securing a rewarding position as a Software Developer. I am eager to " +
                "apply my knowledge, collaborate with diverse teams, and contribute to impactful projects.";
        txtSoftwareDevDet.setText(softwareDevGoal);

        // Sets the text for Goal-Continuous Learning
        String contLearningGoal = "Beyond formal education, I am committed to continuous learning. I plan to stay updated with the latest technologies, " +
                "frameworks, and industry best practices.";
        txtContLearningDet.setText(contLearningGoal);
    }

    // onClick Handler for navigating to the previous page
    public void goToEightPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page8.class);
    }

    // onClick Handler for navigating to the next page
    public void goToTenthPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page10.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page8.class);
    }
}