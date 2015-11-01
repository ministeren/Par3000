package ministeren.par3000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextClock;
import android.view.View;
import android.graphics.Color;
import android.util.Log;

public class LinksLayout extends AppCompatActivity{

    String[] scoreKort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links_layout);
        TextClock ur = (TextClock) findViewById(R.id.showDate);
        ur.setFormat24Hour("HH:mm - dd/MM/yyyy");

        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getString("startetAf").equalsIgnoreCase("main")) {
            scoreKort = extras.getStringArray("scoreKort");
            scoreKort[0]= (String) ur.getText();
        }

        ImageView linkstouch = (ImageView) findViewById(R.id.linkstouch);
        //ImageView links = (ImageView) findViewById(R.id.links);
        linkstouch.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                final int action = event.getAction();
                final int evX = (int) event.getX();
                final int evY = (int) event.getY();
                if (action == MotionEvent.ACTION_DOWN) {
                    int touchColor = getHotspotColor(R.id.linkstouch, evX, evY);
                    int tolerance = 25;
                    closeMatch(touchColor, tolerance);
                }
                return false;
            }
        });
    }

    public int getHotspotColor (int hotspotId, int x, int y) {
        ImageView img = (ImageView) findViewById (hotspotId);
        img.setDrawingCacheEnabled(true);
        Bitmap hotspots = Bitmap.createBitmap(img.getDrawingCache());
        img.setDrawingCacheEnabled(false);
        return hotspots.getPixel(x, y);
    }

    public void closeMatch(int color, int tolerance) {
        if (Math.abs (Color.GREEN - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleOne.class));
            Intent i = new Intent(LinksLayout.this, HoleOne.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.DKGRAY - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleTwo.class));
            Intent i = new Intent(LinksLayout.this, HoleTwo.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.CYAN - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleThree.class));
            Intent i = new Intent(LinksLayout.this, HoleThree.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.MAGENTA - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleFour.class));
            Intent i = new Intent(LinksLayout.this, HoleFour.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.LTGRAY - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleFive.class));
            Intent i = new Intent(LinksLayout.this, HoleFive.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.YELLOW - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleSix.class));
            Intent i = new Intent(LinksLayout.this, HoleSix.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.RED - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleSeven.class));
            Intent i = new Intent(LinksLayout.this, HoleSeven.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.GRAY - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleEight.class));
            Intent i = new Intent(LinksLayout.this, HoleEight.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        } else if (Math.abs (Color.BLUE - color) < tolerance ){
            //startActivity(new Intent(LinksLayout.this, HoleNine.class));
            Intent i = new Intent(LinksLayout.this, HoleNine.class);
            i.putExtra("scoreKort",scoreKort);
            i.putExtra("startetAf","linksLayout");
            startActivity(i);
        }
    }
}
