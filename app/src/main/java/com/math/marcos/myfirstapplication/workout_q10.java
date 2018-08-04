package com.math.marcos.myfirstapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


/**
 * Created by Marcos on 2/28/2016.
 */

public class workout_q10 extends Activity{
    Random r = new Random();
    int a = r.nextInt(99 - 10) + 10;
    int b = r.nextInt(99 - 10) + 10;
    int d = r.nextInt(10 - 1) + 1;
    int e = r.nextInt(10 - 1) + 1;
    int c = b + a - d * e;








    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_q1);


        TextView textElement2 = (TextView) findViewById(R.id.equation);

        String modifyText2;

        modifyText2 =  b + " + " + a + " - " + d + " * " + e;
        textElement2.setText(modifyText2);

    }




    private EditText useranswer;

    public void onButtonClick(View v) {
        if (v.getId() == R.id.NextQuestion) {
            Intent b = new Intent(workout_q10.this, workout_q1.class);
            startActivity(b);
        }
        if (v.getId() == R.id.menu) {
            Intent b = new Intent(workout_q10.this, MainActivity.class);
            startActivity(b);
        }
        if (v.getId() == R.id.check) {

            Context context = getApplicationContext();
            String answer = String.valueOf(c);
            CharSequence text = answer;
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

}

