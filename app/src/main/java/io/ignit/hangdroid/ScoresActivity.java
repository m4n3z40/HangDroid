package io.ignit.hangdroid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        SharedPreferences preferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);
        String scores = preferences.getString("scores", "NO SCORES");

        TextView txtScores = (TextView) findViewById(R.id.txtScores);
        txtScores.setText(scores);
    }
}
