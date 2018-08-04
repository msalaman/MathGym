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
public class mdash_q1 extends Activity{
    Random r = new Random();
    int a = r.nextInt(500 - 100) + 100;
    int b = r.nextInt(1000 - 500) + 500;
    int c = b - a;
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
        modifyText = "10th " + modifyText;
        textElement.setText(modifyText);
        TextView textElement2 = (TextView) findViewById(R.id.equation);

        String modifyText2;

        modifyText2 = b + " - " + a;
        textElement2.setText(modifyText2);



    }




    private EditText useranswer;
   public void onButtonClick(View v) {
       if (v.getId() == R.id.menu) {
           Intent i = new Intent(mdash_q1.this, MainActivity.class);
           startActivity(i);
       }
       if (v.getId() == R.id.submit) {

           useranswer = (EditText) findViewById(R.id.answer);

           String useranswers=useranswer.getText().toString();
           int useranswerss = Integer.parseInt(useranswers);
           if (useranswerss == c) {
               long elapsedtime = SystemClock.elapsedRealtime() - chronometer.getBase();
               int seconds = (int)(elapsedtime);
               Intent b = new Intent(mdash_q1.this, mdash_q2.class);
               b.putExtra("seconds", seconds);
               startActivity(b);}


           }

       }

   }
/*


             useranswer = (EditText) findViewById(R.id.answer);

            String useranswers=useranswer.getText().toString();
           int useranswerss = Integer.parseInt(useranswers);
            if (useranswerss == c){
                useranswer.setText("");
                int a = r.nextInt(400 - 100) + 100;
                int b = r.nextInt(900 - 500) + 500;
                int c = b + a;
                TextView textElement = (TextView) findViewById(R.id.meter_Count);

                String modifyText;

                modifyText = "20th meter";
                textElement.setText(modifyText);
                TextView textElement2 = (TextView) findViewById(R.id.equation);

                String modifyText2;

                modifyText2 = b + " + " + a;
                textElement2.setText(modifyText2);
                if (v.getId() == R.id.submit){

                    useranswer = (EditText) findViewById(R.id.answer);
                     useranswers=useranswer.getText().toString();
                     useranswerss = Integer.parseInt(useranswers);
                    if (useranswerss == c){

                        useranswer.setText("");
                         a = r.nextInt(400 - 100) + 100;
                         b = r.nextInt(900 - 500) + 500;
                         c = b + a;
                        TextView textElement0 = (TextView) findViewById(R.id.meter_Count);

                        String modifyText0;

                        modifyText0 = "30th meter";
                        textElement0.setText(modifyText0);
                        TextView textElement3 = (TextView) findViewById(R.id.equation);

                        String modifyText3;

                        modifyText3 = b + " + " + a;
                        textElement3.setText(modifyText3);
                }
            }}
                /*
                long elapsedtime = SystemClock.elapsedRealtime() - chronometer.getBase();
                int seconds = (int)(elapsedtime);
               Intent b = new Intent(mdash_q1.this, mdash_q2.class);
                b.putExtra("seconds", seconds);
                startActivity(b);}*/








