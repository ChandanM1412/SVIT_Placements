package com.chandan.placement;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    TextView ac, ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ac = findViewById(R.id.ac);
        ad = findViewById(R.id.ad);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(About.this, MainActivity.class);
        startActivity(i);
    }

    public void AboutClicked(View view) {
        ac.setMovementMethod(LinkMovementMethod.getInstance());
        ad.setMovementMethod(LinkMovementMethod.getInstance());

    }
}