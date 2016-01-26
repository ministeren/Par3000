package ministeren.par3000;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button newRound, history, cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newRound = (Button) findViewById(R.id.ny);
        history = (Button) findViewById(R.id.hist);
        cont = (Button) findViewById(R.id.cont);

        newRound.setOnClickListener(this);
        history.setOnClickListener(this);
        cont.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==newRound){
            Intent i = new Intent(getApplicationContext(), LinksLayout.class);
            SingleTon.scoreListe  = new int[9];
            SingleTon.aktueltHul = 0;
            startActivity(i);
        }

        if (v==history){

        }

        if (v==cont){
            if (SingleTon.scoreListe==null){
                Toast.makeText(v.getContext(),"Der er ingen iganværende runde",Toast.LENGTH_LONG).show();
            } else {
                Intent i = new Intent(getApplicationContext(), Hole.class);
                startActivity(i);
            }
        }

    }
}
