package com.math.marcos.myfirstapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


/**
 * Created by Marcos on 2/8/2016.
 */
public class mdash_finished extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int seconds = bundle.getInt("seconds");
        int seconds2 = bundle.getInt("seconds2");
        int seconds3 = bundle.getInt("seconds3");
        int seconds4 = bundle.getInt("seconds4");
        int seconds5 = bundle.getInt("seconds5");
        int seconds6 = bundle.getInt("seconds6");
        int seconds7 = bundle.getInt("seconds7");
        int seconds8 = bundle.getInt("seconds8");
        int seconds9 = bundle.getInt("seconds9");
        int seconds10 = bundle.getInt("second10");
        int total = seconds + seconds10 + seconds2 + seconds3 + seconds4 + seconds5 + seconds6 + seconds7 + seconds8 + seconds9;
        total = total/1000;
        setContentView(R.layout.mdash_finished);
        TextView textElement = (TextView) findViewById(R.id.textView6);

        String modifyText;
        modifyText = "Time " + total + " seconds";
        textElement.setText(modifyText);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.mdash_menu) {
            Intent i = new Intent(mdash_finished.this, MainActivity.class);
            startActivity(i);
        }
    }
}
