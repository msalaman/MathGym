package com.math.marcos.myfirstapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
  /*  public void onButtonClick(View v) {
        if (v.getId() == R.id.marathonButton)
        {
            Intent i = new Intent(MainActivity.this, marathon.class);
            startActivity(i);
        }
        if (v.getId() == R.id.dashButton)
        {
            Intent i = new Intent(MainActivity.this, mdash.class);
            startActivity(i);
        }
        if (v.getId() == R.id.workoutButton)
        {
            Intent i = new Intent(MainActivity.this, workout.class);
            startActivity(i);
        }
        if (v.getId() == R.id.aboutButton)
        {
            Intent i = new Intent(MainActivity.this, about.class);
            startActivity(i);
        }
    }
    */
  public void onButtonClick(View view)
  {
      switch(view.getId())
      {
          case R.id.marathonButton:
              Intent i = new Intent(MainActivity.this, marathon.class);
              startActivity(i);
              break;

          case R.id.dashButton:
              Intent b = new Intent(MainActivity.this, mdash.class);
              startActivity(b);
              break;

          case R.id.workoutButton:
              Intent c = new Intent(MainActivity.this, workout.class);
              startActivity(c);
              break;
          case R.id.aboutButton:
              Intent d = new Intent(MainActivity.this, about.class);
              startActivity(d);
              break;
      }
  }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
