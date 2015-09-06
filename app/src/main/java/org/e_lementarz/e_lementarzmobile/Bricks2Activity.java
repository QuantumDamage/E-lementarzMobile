package org.e_lementarz.e_lementarzmobile;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Bricks2Activity extends AppCompatActivity {

    private Button b1, b2, b3, b4, rand;
    private TextView result;
    private final String goodResult = " 1 2 3 4 5 6 7 8 9 10";
    private Chronometer chronometer;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bricks2);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        rand = (Button) findViewById(R.id.randBtn);
        result = (TextView) findViewById(R.id.resultTV);
        result.setText("");
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        generateNumber();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bricks2, menu);
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

    public void btnClick(View view) {
        String str = "";
        switch (view.getId()) {
            case R.id.b1:
                str = b1.getText().toString();
                break;
            case R.id.b2:
                str = b2.getText().toString();
                break;
            case R.id.b3:
                str = b3.getText().toString();
                break;
            case R.id.b4:
                str = b4.getText().toString();
                break;
        }
        if(!str.equals("")&&checkValue(result.getText()+" "+str))
        {
            result.setText(result.getText()+" " + str);
        }
        else if(!str.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Try another number", Toast.LENGTH_SHORT).show();
        }
        generateNumber();
    }

    private void generateNumber()
    {
        b1.setText(random.nextInt(10)+1+"");
        b2.setText(random.nextInt(10)+1+"");
        b3.setText(random.nextInt(10)+1+"");
        b4.setText(random.nextInt(10)+1+"");
    }

    private boolean checkValue(String candidate)
    {
        boolean result;
        if(goodResult.startsWith(candidate)) {
            result = true;
            if(candidate.length()>18&&candidate.endsWith("1")) {
                result = false;
            }
        }
        else {
            result = false;
        }
        if(candidate.equals(goodResult))
        {
            chronometer.stop();
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            rand.setEnabled(false);
            Toast.makeText(getApplicationContext(), "Good job! :)", Toast.LENGTH_LONG).show();
        }
        return result;
    }
}
