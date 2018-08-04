package com.math.marcos.myfirstapplication;
import java.util.Random;
import java.lang.String;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.content.Intent;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Marcos on 2/28/2016.
 */
public class mdash_q4 extends Activity {
    Random r = new Random();
    int a = r.nextInt(100 - 10) + 10;
    int b = r.nextInt(10 - 2) + 2;
    int d = a * b;
    int c = a;

    public Chronometer chronometer;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mdash_q1);
        chronometer = (Chronometer)findViewById(R.id.chronometer);
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        TextView textElement = (TextView) findViewById(R.id.meter_Count);

        String modifyText;
        modifyText = textElement.getText().toString();
        modifyText = "40th " + modifyText;
        textElement.setText(modifyText);
        TextView textElement2 = (TextView) findViewById(R.id.equation);

        String modifyText2;

        modifyText2 = d + " / " + b;
        textElement2.setText(modifyText2);
    }
    private EditText useranswer;
    public void onButtonClick(View v) {
        Bundle bundle = getIntent().getExtras();
        int seconds = bundle.getInt("seconds");
        int seconds2 = bundle.getInt("seconds2");
        int seconds3 = bundle.getInt("seconds3");
        if (v.getId() == R.id.menu) {
            Intent i = new Intent(mdash_q4.this, MainActivity.class);
            startActivity(i);}
        if (v.getId() == R.id.submit) {

            useranswer = (EditText) findViewById(R.id.answer);

            String useranswers=useranswer.getText().toString();
            int useranswerss = Integer.parseInt(useranswers);
            if (useranswerss == c) {
                long elapsedtime = SystemClock.elapsedRealtime() - chronometer.getBase();
                int seconds4 = (int)(elapsedtime);
                Intent i = new Intent(mdash_q4.this, mdash_q5.class);
                i.putExtra("seconds", seconds);
                i.putExtra("seconds2", seconds2);
                i.putExtra("seconds3", seconds3);
                i.putExtra("seconds4", seconds4);
                startActivity(i);

            }

        }



    }

}
