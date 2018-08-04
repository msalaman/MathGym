package com.math.marcos.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Marcos on 2/28/2016.
 */

public class marathon_finished extends Activity{











    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marathon_finished);


        Bundle bundle = getIntent().getExtras();
        int level = bundle.getInt("level");
        int c = bundle.getInt("c");
        TextView textElement0 = (TextView) findViewById(R.id.congrats);

        String modifyText0;
        if (level < 20) {
            if (level < 10) {

                modifyText0 = "You'll do better next time";
            } else {
                modifyText0 = "Good Job!";
            }
        }
        else {
            modifyText0 = "Amazing!";
        }






        textElement0.setText(modifyText0);
        level --;
        TextView textElement = (TextView) findViewById(R.id.textView3);

        String modifyText;
        modifyText = "You answered " + level + " questions correctly";
        textElement.setText(modifyText);
        level ++;
        TextView textElement2 = (TextView) findViewById(R.id.textView2);

        String modifyText2;

        modifyText2 = "The answer to Question " + level + " was " + c;
        textElement2.setText(modifyText2);

    }




    private EditText useranswer;

    public void onButtonClick(View v) {
        if (v.getId() == R.id.mdash_menu) {
            Intent i = new Intent(marathon_finished.this, MainActivity.class);
            startActivity(i);
        }
    }}
