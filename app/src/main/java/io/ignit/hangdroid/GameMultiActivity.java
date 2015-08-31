package io.ignit.hangdroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameMultiActivity extends AppCompatActivity {

    String correctWord = "";
    String guessedLetters = "";
    int fails = 0;
    int successes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_multi);

        correctWord = getIntent().getStringExtra("word").toUpperCase();
        createLettersTextViews(correctWord);
    }

    public void createLettersTextViews(String word) {
        LinearLayout lettersLayout = (LinearLayout) findViewById(R.id.layoutLetters);

        for (int i = 0; i < word.length(); i++) {
            TextView txtLetter = (TextView) getLayoutInflater().inflate(R.layout.text_view_letter, null);

            lettersLayout.addView(txtLetter);
        }
    }

    public void introduceLetter(View view) {
        EditText edtLetter = (EditText)findViewById(R.id.edtLetter);

        String letter = edtLetter.getText().toString().trim().toUpperCase();

        if (letter.length() > 0) {
            checkLetter(letter);
            edtLetter.setText("");
        } else {
            Toast.makeText(this, "Please enter a letter", Toast.LENGTH_SHORT).show();
        }
    }

    public void checkLetter(String introducedLetter) {
        if (guessedLetters.contains(introducedLetter)) {
            Toast.makeText(this, "You already tried this letter.", Toast.LENGTH_SHORT).show();
        } else {
            tryLetter(introducedLetter.charAt(0));
        }
    }

    public void tryLetter(char letter) {
        int wordLength = correctWord.length();
        boolean foundLetter = false;

        guessedLetters += letter;

        for (int i = 0; i < wordLength; i++) {
            char correctLetter = correctWord.charAt(i);

            if (correctLetter == letter) {
                Log.d("DEBUG", "There was a match: " + letter);

                foundLetter = true;
                successes++;
                
                showLetterAtIndex(i, letter);
            }
        }

        if (!foundLetter) {
            failedLetter(letter);
        }
        
        if (successes == wordLength) {
            gameOverWin();
        }
    }

    public void gameOverWin() {
        finish();
    }

    public void gameOverLose() {
        Intent gameOverIntent = new Intent(this, GameOverActivity.class);

        gameOverIntent.putExtra("points", 0);

        startActivity(gameOverIntent);

        finish();
    }

    public void showLetterAtIndex(int index, char letter) {
        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        TextView txtLetter = (TextView) layoutLetters.getChildAt(index);

        txtLetter.setText(("" + letter).toUpperCase());
    }

    public void failedLetter(char letter) {
        fails++;

        if (fails >= 6) {
            gameOverLose();
        }

        TextView txtErrors = (TextView) findViewById(R.id.txtErrors);
        String sErrors = txtErrors.getText().toString();
        txtErrors.setText(sErrors + letter);

        ImageView imgHanger = (ImageView) findViewById(R.id.imgHanger);
        imgHanger.setImageResource(getImgId());
    }

    private int getImgId() {
        switch (fails) {
            case 1:
                return R.drawable.hangdroid_1;
            case 2:
                return R.drawable.hangdroid_2;
            case 3:
                return R.drawable.hangdroid_3;
            case 4:
                return R.drawable.hangdroid_4;
            case 5:
                return R.drawable.hangdroid_5;
            default:
                return R.drawable.hangdroid_0;
        }
    }

}
