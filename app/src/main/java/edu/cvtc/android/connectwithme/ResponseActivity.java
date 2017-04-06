package edu.cvtc.android.connectwithme;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Greg on 4/6/2017.
 */

public class ResponseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Log.d("connect_with_me", "ResponseActivity created...");

        // Setting the View for this Controller
        setContentView(R.layout.activity_response);

        final TextView responseTextView = (TextView) findViewById(R.id.responseTextView);

        final Bundle bundle = getIntent().getExtras();

        if (null == bundle) {
            responseTextView.setText("Error: Bundle was null!");
        } else {
            final String firstName = bundle.getString("firstName");
            final String lastName = bundle.getString("lastName");
            final String email = bundle.getString("email");

            if (null == firstName || firstName.isEmpty()
                    || null == lastName || lastName.isEmpty()
                    || null == email || email.isEmpty()) {
                responseTextView.setText("Error: Missing information!");
            } else {

                responseTextView.setText("Hello " + firstName + " " + lastName + "! Thank you for " +
                        "connecting with me! You can expect an email from me soon at " + email + ".");

            }

        }

    }

}
