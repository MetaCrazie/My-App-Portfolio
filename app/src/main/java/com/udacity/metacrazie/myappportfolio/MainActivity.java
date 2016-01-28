package com.udacity.metacrazie.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Developed by Pratyusha Maiti",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    public void displayToastMsg1(View v) {

        toastMsg("This button will launch Spotify Streamer!");

    }
    public void displayToastMsg2(View v) {

        toastMsg("This button will launch Scores app!");

    }
    public void displayToastMsg3(View v) {

        toastMsg("This button will launch Library app!");

    }
    public void displayToastMsg4(View v) {

        toastMsg("This button will launch Built it Bigger!");

    }
    public void displayToastMsg5(View v) {

        toastMsg("This button will launch XYZ Reader!");

    }
    public void displayToastMsg6(View v) {

        toastMsg("This button will launch my capstone app!");

    }
}
