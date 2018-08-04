package com.math.marcos.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by Marcos on 2/28/2016.
 */

public class marathon_q3 extends Activity{
    Random r = new Random();
    int a = r.nextInt(100 - 10) + 10;
    int b = r.nextInt(10 - 2) + 2;
    int c = b * a;








    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marathon_q1);
        Bundle bundle = getIntent().getExtras();
        int level = bundle.getInt("level");
        TextView textElement = (TextView) findViewById(R.id.meter_Count);

        String modifyText;
        modifyText = textElement.getText().toString();
        modifyText =  modifyText + " " + level;
        textElement.setText(modifyText);

        TextView textElement2 = (TextView) findViewById(R.id.equation);

        String modifyText2;

        modifyText2 = a + " * " + b;
        textElement2.setText(modifyText2);

    }




    private EditText useranswer;

    public void onButtonClick(View v) {
        Bundle bundle = getIntent().getExtras();
        if (v.getId() == R.id.menu) {
            Intent i = new Intent(marathon_q3.this, MainActivity.class);
            startActivity(i);}
        int level = bundle.getInt("level");
        if (v.getId() == R.id.submit) {

            useranswer = (EditText) findViewById(R.id.answer);

            String useranswers=useranswer.getText().toString();
            int useranswerss = Integer.parseInt(useranswers);
            if (useranswerss == c){
                level ++;
                Intent b = new Intent(marathon_q3.this, marathon_q4.class);
                b.putExtra("level", level);
                startActivity(b);}


            else {
                Intent b = new Intent(marathon_q3.this, marathon_finished.class);
                b.putExtra("level", level);
                b.putExtra("c", c);
                startActivity(b);}
        }


        }
    }

