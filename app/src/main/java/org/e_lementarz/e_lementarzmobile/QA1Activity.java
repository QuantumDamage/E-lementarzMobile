package org.e_lementarz.e_lementarzmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class QA1Activity extends ActionBarActivity {

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int quizPack = randInt(1, 4);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_qa1);

        TextView testText = (TextView) findViewById(R.id.testField);

        TextView question = (TextView) findViewById(R.id.Question);
        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);
        Button button3 = (Button) findViewById(R.id.Button3);
        Button button4 = (Button) findViewById(R.id.Button4);

        int questionText = getResources().getIdentifier("Question" + quizPack, "string", getPackageName());
        int goodAnswer = getResources().getIdentifier("button" + quizPack + "True", "string", getPackageName());
        int badAnswer1 = getResources().getIdentifier("button" + quizPack + "False1", "string", getPackageName());
        int badAnswer2 = getResources().getIdentifier("button" + quizPack + "False2", "string", getPackageName());
        int badAnswer3 = getResources().getIdentifier("button" + quizPack + "False3", "string", getPackageName());

        question.setText(getString(questionText));
        testText.setText("Wybrałeś " + quizPack + " zestaw");
        button3.setText(getString(goodAnswer));
        button1.setText(getString(badAnswer1));
        button2.setText(getString(badAnswer2));
        button4.setText(getString(badAnswer3));


    }
    public void onClick2003 (View view)
    {
        Toast.makeText(this, getString(R.string.wrong), Toast.LENGTH_SHORT).show();
    }
    public void onClick2004 (View view)
    {
        Toast.makeText(this, getString(R.string.wrong), Toast.LENGTH_SHORT).show();
    }
    public void onClick2005 (View view)
    {
        Toast.makeText(this, getString(R.string.good), Toast.LENGTH_SHORT).show();
    }
    public void onClick2006 (View view)
    {
        Toast.makeText(this, getString(R.string.wrong), Toast.LENGTH_SHORT).show();
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
