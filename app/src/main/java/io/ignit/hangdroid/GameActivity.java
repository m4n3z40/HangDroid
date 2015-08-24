package io.ignit.hangdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    String correctWord = "word";
    String guessedLetters = "";
    int fails = 0;
    int successes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void introduceLetter(View view) {
        EditText edtLetter = (EditText)findViewById(R.id.edtLetter);

        String letter = edtLetter.getText().toString().trim().toLowerCase();

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
        clearScreen();
    }

    public void clearScreen() {
        fails = 0;
        successes = 0;
        guessedLetters = "";

        ImageView imgHanger = (ImageView) findViewById(R.id.imgHanger);
        imgHanger.setImageResource(getImgId());

        TextView txtErrors = (TextView) findViewById(R.id.txtErrors);
        txtErrors.setText("");

        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        for(int i = 0; i < layoutLetters.getChildCount(); i++) {
            TextView txtLetter = (TextView) layoutLetters.getChildAt(i);

            txtLetter.setText("_");
        }
    }

    public void showLetterAtIndex(int index, char letter) {
        LinearLayout layoutLetters = (LinearLayout) findViewById(R.id.layoutLetters);
        TextView txtLetter = (TextView) layoutLetters.getChildAt(index);

        txtLetter.setText(("" + letter).toUpperCase());
    }

    public void failedLetter(char letter) {
        fails++;

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
            case 6:
                return R.drawable.game_over;
            default:
                return R.drawable.hangdroid_0;
        }
    }

}
