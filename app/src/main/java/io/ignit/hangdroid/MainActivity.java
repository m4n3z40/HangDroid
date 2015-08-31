package io.ignit.hangdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSinglePlayerGame(View view) {
        Intent gameIntent = new Intent(this, GameActivity.class);

        startActivity(gameIntent);
    }

    public void startMultiplayerGame(View view) {
        Intent multiGameIntent = new Intent(this, MultiplayerActivity.class);

        startActivity(multiGameIntent);
    }

    public void startGameScores(View view) {
        Intent gameScoresActivity = new Intent(this, ScoresActivity.class);

        startActivity(gameScoresActivity);
    }
}
