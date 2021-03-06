package ministeren.par3000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HoleOne extends AppCompatActivity implements View.OnClickListener{

    Button stroke1,stroke2,stroke3,stroke4,stroke5,stroke6,stroke7,stroke8;
    TextView score;
    String[] scoreKort;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hole_one);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            scoreKort = extras.getStringArray("scoreKort");
        }

        Button back = (Button) findViewById(R.id.back);
        Button home = (Button) findViewById(R.id.home);
        Button next = (Button) findViewById(R.id.next);

        stroke1 = (Button) findViewById(R.id.stroke1);
        stroke2 = (Button) findViewById(R.id.stroke2);
        stroke3 = (Button) findViewById(R.id.stroke3);
        stroke4 = (Button) findViewById(R.id.stroke4);
        stroke5 = (Button) findViewById(R.id.stroke5);
        stroke6 = (Button) findViewById(R.id.stroke6);
        stroke7 = (Button) findViewById(R.id.stroke7);
        stroke8 = (Button) findViewById(R.id.stroke8);

        score = (TextView) findViewById(R.id.score);

        back.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
            //startActivity(new Intent(HoleOne.this, LinksLayout.class));
            Intent i = new Intent(HoleOne.this, LinksLayout.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","holeOne");
            startActivity(i);
        }});

        home.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
            //startActivity(new Intent(HoleOne.this, MainActivity.class));
            Intent i = new Intent(HoleOne.this, MainActivity.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","holeOne");
            startActivity(i);
        }});

        next.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {
            //startActivity(new Intent(HoleOne.this, HoleTwo.class));
//            Intent i = new Intent(HoleOne.this, HoleTwo.class);
//            i.putExtra("scoreKort",scoreKort);
//            i.putExtra("startetAf","holeOne");
//            startActivity(i);
        }});

        stroke1.setOnClickListener(this);
        stroke2.setOnClickListener(this);
        stroke3.setOnClickListener(this);
        stroke4.setOnClickListener(this);
        stroke5.setOnClickListener(this);
        stroke6.setOnClickListener(this);
        stroke7.setOnClickListener(this);
        stroke8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == stroke1){score.setText("1");scoreKort[1]="1";}
        if(v == stroke2){score.setText("2");scoreKort[1]="2";}
        if(v == stroke3){score.setText("3");scoreKort[1]="3";}
        if(v == stroke4){score.setText("4");scoreKort[1]="4";}
        if(v == stroke5){score.setText("5");scoreKort[1]="5";}
        if(v == stroke6){score.setText("6");scoreKort[1]="6";}
        if(v == stroke7){score.setText("7");scoreKort[1]="7";}
        if(v == stroke8){score.setText("8");scoreKort[1]="8";}
    }
}
