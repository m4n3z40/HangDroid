package io.ignit.hangdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MultiplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);
    }

    public void startMultiplayerGame(View view) {
        EditText edtWord = (EditText) findViewById(R.id.edtWord);

        Intent multiGameIntent = new Intent(this, GameMultiActivity.class);
        multiGameIntent.putExtra("word", edtWord.getText().toString());

        edtWord.setText("");

        startActivity(multiGameIntent);
    }
}
