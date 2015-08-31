package io.ignit.hangdroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    int totalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        int points = getIntent().getIntExtra("points", 0);
        totalPoints = points;

        TextView txtpoints = (TextView) findViewById(R.id.txtPoints);
        txtpoints.setText("" + points);
    }

    public void saveScore(View view) {
        SharedPreferences preferences = getSharedPreferences("preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String lastScores = preferences.getString("scores", "");

        EditText edtName = (EditText) findViewById(R.id.edtName);
        String name = edtName.getText().toString();

        editor.putString("scores", name + " " + totalPoints + " POINTS\n" + lastScores);

        editor.apply();

        finish();
    }
}
