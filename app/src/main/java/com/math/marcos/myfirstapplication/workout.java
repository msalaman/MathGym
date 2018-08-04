package com.math.marcos.myfirstapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



/**
 * Created by Marcos on 2/8/2016.
 */
public class workout extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout);

    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.workout_start) {
            Intent i = new Intent(workout.this, workout_q1.class);
            startActivity(i);
        }
    }
}
