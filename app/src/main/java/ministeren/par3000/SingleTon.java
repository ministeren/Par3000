package ministeren.par3000;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 26-01-2016.
 */
public class SingleTon extends Application{
    private static SingleTon ourInstance = new SingleTon();

    public static int[] scoreListe;
    public static int aktueltHul;


    @Override
    public void onCreate(){
        super.onCreate();


    }

    public static SingleTon getInstance() {
        return ourInstance;
    }

}
