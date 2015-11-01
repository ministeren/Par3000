package ministeren.par3000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newRound = (Button) findViewById(R.id.ny);
        Button history = (Button) findViewById(R.id.hist);

        newRound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, LinksLayout.class));
                //ArrayList score = new ArrayList(10);
                String scoreKort[] = new String[10];
                Intent i = new Intent(getApplicationContext(), LinksLayout.class);
                i.putExtra("scoreKort",scoreKort);
                i.putExtra("startetAf","main");
                startActivity(i);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
