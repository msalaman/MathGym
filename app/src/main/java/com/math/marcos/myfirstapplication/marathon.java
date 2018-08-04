package com.math.marcos.myfirstapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



/**
 * Created by Marcos on 12/31/2015.
 */
public class marathon extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marathon);

    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.workout_start) {
            int level = 1;
            Intent i = new Intent(marathon.this, marathon_q1.class);
            i.putExtra("level", level);
            startActivity(i);
        }
    }
}