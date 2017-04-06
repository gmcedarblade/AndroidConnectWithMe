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

    }

}
