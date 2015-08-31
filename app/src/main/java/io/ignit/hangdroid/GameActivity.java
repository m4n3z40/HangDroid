package io.ignit.hangdroid;

import android.content.Intent;
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

    String correctWord = "";
    String guessedLetters = "";
    int fails = 0;
    int successes = 0;
    int totalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        setRandomWord();
    }

    public void setRandomWord() {
        String words = "AAHS AALS ABAC ABAS ABBA ABBE ABBS ABED ABET ABID ABLE ABLY ABOS ABRI ABUT ABYE ABYS ACAI ACCA ACED ACER ACES ACHE ACHY ACID ACME ACNE ACRE ACTA ACTS ACYL ADAW ADDS ADDY ADIT ADOS ADRY ADZE AEON AERO AERY AESC AFAR AFFY AFRO AGAR AGAS AGED AGEE AGEN AGER AGES AGHA AGIN AGIO AGLU AGLY AGMA AGOG AGON AGUE AHED AHEM AHIS AHOY AIAS AIDE AIDS AIGA AILS AIMS AINE AINS AIRN AIRS AIRT AIRY AITS AITU AJAR AJEE AKED AKEE AKES AKIN ALAE ALAN ALAP ALAR ALAS ALAY ALBA ALBE ALBS ALCO ALEC ALEE ALEF ALES ALEW ALFA ALFS ALGA ALIF ALIT ALKO ALKY ALLS ALLY ALMA ALME ALMS ALOD ALOE ALOW ALPS ALSO ALTO ALTS ALUM AMAH AMAS AMBO AMEN AMIA AMID AMIE AMIN AMIR AMIS AMLA AMMO AMOK AMPS AMUS AMYL ANAL ANAN ANAS ANCE ANDS ANES ANEW ANGA ANIL ANIS ANKH ANNA ANNO ANNS ANOA ANON ANOW ANSA ANTA ANTE ANTI ANTS ANUS APAY APED APER APES APEX APOD APOS APPS APSE APSO APTS AQUA ARAK ARAR ARBA ARBS ARCH ARCO ARCS ARDS AREA ARED AREG ARES ARET AREW ARFS ARIA ARID ARIL ARIS ARKS ARLE ARMS ARMY ARNA AROW ARPA ARSE ARSY ARTI ARTS ARTY ARUM ARVO ARYL ASAR ASCI ASEA ASHY ASKS ASPS ATAP ATES ATMA ATOC ATOK ATOM ATOP ATUA AUFS AUKS AULA AULD AUNE AUNT AURA AUTO AVAL AVAS AVEL AVER AVES AVID AVOS AVOW AWAY AWDL AWED AWEE AWES AWLS AWNS AWNY AWOL AWRY AXAL AXED AXEL AXES AXIL AXIS AXLE AXON AYAH AYES AYIN AYRE AYUS AZAN AZON AZYM BAAL BAAS BABA BABE BABU BABY BACH BACK BACS BADE BADS BAEL BAFF BAFT BAGH BAGS BAHT BAIL BAIT BAJU BAKE BALD BALE BALK BALL BALM BALS BALU BAMS BANC BAND BANE BANG BANI BANK BANS BANT BAPS BAPU BARB BARD BARE BARF BARK BARM BARN BARP BARS BASE BASH BASK BASS BAST BATE BATH BATS BATT BAUD BAUK BAUR BAWD BAWL BAWN BAWR BAYE BAYS BAYT BEAD BEAK BEAM BEAN BEAR BEAT BEAU BECK BEDE BEDS BEDU BEEF BEEN BEEP BEER BEES BEET BEGO BEGS BEIN BELL BELS BELT BEMA BEND BENE BENI BENJ BENS BENT BERE BERG BERK BERM BEST BETA BETE BETH BETS BEVY BEYS BHAT BHEL BHUT BIAS BIBB BIBS BICE BIDE BIDI BIDS BIEN BIER BIFF BIGA BIGG BIGS BIKE BILE BILK BILL BIMA BIND BINE BING BINK BINS BINT BIOG BIOS BIRD BIRK BIRL BIRO BIRR BISE BISH BISK BIST BITE BITO BITS BITT BIZE BLAB BLAD BLAE BLAG BLAH BLAM BLAT BLAW BLAY BLEB BLED BLEE BLET BLEW BLEY BLIN BLIP BLOB BLOC BLOG BLOT BLOW BLUB BLUE BLUR BOAB BOAK BOAR BOAS BOAT BOBA BOBS BOCK BODE BODS BODY BOEP BOET BOFF BOGS BOGY BOHO BOHS BOIL BOIS BOKE BOKO BOKS BOLA BOLD BOLE BOLL BOLO BOLT BOMA BOMB BONA BOND BONE BONG BONK BONY BOOB BOOH BOOK BOOL BOOM BOON BOOR BOOS BOOT BOPS BORA BORD BORE BORK BORM BORN BORS BORT BOSH BOSK BOSS BOTA BOTH BOTS BOTT BOUK BOUN BOUT BOWL BOWR BOWS BOXY BOYF BOYG BOYO BOYS BOZO BRAD BRAE BRAG BRAK BRAN BRAS BRAT BRAW BRAY BRED BREE BREI BREN BRER BREW BREY BRIE BRIG BRIK BRIM BRIN BRIO BRIS BRIT BROD BROG BROO BROS BROW BRRR BRUS BRUT BRUX BUAT BUBA BUBO BUBS BUBU BUCK BUDA BUDI BUDO BUDS BUFF BUFO BUGS BUHL BUHR BUIK BUKE BULB BULK BULL BUMF BUMP BUMS BUNA BUND BUNG BUNK BUNN BUNS BUNT BUOY BURA BURB BURD BURG BURK BURL BURN BURP BURR BURS BURY BUSH BUSK BUSS BUST BUSY BUTE BUTS BUTT BUYS BUZZ BYDE BYES BYKE BYRE BYRL BYTE CAAS CABA CABS CACA CADE CADI CADS CAFE CAFF CAGE CAGS CAGY CAID CAIN CAKE CAKY CALF CALK CALL CALM CALO CALP CALX CAMA CAME CAMO CAMP CAMS CANE CANG CANN CANS CANT CANY CAPA CAPE CAPH CAPI CAPO CAPS CARB CARD CARE CARK CARL CARN CARP CARR CARS CART CASA CASE CASH CASK CAST CATE CATS CAUF CAUK CAUL CAUM CAUP CAVA CAVE CAVY CAWK CAWS CAYS CEAS CECA CEDE CEDI CEES CEIL CELL CELS CELT CENS CENT CEPE CEPS CERE CERO CERT CESS CETE CHAD CHAI CHAL CHAM CHAO CHAP CHAR CHAS CHAT CHAV CHAW CHAY CHEF CHER CHEW CHEZ CHIA CHIB CHIC CHID CHIK CHIN CHIP CHIS CHIT CHIV CHIZ CHOC CHOG CHON CHOP CHOU CHOW CHUB CHUG CHUM CHUT CIAO CIDE CIDS CIEL CIGS CILL CINE CION CIRE CIRL CIST CITE CITO CITS CITY CIVE CLAD CLAG CLAM CLAN CLAP CLAT CLAW CLAY CLEF CLEG CLEM CLEW CLIP CLOD CLOG CLON CLOP CLOT CLOU CLOW CLOY CLUB CLUE COAL COAT COAX COBB COBS COCA COCH COCK COCO CODA CODE CODS COED COFF COFT COGS COHO COIF COIL COIN COIR COIT COKE COKY COLA COLD COLE COLL COLS COLT COLY COMA COMB COME COMM COMP COMS COND CONE CONF CONI CONK CONN CONS CONY COOF COOK COOL COOM COON COOP COOS COOT COPE COPS COPY CORD CORE CORF CORK CORM CORN CORS CORY COSE COSH COSS COST COSY COTE COTH COTS COTT COUP COUR COVE COWK COWL COWP COWS COWY COXA COXY COYS COZE COZY CRAB CRAG CRAM CRAN CRAP CRAW CRAY CRED CREE CREM CREW CRIB CRIM CRIS CRIT CROC CROG CROP CROW CRUD CRUE CRUS CRUX CUBE CUBS CUDS CUED CUES CUFF CUIF CUIT CUKE CULL CULM CULT CUNT CUPS CURB CURD CURE CURF CURL CURN CURR CURS CURT CUSH CUSK CUSP CUSS CUTE CUTS CWMS CYAN CYMA CYME CYST CYTE CZAR DABS DACE DACK DADA DADO DADS DAES DAFF DAFT DAGO DAGS DAHL DAHS DAIS DAKS DALE DALI DALS DALT DAME DAMN DAMP DAMS DANG DANK DANS DANT DAPS DARB DARE DARG DARI DARK DARN DART DASH DATA DATE DATO DAUB DAUD DAUR DAUT DAVY DAWD DAWK DAWN DAWS DAWT DAYS DAZE DEAD DEAF DEAL DEAN DEAR DEAW DEBE DEBS DEBT DECK DECO DEED DEEK DEEM DEEN DEEP DEER DEES DEET DEEV DEFI DEFT DEFY DEGS DEID DEIF DEIL DEKE DELE DELF DELI DELL DELO DELS DELT DEME DEMO DEMY DENE DENI";

        String[] wordsArray = words.split(" ");
        int randomNumber = (int) (Math.random() * wordsArray.length);

        correctWord = wordsArray[randomNumber];
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
        totalPoints++;

        clearScreen();
        setRandomWord();
    }

    public void gameOverLose() {
        Intent gameOverIntent = new Intent(this, GameOverActivity.class);

        gameOverIntent.putExtra("points", totalPoints);

        startActivity(gameOverIntent);

        finish();
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
