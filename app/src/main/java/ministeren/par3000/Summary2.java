package ministeren.par3000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary2 extends AppCompatActivity {

    TextView sumhul1,sumhul2,sumhul3,sumhul4,sumhul5,sumhul6,sumhul7,sumhul8,sumhul9,resultat;
//    String[] scoreKort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary2);

        Button back = (Button) findViewById(R.id.back);
        Button home = (Button) findViewById(R.id.home);

        back.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
            //startActivity(new Intent(HoleOne.this, LinksLayout.class));
            Intent i = new Intent(Summary2.this, Hole.class);
//            i.putExtra("scoreKort",scoreKort);
//            i.putExtra("startetAf","holeOne");
            startActivity(i);
        }});

        home.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
            //startActivity(new Intent(HoleOne.this, MainActivity.class));
            Intent i = new Intent(Summary2.this, MainActivity.class);
//            i.putExtra("scoreKort",scoreKort);
//            i.putExtra("startetAf","holeOne");
            startActivity(i);
        }});

        sumhul1 = (TextView) findViewById(R.id.sumHul1);
        sumhul2 = (TextView) findViewById(R.id.sumHul2);
        sumhul3 = (TextView) findViewById(R.id.sumHul3);
        sumhul4 = (TextView) findViewById(R.id.sumHul4);
        sumhul5 = (TextView) findViewById(R.id.sumHul5);
        sumhul6 = (TextView) findViewById(R.id.sumHul6);
        sumhul7 = (TextView) findViewById(R.id.sumHul7);
        sumhul8 = (TextView) findViewById(R.id.sumHul8);
        sumhul9 = (TextView) findViewById(R.id.sumHul9);
        resultat = (TextView) findViewById(R.id.resultat);

//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            scoreKort = extras.getStringArray("scoreKort");
//        }
        sumhul1.setText(""+SingleTon.scoreListe[0]);
        sumhul2.setText(""+SingleTon.scoreListe[1]);
        sumhul3.setText(""+SingleTon.scoreListe[2]);
        sumhul4.setText(""+SingleTon.scoreListe[3]);
        sumhul5.setText(""+SingleTon.scoreListe[4]);
        sumhul6.setText(""+SingleTon.scoreListe[5]);
        sumhul7.setText(""+SingleTon.scoreListe[6]);
        sumhul8.setText(""+SingleTon.scoreListe[7]);
        sumhul9.setText(""+SingleTon.scoreListe[8]);

        int total=0;

        for(int i=0;i<SingleTon.scoreListe.length;i++){
            total = total+SingleTon.scoreListe[i];
        }

        resultat.setText(""+total);
    }
}
