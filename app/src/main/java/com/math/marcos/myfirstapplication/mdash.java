package com.math.marcos.myfirstapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;



/**
 * Created by Marcos on 2/8/2016.
 */
public class mdash extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mdash);

    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.workout_start) {
            Intent i = new Intent(mdash.this, mdash_q1.class);
            startActivity(i);
        }
    }
}
