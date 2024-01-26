package com.lim.mystorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page7 extends AppCompatActivity {

    private TextView txtProjectsIntroduction, txtJavaProjects, txtHTMLProjects, txtAndroidProjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        // Initialize TextViews
        txtProjectsIntroduction = findViewById(R.id.txtProjectsIntroduction);
        txtJavaProjects = findViewById(R.id.txtJavaProjects);
        txtHTMLProjects = findViewById(R.id.txtHTMLProjects);
        txtAndroidProjects = findViewById(R.id.txtAndroidProjects);

        String projectsIntroduction = "Embark on a virtual tour of my coding escapades—it's a colorful canvas filled with Java wonders, HTML and CSS magic, and the " +
                "buzzing realm of Android development! \uD83D\uDE80\uD83D\uDCBB";
        txtProjectsIntroduction.setText(projectsIntroduction);

        // Set the Java Projects
        String javaProjects = "- Banking System (Java Swing)\n" +
                                "- TicTacToe Game (Java Swing)\n" +
                                "- Snake Game (Java Swing)\n" +
                                "- Alarm Clock (Java Swing)\n" +
                                "- Stopwatch (Java Swing)\n" +
                                "- Text Editor (Java Swing)";
        txtJavaProjects.setText(javaProjects);

        // Set the HTML and CSS Projects
        String htmlProjects = "- Online Resume\n" +
                                "- Tribute Page\n" +
                                "- Landing Page";
        txtHTMLProjects.setText(htmlProjects);

        // Set the Android Projects
        String androidProjects = "- My Story Book App\n" +
                                    "- My Library App (Still in Progress)";
        txtAndroidProjects.setText(androidProjects);

    }

    // onClick Handler for navigating to the previous page
    public void goToSixthPage(View view) {
        // Use the ActivityHelper method to start a new activity and finish the current one
        ActivityHelper.startNewActivityAndFinish(this, Page6.class);
    }

    // onClick Handler for navigating to the next page
    public void goToEightPage(View view) {
        ActivityHelper.startNewActivityAndFinish(this, Page8.class);
    }

    // onBackPressed method for navigating to the previous page
    public void onBackPressed() {
        ActivityHelper.startNewActivityAndFinish(this, Page6.class);
    }
}