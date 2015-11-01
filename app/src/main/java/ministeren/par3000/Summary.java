package ministeren.par3000;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Summary extends AppCompatActivity {

    String[] scoreKort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Log.i("summary","summary startet");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            scoreKort = extras.getStringArray("scoreKort");
        }
        Log.i("summary","scoreKort hentet");
        String[] hulOversigt = new String[9];
        hulOversigt[0] = "1";
        hulOversigt[1] = "2";
        hulOversigt[2] = "3";
        hulOversigt[3] = "4";
        hulOversigt[4] = "5";
        hulOversigt[5] = "6";
        hulOversigt[6] = "7";
        hulOversigt[7] = "8";
        hulOversigt[8] = "9";

        String[] scoreKortShort = new String[9];
        scoreKortShort[0] = scoreKort[1];
        scoreKortShort[1] = scoreKort[2];
        scoreKortShort[2] = scoreKort[3];
        scoreKortShort[3] = scoreKort[4];
        scoreKortShort[4] = scoreKort[5];
        scoreKortShort[5] = scoreKort[6];
        scoreKortShort[6] = scoreKort[7];
        scoreKortShort[7] = scoreKort[8];
        scoreKortShort[8] = scoreKort[9];


        Log.i("summary","scoreKortShort oprettet");
        GridView hullerView = (GridView) findViewById(R.id.huller);
        GridView scoreView = (GridView) findViewById(R.id.scoreView);

        Log.i("summary","gridview hentet");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, hulOversigt);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, scoreKortShort);
        Log.i("summary", "adapter oprettet");
        hullerView.setAdapter(adapter);
        scoreView.setAdapter(adapter2);
        Log.i("summary", "adapter sat");
    }
}
