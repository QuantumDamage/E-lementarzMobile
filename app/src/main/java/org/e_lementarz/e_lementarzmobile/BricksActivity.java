package org.e_lementarz.e_lementarzmobile;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class BricksActivity extends AppCompatActivity {

    ScrollView sv;
    LinearLayout  ll;
    LinearLayout.LayoutParams layoutParams;
    Animation animFadeIn;
    Button add;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bricks);
        add = (Button)findViewById(R.id.addBtn);
        sv = (ScrollView) findViewById(R.id.scrollView);
        ll = (LinearLayout) findViewById(R.id.ll);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        layoutParams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        add.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                TextView view = new TextView(BricksActivity.this);
                view.setText(++i + "");
                view.setTextSize(25);
                view.setWidth(500);
                if(i%2==0)
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                else
                    view.setBackgroundColor(getResources().getColor(R.color.blue));
                ll.addView(view, layoutParams);
                view.startAnimation(animFadeIn);
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(200);
            }

        });
    }

}
