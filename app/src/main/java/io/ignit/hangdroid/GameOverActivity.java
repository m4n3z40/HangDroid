package io.ignit.hangdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        int points = getIntent().getIntExtra("points", 0);

        TextView txtpoints = (TextView) findViewById(R.id.txtPoints);
        txtpoints.setText("" + points);
    }

    public void saveScore(View view) {

    }
}
