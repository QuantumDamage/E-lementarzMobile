package org.e_lementarz.e_lementarzmobile;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class QA1Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_qa1);
    }
    public void onClick2003 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    public void onClick2004 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    public void onClick2005 (View view)
    {
        Toast.makeText(this, "Yes! Well done", Toast.LENGTH_SHORT).show();
    }
    public void onClick2006 (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_qa1, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
