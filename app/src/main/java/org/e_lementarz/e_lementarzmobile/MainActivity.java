package org.e_lementarz.e_lementarzmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.analytics.HitBuilders;


public class MainActivity extends ActionBarActivity {



    public void startQA1 (View view) {
        Intent intent = new Intent(MainActivity.this, QA1Activity.class);
        startActivity(intent);
    }

    public void startVideo(View view) {
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            MyApp.tracker().send(new HitBuilders.EventBuilder("ui", "open")
                    .setLabel("settings")
                    .build());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void bricksClick(View view) {
        Intent intent = new Intent(MainActivity.this, BricksActivity.class);
        startActivity(intent);
    }
}
