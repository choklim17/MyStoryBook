package com.lim.mystorybook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class ActivityHelper {

    // Starts a new Activity and finishes the current activity
    public static void startNewActivityAndFinish(Activity currentActivity, Class<?> targetActivityClass) {
        // Create an intent to start the target activity
        Intent intent = new Intent(currentActivity, targetActivityClass);

        // Start the target activity
        currentActivity.startActivity(intent);

        // Finish the current activity
        currentActivity.finish();
    }

    // Opens a URI in the default browser
    public static void openUriInBrowser(Activity activity, String urlString) {
        // Parse the URL string into a Uri object
        Uri uri = Uri.parse(urlString);

        // Create an intent to view the URI in the browser
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        // Start the browser activity
        activity.startActivity(intent);
    }
}
